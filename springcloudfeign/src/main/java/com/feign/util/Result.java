package com.feign.util;

/**
 * @ClassName: Result 
 * @Description 响应体统一格式
 * @author caiwei
 * @date 2019年1月1日
 */
public class Result {
    
    private String flag;
    private String msg;
    private Object data;
        
    public Result() {}
    
    public Result(String flag, String msg, Object data) {
        this.flag = flag;
        this.msg= msg;
        this.data= data;
    }
    

    
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Result [flag=" + flag + ", msg=" + msg + ", data=" + data + "]";
    }
}
