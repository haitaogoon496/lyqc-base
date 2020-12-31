package com.lyqc.yy.enums;

/**
 * @Author：rongss
 * @Description
 * @Date：Created in 下午5:26 2018/5/18
 */
public enum RiskNodeEnum {

    FIRST(0, "首次调用风控"),
    SECOND(1, "初审核查完纸质授权书后调风控"),
    THIRD(2,"初审退回经销商后重新提交"),
    FOURTH(3, "复审退回经销商后重新提交");

    private int index;
    private String name;

    RiskNodeEnum(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public static String getNameByIndex(int index){
        for(RiskNodeEnum e : RiskNodeEnum.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    public static RiskNodeEnum getByIndex(int index){
        for(RiskNodeEnum e : RiskNodeEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }

}
