var mysql = require('mysql');
var express = require('express');
var bodyParser = require('body-parser');
var app = express();

app.use(bodyParser.json({extended: true})); 
app.use(bodyParser.urlencoded({extended: true})); 

app.listen(3000, function () {
    console.log('서버 실행2');
});

var connection = mysql.createConnection({
    host: "coin.cmrsblb0ntzt.ap-northeast-2.rds.amazonaws.com",
    user: "root",
    database: "coin",
    password: "w19706538",
    port: 3306
});

app.post('/user/join', function (req, res) {
    var id = req.body.id;
    var nickname = req.body.nickname;
    var mail = req.body.mail;

    var sql = 'INSERT INTO user (id, nickname, mail) VALUES (?, ?, ?)';
    var params = [id, nickname, mail];

    connection.query(sql, params, function (err, result) {
        if (err)
            console.log(err);
        else {
            res.json({
                result: true,
                msg: '회원가입에 성공했습니다.'
            })
        }
    });
});

app.post('/user/info', function (req, res) {
    var id = req.body.id;
    var sql = "select * from user where id = ?";

    connection.query(sql, id, function (err, result) {
        if (err)
            console.log(err);
        else {
            if (result.length == 0) {
                res.json({
                    result: false,
                    msg: '등록되지 않은 회원입니다.'
                })
            } else {
                res.json({
                    result: true,
                    msg: '회원정보확인',
                    id: result[0].id,
                    nickname: result[0].nickname,
                    mail: result[0].mail
                });
            }
        }
    })
});

app.post("/user/update",function(req,res){
    var id = req.body.id
    var nickname = req.body.nickname
    var sql = 'UPDATE user SET nickname = ? WHERE id = ?'
    var params = [nickname,id]

    connection.query(sql,params,function(err, result){
        if(err)
            console.log(err)
        else{
            res.json({
                result:true,
                msg: '닉네임이 변경되었습니다.'
            })
        }
    })
})

app.post('/post/write', function (req, res) {
    var postid = req.body.postid;
    var coin = req.body.coin
    var title = req.body.title;
    var content = req.body.content;
    var nickname = req.body.nickname;
    var id = req.body.id;

    var sql = 'INSERT INTO post (postid, title, content, nickname, id, coin) VALUES (?, ?, ?, ?, ?, ?)';
    var params = [postid, title, content, nickname, id, coin];

    connection.query(sql, params, function (err, result) {
        if (err)
            res.json({
                result: false,
                msg: '글쓰기에 실패했습니다.'
            })
        else {
            res.json({
                result: true,
                msg: '글쓰기에 성공했습니다.'
            })
        }
    });
});

app.post('/post/getlist', function (req, res) {
    var coin = req.body.coin
    var sql = 'SELECT * FROM post WHERE coin = ? ORDER BY createdat DESC';
   
    connection.query(sql, coin, function (err, result) {
        if (err){
            console.log(err);
        }
        else {
          res.json({result})
        }
    });
});

app.post('/post', function (req, res) {
    var postid = req.body.postid
    var sql = 'SELECT * FROM post WHERE postid = ?';
   
    connection.query(sql, postid, function (err, result) {
        if (err){
            console.log(err);
        }else if(result.length === 0){
    
        }
        else {
            var post = result[0]
            res.json(post)
        }
    });
});

app.post('/post/search', function (req, res) {
    var coin = req.body.coin
    var keyword = req.body.keyword;

    var sql = 'SELECT * FROM post WHERE coin = ? AND (content LIKE %?% OR title LIKE %?% OR nickname LIKE %?%) ORDER BY createdat DESC';
    var params = [coin, keyword, keyword, keyword, keyword];

    connection.query(sql, params, function (err, result) {
        if (err){
            console.log(err);
        }else if(result.length === 0){
            res.json({
                msg:"찾는 게시물이 없습니다."
            })
        }
        else {
          res.json({result})
        }
    });
});

app.post('/post/mypost', function (req, res) {
    var id = req.body.id;
    var sql = 'SELECT * FROM post WHERE id = ? ORDER BY createdat DESC';
   
    connection.query(sql, id, function (err, result) {
        if (err){
            console.log(err);
        }else if(result.length === 0){
    
        }
        else {
          res.json({result})
        }
    });
});

app.post('/post/delete', function (req, res) {
    var postid = req.body.postid;
    var postsql = 'DELETE FROM post WHERE postid = ?';
    var commentsql = 'DELETE FROM comment WHERE postid = ?';

    query(postsql,postid)
        .then(result => {
            return query(commentsql,postid)
    })
    .then(result => {
        res.json({
            msg:"제거되었습니다."
        })
    })
    .catch(err => {

    })
});

app.post('/comment/getlist', function(req, res) {
    var postid = req.body.postid;
    var sql = 'SELECT * FROM comment WHERE postid = ? ORDER BY createdat DESC';

    connection.query(sql,postid,function(err, result){
        if(err){
            console.log(err)
        }else{
            res.json({result})
        }
    });
});

app.post('/comment/write', function(req, res) {
    var commentid = req.body.commentid;
    var nickname = req.body.nickname;
    var content = req.body.content;
    var postid = req.body.postid;
    var pselect_sql = 'SELECT commentnum FROM post WHERE postid = ?'
    var pupdate_sql = 'UPDATE post SET commentnum = ? WHERE postid = ?'
    var cinsert_sql = 'INSERT INTO comment (commentid, nickname, content, postid) VALUES (?, ?, ?, ?)';

    query(pselect_sql,postid) //게시물의 댓글 수 들고와서 +1 한다음 업데이트 시켜줌
    .then(result => {
        var commentnum = result[0].commentnum + 1
        var params = [commentnum,postid];
        return query(pupdate_sql,params)
    })
    .then(result => { //댓글을 insert
        var params = [commentid, nickname, content, postid];
        return query(cinsert_sql,params)
    })
    .then(result => {
        res.json({
            msg: "등록되었습니다."
        })
    })
    .catch(err => {

    })
    
});

function query(sql, args){
    return new Promise((resolve,reject) => {
        connection.query(sql,args, (err, result) => {
            if(err)
                return reject(err)
            resolve(result)
        })
    })
}

function close(){
    return new Promise((resolve,reject) => {
        connection.end(err => {
            if(err)
                return reject(err)
            resolve()
        })
    })
}

