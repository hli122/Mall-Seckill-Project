package com.miaoshaproject.error;

// Wrapper(包装器) business exception class implementation (包装器业务异常类实现)
public class BusinessException extends Exception implements CommonError {

    private CommonError commonError;

    // directly receive variables from EnumBusinessError and use them to construct business exception
    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }

    // receive customize(自定义) errMsg to construct business exception
    public BusinessException(CommonError commonError, String errMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String gerErrMsg() {
        return this.commonError.gerErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
