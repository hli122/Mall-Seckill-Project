package com.miaoshaproject.error;

import com.miaoshaproject.response.CommonReturnType;

public interface CommonError {
    public int getErrCode();
    public String gerErrMsg();
    public CommonError setErrMsg(String errMsg);
}
