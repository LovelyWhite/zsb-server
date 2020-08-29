package cn.maixedu.zsb.utils;

/**
 * @Description: 返回的格式内容
 * @Author:lw
 * @Date:2020/8/29
 */
public class Return {
    int code;
    Object object;
    String message;

    public Return() {
    }

    public Return(int code, Object object, String message) {
        this.code = code;
        this.object = object;
        this.message = message;
    }

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
}
