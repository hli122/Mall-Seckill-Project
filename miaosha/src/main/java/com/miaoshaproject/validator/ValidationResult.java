package com.miaoshaproject.validator;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ValidationResult {
    // validation result true or false
    private boolean hasErrors = false;

    // map stores error message
    private Map<String, String> errMsgMap = new HashMap<>();

    /**
     * Implement formatted string to get the error message
     */
    public String getErrMsg() {
        return StringUtils.join(getErrMsgMap().values().toArray(), ",");
    }

    public boolean isHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public Map<String, String> getErrMsgMap() {
        return errMsgMap;
    }

    public void setErrMsgMap(Map<String, String> errMsgMap) {
        this.errMsgMap = errMsgMap;
    }
}
