package com.miaoshaproject.response;

public class CommonReturnType {
    // show the return result of corresponding request: "success" or "fail"
    private String status;

    // if status=success, data returns the json data that front-end needed
    // if status=fail, data uses the common error message format
    private Object data;

    // define a common create method
    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }

    public static CommonReturnType create(Object result, String status) {
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
