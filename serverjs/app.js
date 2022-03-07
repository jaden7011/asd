var mysql = require('mysql');
var express = require('express');
var bodyParser = require('body-parser');
var axios = require('axios')
var admin = require('firebase-admin')
let serviceAccont = require('/home/ubuntu/coinner-cbf34-firebase-adminsdk-acvke-cf5f0674cf.json')
var app = express();

admin.initializeApp({
    credential: admin.credential.cert(serviceAccont)
})

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

setInterval(() => {
    alarm()
},3000)

app.post('/user/alarm/add',function(req,res){
    var price = req.body.price
    var coin = req.body.coin
    var id = req.body.id

    var sql = 'INSERT INTO alarm (price,coin,id) VALUES (?, ?, ?)'
    var params = [price,coin,id]
    query(sql,params)
    .then(result => {
        res.json({
            msg:"등록되었습니다."
        })
    })
    .catch(err => {
        console.log(err)
    })
})

app.post('/user/alarm/delete',function(req,res){
    var price = req.body.price
    var coin = req.body.coin
    var id = req.body.id

    var sql = 'DELETE FROM alarm WHERE price = ? AND coin =? AND id = ?'
    var params = [price,coin,id]

    query(sql,params)
    .then(result => {
        res.json({
            msg:"삭제되었습니다."
        })
    })
    .catch(err => {
        console.log(err)
    })
})

app.post('/user/alarm',function(req,res){
    var id = req.body.id
    var coin = req.body.coin
    var sql = 'SELECT * FROM alarm WHERE id = ? AND coin = ?'
    var params = [id, coin]
    query(sql,params)
    .then(result => {
        res.json({result})
    })
    .catch(err => {
        console.log(err)
    })
})

