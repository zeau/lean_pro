/**
 * Created by Administrator on 2016/7/2.
 */
var api=new Object();
//var apiHost="http://localhost:8080/";
var apiHost="http://"+window.location.host+"/";

api.req= buildRequest();
api.debug=true;
$(function () {
    
});


function buildRequest() {
    var url = window.location.search; //获取url中"?"符后的字串
    var theRequest = new Object();
    if (url.indexOf("?") != -1) {
        var str = url.substr(1);
        strs = str.split("&");
        for(var i = 0; i < strs.length; i ++) {
            //就是这句的问题
            theRequest[strs[i].split("=")[0]]=decodeURI(strs[i].split("=")[1]);
            //之前用了unescape()
            //才会出现乱码
        }
    }
    return theRequest;
}

function sendCallBack(data,successFun,errorFun,nologinFun) {
    if(data.statusCode==200){
        successFun(data.data);
    }else if(data.statusCode==300){

        errorFun(data.message);
    }else if(data.statusCode==301){
        //
        if(nologinFun){
            nologinFun();
        }else{
            api.storage.remove("homeUserInfo");
            api.storage.remove("homeLoginTime");
            window.location.href="/log-on.html";
        }

    }else{
        errorFun("请求失败")
    }
}

function post(path,param,successFun,errorFun,noLoginFun) {
    param.stduentToken=api.storage.get("stduentToken");
    $.ajax({
        type: "POST",
        url: apiHost+path,
        data: param,
        dataType:"json",
        success: function(res){
            // res=$.parseJSON(res);
            // alert( "Data Saved: " + msg );
            sendCallBack(res,successFun,errorFun,noLoginFun);
        }
    });
}

function saveLogin(data) {
    api.storage.set("stduentToken",data);
}

function getMethod(path,param,successFun,errorFun,noLoginFun) {

    param.stduentToken=api.storage.get("stduentToken");
    param.areaId=api.storage.get("areaId");
    $.getJSON(path+"?jsonpcallback=?",param,
        function(res){
//                    api.bdlog(data);
            sendCallBack(res,successFun,errorFun,noLoginFun);

        });
}



function postCache(path, param, successFun, errorFun, noLoginFun,update) {
    var key=md5(path+"->"+JSON.stringify(param));
    // param.adminToken=api.storage.get("token");
    var cacheValue=api.cache.get(key);
    if(update==undefined){
        update=false;
    }
    if(cacheValue&&!update){
        successFun(cacheValue);
    }else{
        post(path,param,function (data) {
            api.cache.set(key,data);
            successFun(data);
        },errorFun,noLoginFun);
        // $.getJSON(apiHost+path+"?jsonpcallback=?",param,
        //     function(res){
        //         api.cache.set(key,res);
        //         sendCallBack(res,successFun,errorFun,noLoginFun);
        //
        //     });
    }
}

api.cache=new Object();
api.cache.set=function (key, val) {
    if(window.sessionStorage){  //或者 window.sessionStorage
        window.sessionStorage.setItem(key,JSON.stringify(val));
    }else{
        // alert("浏览暂不支持localStorage")
    }
};
api.cache.get=function (key) {
    if(window.sessionStorage){  //或者 window.sessionStorage
        return JSON.parse(window.sessionStorage.getItem(key));
    }else{
        // alert("浏览暂不支持localStorage")
    }
};
api.storage=new Object();
api.storage.set=function (key,val){
/*    if(window.localStorage){  //或者 window.sessionStorage
        window.localStorage.setItem(key,JSON.stringify(val));
    }else{
        // alert("浏览暂不支持localStorage")
    }*/

    store.set(key,val);
};
api.storage.get=function (key) {
/*    if(window.localStorage){  //或者 window.sessionStorage
        return JSON.parse(window.localStorage.getItem(key));
    }else{
        // alert("浏览暂不支持localStorage")
    }*/
    return store.get(key);
};

api.storage.remove=function (key){
    store.remove(key);
}

api.storage.clear=function (){
    store.clear();
}








function getQuery() {
    res={};
    var param=window.location.search.substr(1);
    param.split('&').forEach(function(i){
        var j = i.split('=');
        res[j[0]]=j[1];
    });
    return res;
}
function setQuery(param) {
    var p= $.param(param);
    window.location.hash=p;
}
/**
 * URL生成器
 * @param url
 * @param params
 * @returns {*}
 */
function urlBuild(url, params) {
    for(var i=0;i<params.length;i++){
        url=url.replace(new RegExp("\\{"+i+"\\}","g"),params[i]);
    }
    return url;
}
/**
 * 获取value的值，当为null 或者undefined 时取默认值
 * @param value
 * @param defaultValue
 * @returns {*}
 */
function getDefaultValue(value,defaultValue) {
    if(value==null||value==undefined){
        return defaultValue;
    }
    return value;
}
function getDefaultIntValue(value,defaultValue) {
    if(value==null||value==undefined){
        return defaultValue;
    }
    var pv=Number.parseInt(value);
    return pv;
}

function errorImage(el) {
    el.src="/images/the_default.png";
}




var loadBaseDataLimit=1000*60*10;

/*function initBaseData(loadAll) {
    if(loadAll==undefined){
        loadAll=false;
    }
    var baseTime= api.cache.get("initBaseDataTime");
    if(new Date().getTime()-baseTime>loadBaseDataLimit||loadAll){
        api.cache.set("initBaseDataTime",new Date().getTime())
        postCache("admin/basicData/getNameTypeByType.do", {type:"民族"}, function (data) {
            // api.log("学历加载成功");
            // student_user_reviseVm.dataNation = data;
        }, function (msg) {


        },function () {

        },true);
        postCache("admin/basicData/getNameTypeByType.do", {type:"学历"}, function (data) {
            // student_user_reviseVm.dataRecord = data;
            //api.log("学历加载成功");
        }, function (msg) {

        },function () {

        },true);

        postCache("admin/basicData/getNameTypeByType.do", {type:"省"}, function (data) {
            // student_user_reviseVm.dataProvince = data;
            //api.log("省加载成功");
        }, function (msg) {
            // api.log(msg);

        },function () {

        },true);
    }else{
        //api.log("使用缓存数据")
    }
}*/
api.setDefault=function (data,field, defaultValue) {
    // if(v==undefined){
    //     v=defaultValue;
    // }
    if(data[field]==undefined){
        data[field]=defaultValue;
    }
}



api.bdlog=function (msg) {
    // if(api.debug){
    //     api.bdlog(msg);
    // }
}

