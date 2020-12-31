package com.lyqc.poseidon.enums;

/**
 * 订单快照枚举类型
 */
public enum ApprovalReturnCompareTypeEnum {
    CONFIG(-1, "配置记录"),
    SECOND_RETURN(1, "复审退回"),
    APP_COMMIT(2, "APP提单"),
    FINAL_PASS(3, "终审通过");

    private Integer code;
    private String desc;

    ApprovalReturnCompareTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


    public static ApprovalReturnCompareTypeEnum toEnum(Integer code) {
        for (ApprovalReturnCompareTypeEnum item : ApprovalReturnCompareTypeEnum.values()) {
            if (item.code.equals(code)) {
                return item;
            }
        }
        StringBuilder str = new StringBuilder();
        str.append("the argument of ").append(code).append(" have no correspondence ApprovalReturnCompareTypeEnum enum!");
        throw new IllegalArgumentException(str.toString());
    }
}
