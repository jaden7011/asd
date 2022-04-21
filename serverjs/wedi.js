var mysql = require('mysql');
var express = require('express');
var multer = require('multer');
var fs = require('fs');
var bodyParser = require('body-parser');
var axios = require('axios')
var app = express();

var _storage = multer.diskStorage({
	destination: 'uploads/',
	filename: function(req, file, cb) {
        var id = replaceAll(req.body.id,'"','')
        cb(null,id+'_'+file.originalname)
	}
});

app.use(bodyParser.json({extended: true})); 
app.use(bodyParser.urlencoded({extended: true})); 

app.listen(3001, function () {
    console.log('서버 실행2');
});

var connection = mysql.createConnection({
    host: "coin.cmrsblb0ntzt.ap-northeast-2.rds.amazonaws.com",
    user: "root",
    database: "wedi",
    password: "w19706538",
    port: 3306
});

app.use(express.static('uploads'))

app.post('/user/check',(req,res) => {
    let id = replaceAll(req.body.id,'"','')
    var sql = 'SELECT * FROM user WHERE id = ?'

    query(sql,id)
    .then(result => {
        if(result.length == 0){
            res.json(false)
        }else
            res.json(true)
    })
    .catch(err =>{
        console.log(err)
    })
})

app.post('/user/login',(req,res)=>{
    let id = replaceAll(req.body.id,'"','')
    let pass = replaceAll(req.body.pass,'"','')
    let sql = "SELECT * FROM user WHERE id = ? AND pass = ?"

    query(sql,[id,pass])
    .then(result=>{
        if(result.length == 0)
            res.json({
                result:false
            })
        else{
            var invite = result[0].invite

            if(invite == 1)
                invite = true
            else
                invite = false

            res.json({
                result:true,
                family:result[0].id,
                familyimage:result[0].image,
                familynickname:result[0].nickname,
                invite:invite
            })
        }
    })
    .catch(err=>{
        console(err)
    })

})

app.post("/user/signin", multer({storage: _storage}).single('file'), (req, res) => {

    new Promise((resolve,reject) => {
        let id = replaceAll(req.body.id,'"','')
        let pass = replaceAll(req.body.pass,'"','')
        let nickname = replaceAll(req.body.nickname,'"','')
        let file = req.file
        var image = ""
        
        if(file == null)
            image = "o.png"
        else{
            image = file.filename
        }

        resolve([id,nickname,image,pass])

    }).then(result => {
        var sql = 'INSERT INTO user (id,nickname,image,pass) VALUES (?,?,?,?)'

        query(sql,result)
        .then(result => {
            res.json(true)
        }).catch(err=>{
            res.json(false)
            console.log(err)
        })

    }).catch(err => {
        res.json(false)
        console.log(err)
    })
})

app.post("/user/image",(req,res)=>{
    let id = replaceAll(req.body.id,'"','')
    let sql = "SELECT * FROM user WHERE id = ?"

    query(sql,id)
    .then(result=>{
        res.json(result[0].image)
    })
    .catch(err=>{
        console.log(err)
    })
})

app.post('/user/invite/update',(req,res)=>{
    let id = req.body.id
    var invite = req.body.invite
    let sql = 'UPDATE user SET invite = ? WHERE id = ?'

    console.log("before: " + invite)

    if(invite == "true"){
        invite = 1
    }
    else{
        invite = 0
    }

    console.log(invite)

    query(sql,[invite,id])
    .then(result => {
        res.json(true)
    })
    .catch(err => {
        res.json(false)
        console.log(err)
    })
})

app.post('/user/nickname/update',(req,res)=>{
    let id = req.body.id
    let nickname = req.body.nickname
    let user_sql = 'UPDATE user SET nickname = ? WHERE id = ?'
    let family_sql = 'UPDATE family SET familynickname = ? WHERE family = ?'
    let params = [nickname,id]

    query(user_sql,params)
    .then(result=>{
        return query(family_sql,params)
    })
    .then(result=>{
        res.json(true)
        console.log(result)
    })
    .catch(err=>{
        console.log(err)
    })
})

app.post('/user/get',(req,res)=>{
    let id = req.body.id
    let sql = 'SELECT * FROM user WHERE id = ?'

    query(sql,id)
    .then(result=>{
        if(result.length == 0)
        res.json({
            result:false
        })
    else{
        var invite = result[0].invite

        if(invite == 1)
            invite = true
        else
            invite = false

        res.json({
            result:true,
            id:result[0].id,
            image:result[0].image,
            nickname:result[0].nickname,
            invite:invite
        })
    }
    })
    .catch(err=>{
        console.log(err)
    })
})

app.post('/user/withdraw',(req,res)=>{
    let id = req.body.id
    //친추된 것도 다 삭제해줘야함
    let user_sql = 'DELETE FROM user WHERE id = ?'
    let family_sql = 'DELETE FROM family WHERE id = ?'
    let family_sql2 = 'DELETE FROM family WHERE family = ?'
    
    query(user_sql,id)
    .then(res =>{
        return query(family_sql,id)
    })
    .then(res =>{
        return query(family_sql2,id)
    })
    .then(result=>{
        res.json(true)
    })
    .catch(err=>{
        res.json(false)
        console.log(err)
    })
})