app.post('/user/join', function (req, res) {
    var id = req.body.id;
    var nickname = req.body.nickname;
    var mail = req.body.mail;
    var token = req.body.token

    var sql = 'INSERT INTO user (id, nickname, mail, token) VALUES (?, ?, ?, ?)';
    var params = [id, nickname, mail, token];

    query(sql,params)
    .then(result => {
        res.json({
            result: true,
            msg: '회원가입에 성공했습니다.',
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
                result[0].result = true
                result[0].msg = "정보확인완료"
                res.json(result[0]);
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

app.post("/user/update/token", (req,res) => {
    var id = req.body.id
    var token = req.body.token
    var sql = 'UPDATE user SET token = ? WHERE id = ?'
    var params = [token,id]

    query(sql,params)
    .then(result => {
        res.json({
            msg:"토큰갱신완료"
        })
    })
    .catch(err => {})
})

app.post('/user/delete',function(req,res){
    var id = req.body.id
    var sql = 'DELETE FROM user WHERE id = ?'

    query(sql,id)
    .then(result => {
        res.json({
            msg:"탈퇴되었습니다."
        })
    })
    .catch(err => {})
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
                issuccess: false,
                msg: '글쓰기에 실패했습니다.'
            })
        else {
            res.json({
                issuccess: true,
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
            res.json({
                msg:"존재하지 않는 게시물입니다.",
                issuccess:false
            })
        }
        else {
            result[0].msg = "게시물을 불러왔습니다."
            result[0].issuccess = true
            res.json(result[0])
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
                issuccess:false,
                msg:"찾는 게시물이 없습니다."
            })
        else
            res.json({
                result:result,
                msg: "게시물을 찾았습니다.",
                issuccess: true
            })
    })
    .catch(err => {
        // res.json(err)
    })
});

app.post('/post/mypost', function (req, res) {
    var id = req.body.id;
    var sql = 'SELECT * FROM post WHERE id = ? ORDER BY createdat DESC';
   
    connection.query(sql, id, function (err, result) {
        if (err){
            console.log(err);
        }else if(result.length === 0){
            res.json({
                issuccess:false,
                msg:"작성한 글이 없습니다."
            })
        }
        else {
            res.json({
                result: result,
                issuccess : true,
                msg: "불러왔습니다."
            })
        }
    });
});

app.post('/post/delete', function (req, res) {
    var postid = req.body.postid;
    var postsql = 'DELETE FROM post WHERE postid = ?';
    var commentsql = 'DELETE FROM comment WHERE postid = ?';
    var psql = 'DELETE FROM plove WHERE postid = ?'
    var csql = 'DELETE FROM clove WHERE postid = ?'

    query(postsql,postid) //post제거
    .then(result => {
        return query(commentsql,postid)
    })
    .then(result => { //comment 제거
        return query(psql,postid)
    })
    .then(result => {
        return query(csql,postid)
    })
    .then(result => {
        res.json({
            msg:"게시물이 삭제되었습니다."
        })
    })
    .catch(err => {})
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
    var id = req.body.id;
    var commentid = req.body.commentid;
    var nickname = req.body.nickname;
    var content = req.body.content;
    var postid = req.body.postid;
    var pselect_sql = 'SELECT commentnum FROM post WHERE postid = ?'
    var pupdate_sql = 'UPDATE post SET commentnum = ? WHERE postid = ?'
    var cinsert_sql = 'INSERT INTO comment (commentid, nickname, content, postid, id) VALUES (?, ?, ?, ?, ?)';

    query(pselect_sql,postid) //게시물의 댓글 수 들고와서 +1 한다음 업데이트 시켜줌
    .then(result => {
        var commentnum = result[0].commentnum + 1
        var params = [commentnum,postid];
        return query(pupdate_sql,params)
    })
    .then(result => { //댓글을 insert
        var params = [commentid, nickname, content, postid, id];
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

app.post('/comment/delete', function(req,res){
    var commentid = req.body.commentid
    var postid = req.body.postid

    var delComment_sql = 'DELETE FROM comment WHERE commentid = ?'
    var selectPost_sql = 'SELECT commentnum FROM post WHERE postid = ?'
    var updatePost_sql = 'UPDATE post SET commentnum = ? WHERE postid = ?'
    var delClove_sql = 'DELETE FROM clove WHERE commentid = ?'

    query(delComment_sql,commentid)
    .then(result => {
       return query(selectPost_sql,postid)
    })
    .then(result => {
        var commentnum = result[0].commentnum - 1
        var params = [commentnum,postid];
        return query(updatePost_sql,params)
    })
    .then(result => {
        return query(delClove_sql,commentid)
    })
    .then(result => {
        res.json({
            msg:"댓글이 삭제되었습니다."
        })
    })
    .catch(err => {})
})

app.post('/post/love', function(req,res) { //love에 중복이 있ㄷ면 진행안하고 없으면 love insert -> c or p update
    var postid = req.body.postid
    var id = req.body.id
    var check_sql =  "SELECT EXISTS(SELECT * FROM plove WHERE postid = ? AND id = ?) as exist";
    var params = [postid, id]

    query(check_sql,params)
    .then(result => {
        if(result[0].exist == 1){
            res.json({
                msg: "이미 좋아요를 눌렀습니다."
            })
            return
        }else{
            up_Plove(postid,id,res)
        }
    })
})

app.post('/comment/love', function(req,res) {
    var commentid = req.body.commentid
    var postid = req.body.postid
    var id = req.body.id
    var check_sql =  "SELECT EXISTS(SELECT * FROM clove WHERE commentid = ? AND id = ? AND postid = ?) as exist";
    var params = [commentid, id, postid]

    query(check_sql,params)
    .then(result =>{
        if(result[0].exist == 1){
            res.json({
                msg: "이미 좋아요를 눌렀습니다."
            })
            return
        }
        else
            up_Clove(commentid,postid,id,res)
    })
    .catch(err => {})
})

function rm_Clove(commentid,res){
    var sql = 'DELETE FROM clove WHERE commentid = ?'

    query(sql,commentid)
    .then(result => {
        res.json({
            msg:"댓글이 삭제되었습니다."
        })
    }).catch(err => {})
}

function up_Clove(commentid,postid,id,res){

    var insert_sql = 'INSERT INTO clove (commentid, id, postid) VALUES (?, ?, ?)'
    var comment_sql = 'SELECT love FROM comment WHERE commentid = ?'
    var updateComment_sql = 'UPDATE comment SET love = ? WHERE commentid = ?'

    var insert_params = [commentid, id, postid]

    query(insert_sql,insert_params)
    .then(result => { //love에 데이터 집어넣고,
        return query(comment_sql,commentid)
    })
    .then(result => { //해당 (게시물/댓글) 의 love갯수 뽑아내서 +1해주고
        var lovecnt = result[0].love + 1
        var update_params = [lovecnt,commentid]
        
        return query(updateComment_sql,update_params)
    })
    .then(result => {
        res.json({msg:"좋아요!"})
    })
    .catch(err => {
        res.json(err)
    })
}

function up_Plove(postid,id,res){

    var insert_sql = 'INSERT INTO plove (postid, id) VALUES (?, ?)'
    var post_sql = 'SELECT love FROM post WHERE postid = ?'
    var updatePost_sql = 'UPDATE post SET love = ? WHERE postid = ?'
    
    var insert_params = [postid, id]

    query(insert_sql,insert_params)
    .then(result => { //love에 데이터 집어넣고,
        return query(post_sql,postid)
    })
    .then(result => { //해당 (게시물/댓글) 의 love갯수 뽑아내서 +1해주고
        var lovecnt = result[0].love + 1
        var update_params = [lovecnt,postid]
        
        return query(updatePost_sql,update_params)
    })
    .then(result => {
        res.json({msg:"좋아요!"})
    })
    .catch(err => {
        res.json(err)
    })
}

function alarm(){
    axios.get('https://api.bithumb.com/public/ticker/ALL')
    .then(result => {
        var coinMap = result['data']['data']
        var select_sql = 'SELECT * FROM alarm'

        query(select_sql)
        .then(result => {
            var aramList = result
            loop(aramList)
        })

        const loop = async (list) => {
            const promises = list.map(async element => {
                var id = element['id']
                var price = parseFloat(element['price'])
                var coin = element['coin']
                var pk = element['pk']
                var closing_price = parseFloat(coinMap[coin]['closing_price'])

                var token_sql = "SELECT token FROM user WHERE id =?"
                
                return await query(token_sql,id)
                .then(result => {
                    var token = result[0].token
                    var s = (price - (price*0.01))
                    var e = (price + (price*0.01))
        
                    if(s <= closing_price && closing_price <= e){
                        //send fcm here
                        console.log(pk)
                        sendFcm(coin,closing_price,token,pk)
                    }
                })
            })
        }
    })
    .catch(err => {console.log(err)})
}

function sendFcm(coin,price,token,pk){

    let message = {
        notification:{
            title: coin+"이 설정한 가격에 도달하였습니다.",
            body: coin+": "+price
        },
        data:{
            title: coin+"이 설정한 가격에 도달하였습니다.",
            body: coin+": "+price
        },
        token:token
    }

    admin
    .messaging()
    .send(message)
    .then(result => {
        var sql = 'DELETE FROM alarm WHERE pk = ?'
        query(sql,pk)
        .then(result => {console.log('success')})
        // console.log('success')
    })
    .catch(err => {
        console.log(err)
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

