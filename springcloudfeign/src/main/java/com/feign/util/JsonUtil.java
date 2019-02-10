package com.feign.util;

/**
 * @ClassName: ResultUtil 
 * @Description 对接口返回数据进行格式统一
 * @author caiwei
 * @date 2019年1月1日
 */
public class JsonUtil {
    

    private static final String SUCCESS = "1";
    
    private static final String FAIL = "0";
    
    private static final String EXCEPTION = "2";
    

    /**
     * @Description 请求成功
     * @param data
     * @return result
     */
    public static Result success(Object data) {
        return new Result(SUCCESS,null,data);
    }

    /**
     * @Description 请求失败
     * @param data
     * @return result
     */
    public static Result fail(String msg) {
        return new Result(FAIL,msg,null);
    }
    
    /**
     * @Description 请求异常
     * @param data
     * @return result
     */
    public static Result except(String msg) {
        return new Result(EXCEPTION,msg,null);
    }
    
    


}
