var mysql = require('mysql');
var express = require('express');
var bodyParser = require('body-parser');
var axios = require('axios')
let serviceAccont = require('/home/ubuntu/coinner-cbf34-firebase-adminsdk-acvke-cf5f0674cf.json')
var app = express();

admin.initializeApp({
    credential: admin.credential.cert(serviceAccont)
})

app.use(bodyParser.json({extended: true})); 
app.use(bodyParser.urlencoded({extended: true})); 

app.listen(3001, function () {
    console.log('서버 실행2');
});

var connection = mysql.createConnection({
    host: "coin.cmrsblb0ntzt.ap-northeast-2.rds.amazonaws.com",
    user: "root",
    database: "wedo",
    password: "w19706538",
    port: 3306
});

app.post("/todo/all",(req,res)=>{
    
})

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
