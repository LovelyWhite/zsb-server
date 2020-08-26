package cn.maixedu.zsb.utils;

import com.alibaba.fastjson.JSON;

public class ReturnFormat {
    private int code;
    private Object object;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
    public ReturnFormat(){}
    public ReturnFormat(int code, Object object, String message) {
        this.code = code;
        this.object = object;
        this.message = message;
    }

    @Override
    public String toString() {
       return JSON.toJSONString(this);
    }
}
