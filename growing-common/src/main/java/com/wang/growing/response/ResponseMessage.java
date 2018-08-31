package com.wang.growing.response;

/**
 * @author wangyuanyuan@zto.com
 * @Description: 返回类
 * @date 2018/8/30/16:50
 */

public class ResponseMessage<T> {
    private static final long serialVersionUID = 1L;
    private boolean status;
    private String statusCode;
    private String message;
    private T result;

    public ResponseMessage() {
    }

    public ResponseMessage(boolean status, String statusCode, String message, T result) {
        this.status = status;
        this.statusCode = statusCode;
        this.message = message;
        this.result = result;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return (T) this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