app.post("/family",(req,res)=>{
    //id image nickname
    let id = replaceAll(req.body.id,'"','')
    let user_sql = "SELECT * FROM user WHERE id = ?"
    let family_sql = "SELECT * FROM family WHERE id = ?"
    var family = []

    query(user_sql,id)
    .then(result=>{
        //내 데이터를 첫번째로 넣고
        family.push({
            family:result[0].id,
            familynickname:result[0].nickname,
            familyimage:result[0].image
        })
        return query(family_sql,id)
    })
    .then(result=>{
        result.forEach(user => {
            family.push(user)
        });
        if(family.length != 0){
            res.json({
                family:family,
                result:true
            })
        }else{
            res.json({
                result:false
            })
        }
    })
    .catch(err=>{
        res.json(false)
        console.log(err)
    })
})

app.post('/family/del',(req,res)=>{
    let id = req.body.id
    let family = req.body.family
    let sql = 'DELETE FROM family WHERE id = ? AND family = ?'

    query(sql,[id,family])
    .then(result=>{
        return query(sql,[family,id])
    })
    .then(result=>{
        res.json(true)
    })
    .catch(err=>{
        res.json(false)
        console.log(err)
    })
})

app.post('/family/add',(req,res)=>{
    let id = req.body.id
    let nickname = req.body.nickname
    let image = req.body.image
    let family = req.body.family
    let user_sql = 'SELECT * FROM user WHERE id = ?'
    let family_sql = 'INSERT INTO family (id,family,familyimage,familynickname) VALUES (?,?,?,?)'
    var user = ""

    query(user_sql,family)
    .then(result=>{
        user = result[0]
        let params = [id,user.id,user.image,user.nickname]
        return query(family_sql,params)
    })
    .then(result=>{
        let params = [user.id,id,image,nickname]
        return query(family_sql,params)
    })
    .then(result=>{
        res.json(true)
    })
    .catch(err=>{
        res.json(false)
        console.log(err)
    })

})

app.post("/todo/add",(req,res)=>{
    let id = req.body.id
    let nickname = req.body.nickname
    let content = req.body.content
    let sql = 'INSERT INTO todo (id,nickname,content) VALUES(?,?,?)'

    query(sql,[id,nickname,content])
    .then(result=>{
        res.json(true)
    })
    .catch(err => {
        res.json(false)
        console.log(err)
    })
})

app.post("/todo/del",(req,res)=>{
    let id = req.body.id
    let content = req.body.content
    let sql = 'DELETE FROM todo WHERE id = ? AND content = ?'

    query(sql,[id,content])
    .then(result=>{
        res.json(true)
    })
    .catch(err => {
        res.json(false)
        console.log(err)
    })
})

app.post("/todo/do",(req,res)=>{
    let id = req.body.id
    let content = req.body.content
    let select_sql = 'SELECT * FROM todo WHERE id = ? AND content = ?'
    let update_sql = 'UPDATE todo SET isdone = ? WHERE id = ? AND content = ?'

    query(select_sql,[id,content])
    .then(result=>{
        var isdone = 0
        if(result[0].isdone == 0) 
            isdone = 1 
        else  
            isdone = 0
        return query(update_sql,[isdone,id,content])
    })
    .then(result=>{
        res.json(true)
    })
    .catch(err => {
        res.json(false)
        console.log(err)
    })
})


app.post("/todo/all",(req,res)=>{
    let id = req.body.id
    var sql = 'SELECT * FROM todo WHERE id = ? ORDER BY date DESC'

    query(sql,id)
    .then(result => {
        res.json({todolist:result})
    })
    .catch(err => {
        console.log(err)
    })
})

app.post("/recipe/all",(req,res)=>{
    let id = req.body.id
    var sql = 'SELECT * FROM recipe WHERE id = ? ORDER BY date DESC'

    query(sql,id)
    .then(result => {
        res.json({recipelist:result})
    })
    .catch(err => {
        console.log(err)
    })
})

app.post("/recipe/add",(req,res)=>{
    let id = req.body.id
    let nickname = req.body.nickname
    let title  = req.body.title
    let content = req.body.content

    let sql = 'INSERT INTO recipe (id,nickname,title,content) VALUES (?,?,?,?)'
    let params = [id,nickname,title,content]

    query(sql,params)
    .then(result => {
        res.json(true)
    })
    .catch(err => {
        res.json(false)
        console.log(err)
    })
})

app.post("/recipe/del",(req,res)=>{
    let id = req.body.id
    let title  = req.body.title
    let content = req.body.content

    let sql = 'DELETE FROM recipe WHERE rkey = (SELECT rkey FROM (SELECT * FROM recipe WHERE id = ? AND title = ? AND content = ?) AS t)'

    let params = [id,title,content]

    query(sql,params)
    .then(result => {
        res.json(true)
    })
    .catch(err => {
        res.json(false)
        console.log(err)
    })
})

function readImageFile(file){
    const bitmap = fs.readFileSync(file);
    // const buf = new Buffer.from(bitmap)
    return bitmap
}

function replaceAll(str, searchStr, replaceStr) {
    return str.split(searchStr).join(replaceStr);
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
