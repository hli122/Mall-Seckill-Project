package com.miaoshaproject.error;

public enum EmBusinessError implements CommonError {
    // common error codes
    // common error type: starts from 10001
    PARAMETER_VALIDATION_ERROR(10001, "illegal parameter"),
    UNKNOWN_ERROR(10002, "unknown error"),

    // user information errors: starts from 20000
    USER_NOT_EXIST(20001, "User does not exist")
    ;

    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String gerErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
