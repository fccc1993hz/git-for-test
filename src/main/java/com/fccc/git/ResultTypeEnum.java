package com.fccc.git;

public enum ResultTypeEnum {
    /**
     *
     */
    SUCCESS(1, "请求成功"),
    FAILURE(-1, "请求失败");

    int code;
    String message;

    ResultTypeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


    public static ResultTypeEnum getResultTypeByCode(int code) {
        ResultTypeEnum result = null;
        for (ResultTypeEnum resultType : ResultTypeEnum.values()) {
            if (resultType.getCode() == code) {
                result = resultType;
                break;
            }
        }
        return result;
    }
}
