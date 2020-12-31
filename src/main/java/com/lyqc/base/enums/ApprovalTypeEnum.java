package com.lyqc.base.enums;

public enum ApprovalTypeEnum implements EnumValue{

    CANCEL(9,"取消"),
    APPROVAL(10,"正常审批中"),
    ACCEPT(11,"通过"),
    REFUSE(12,"拒绝"),
    BACK_TO_CUSTOMER(13,"退回经销商修改"),
    BACK_TO_APPROVAL(14,"退回审批"),
    WAIT_CHECK(15,"拒绝待复核"),
    CHECK_PASS(16,"拒绝复核通过"),
    CHECK_UNPASS(17,"拒绝复核未通过");

    ApprovalTypeEnum(int index, String name) {
        this.index = index;
        this.name = name;
    }

    private int index;
    private String name;

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * 根据索引获取名称
     * @param index 索引
     * @return
     */
    public static String getNameByIndex(int index){
        for(ApprovalTypeEnum e : ApprovalTypeEnum.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    /**
     * 根据索引获取枚举对象
     * @param index 索引
     * @return
     */
    public static ApprovalTypeEnum getByIndex(int index){
        for(ApprovalTypeEnum e : ApprovalTypeEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }
}
