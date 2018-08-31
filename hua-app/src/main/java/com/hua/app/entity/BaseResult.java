package com.hua.app.entity;

/**
 * 所有请求的返回实体对象
 *
 * @author hua
 */
public class BaseResult<T> {
    /**
     * 返回码
     */
    private int code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;
    /**
     * 返回当前时间
     */
    private long currentTime;

    /**
     * 不带数据的返回成功
     */
    public BaseResult() {
        this.code = 0;
        this.message = "success";
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * 带数据的返回成功
     *
     * @param data
     */
    public BaseResult(T data) {
        this.data = data;
        this.code = 0;
        this.message = "success";
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * @param code    错误码
     * @param message 信息
     * @param data    数据
     */
    public BaseResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.currentTime = System.currentTimeMillis();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }
}
