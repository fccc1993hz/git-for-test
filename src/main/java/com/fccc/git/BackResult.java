package com.fccc.git;

public class BackResult<T> {
    private boolean success;
    private int code;
    private String message;
    private T data;

    private static class BackResultHolder {
        private static final BackResult INSTANCE = new BackResult();
    }

    public static final BackResult success() {
        return successOf(null);
    }

    public static final <T> BackResult successOf(T data) {
        return successOf(ResultTypeEnum.SUCCESS.getCode(), ResultTypeEnum.SUCCESS.getMessage(), data);
    }

    public static final BackResult successOf(int code, String message) {
        return successOf(code, message, null);
    }

    public static final <T> BackResult successOf(int code, String message, T data) {
        BackResult backResult = BackResultHolder.INSTANCE;
        backResult.setSuccess(true);
        backResult.setCode(code);
        backResult.setMessage(message);
        backResult.setData(data);
        return backResult;
    }

    public static final BackResult failure() {
        return failureOf(null);
    }

    public static final <T> BackResult failureOf(T data) {
        return failureOf(ResultTypeEnum.FAILURE.getCode(), ResultTypeEnum.FAILURE.getMessage(), data);
    }

    public static final BackResult failureOf(int code, String message) {
        return failureOf(code, message, null);
    }

    public static final <T> BackResult failureOf(int code, String message, T data) {
        BackResult backResult = BackResultHolder.INSTANCE;
        backResult.setSuccess(false);
        backResult.setCode(code);
        backResult.setMessage(message);
        backResult.setData(data);
        return backResult;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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
}
