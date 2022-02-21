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

    query(sql,params)
    .then(result => {
        res.json({
            result: true,
            msg: '회원가입에 성공했습니다.',
            id: id,
            nickname: nickname,
            mail:mail
        })
    })
    .catch(err => {
        res.json(err)
    })
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
    var keyword = "%" + req.body.keyword + "%"

    var sql = 'SELECT * FROM post WHERE coin = ? AND (content LIKE ? OR title LIKE ? OR nickname LIKE ?) ORDER BY createdat DESC';
    var params = [coin, keyword, keyword, keyword, keyword];

    query(sql,params)
    .then(result => {
        if(result.length === 0)
            res.json({
                msg:"찾는 게시물이 없습니다."
            })
        else
            res.json({result})
    })
    .catch(err => {
        res.json(err)
    })
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
    var love_sql = 'DELETE FROM love WHERE loveid = ?'

    query(postsql,postid) //post제거
        .then(result => {
            return query(commentsql,postid)
    })
    .then(result => { //comment 제거
        return query(love_sql,postid)
    })
    .then(result => {//love 제거
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
        res.json(err)
    })
    
});

app.post('/love', function(req,res) { //love에 중복이 있ㄷ면 진행안하고 없없으으면 love insert -> c or p update
    var loveid = req.body.loveid
    var id = req.body.id
    var ispost = req.body.ispost
    var check_sql =  "SELECT EXISTS(SELECT * FROM love WHERE loveid = ? AND id = ? AND ispost = ? ) as exist";
    var params = [loveid, id, ispost]

    query(check_sql,params)
    .then(result => {
        if(result[0].exist == 1){
            res.json({
                msg: "이미 좋아요를 눌렀습니다."
            })
            return
        }else{
            uplove(loveid,id,ispost,res)
        }
    })
})

function uplove(loveid,id,ispost,res){

    var insert_sql = 'INSERT INTO love (loveid, id, ispost) VALUES (?, ?, ?)'
    var post_sql = 'SELECT love FROM post WHERE postid = ?'
    var comment_sql = 'SELECT love FROM comment WHERE commentid = ?'
    var updatePost_sql = 'UPDATE post SET love = ? WHERE postid = ?'
    var updateComment_sql = 'UPDATE comment SET love = ? WHERE commentid = ?'

    var insert_params = [loveid, id, ispost]

    query(insert_sql,insert_params)
    .then(result => { //love에 데이터 집어넣고,
        console.log(result)
        console.log(ispost)

        if(ispost == 1){ //만약 post라면,,
            return query(post_sql,loveid)
        }else{//만약 comment라면,,
            return query(comment_sql,loveid)
        }
    })
    .then(result => { //해당 (게시물/댓글) 의 love갯수 뽑아내서 +1해주고
        var lovecnt = result[0].love + 1
        var update_params = [lovecnt,loveid]
        
        if(ispost == 1){
            return query(updatePost_sql,update_params)
        }else{  
            return query(updateComment_sql,update_params)
        }
    })
    .then(result => {
        res.json({msg:"좋아요!"})
    })
    .catch(err => {
        res.json(err)
    })
}

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

