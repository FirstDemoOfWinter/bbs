package com.qnbbs.obj;

//消息对象
public class Result {

    //返回代码
    private Integer code;
    //返回消息
    private String  message;
    //返回json数据
    private Object object;
    

    public Result(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, String message, Object object) {
        this.code = code;
        this.message = message;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
