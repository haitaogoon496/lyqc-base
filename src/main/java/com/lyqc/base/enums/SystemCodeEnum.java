package com.lyqc.base.enums;

/**
 * @description: 系统code和名称
 * @Date : 2018/4/4 14:10
 * @Author : lihaitao
 */
public enum SystemCodeEnum implements EnumDesc {

    LYQC_LOANAPPLY(1, "lyqc_loanapply", "收单系统"),
    LYQC_CRM(2, "lyqc_crm", "crm系统"),
    LYQC_CAS(3, "lyqc_cas", "审单系统"),
    LYQC_POSEIDON(4, "lyqc_poseidon", "poseidon"),
    CRM_APP(5, "crm-app", "直销系统"),
    CHANNEL_SP_WEB(6, "channel-sp-web", "渠道系统"),
    ORDER_CENTER(7, "order-center", "订单中心系统"),
    SIMBA(8, "simba", "simba"),
    LYQC_SEIG(9,"lyqc_seig","lyqc_seig"),
    FENG_YUN(10,"fengyun","风云系统"),
    CAR_YULV(11,"car-yulv","门神系统"),
    APP_CALCULATOR(12,"app-calculator","车贷计算器"),
    LOAN_BEFORE_CHANGE_FUND(13,"loanBefore_changeFund","贷前更换资金方"),
    CAR_PRODUCT(14,"carProduct","金融产品中心"),
    CAR_HEIL(15,"carHeil","金融产品平台"),
    CAR_DHARMA(16, "carDharma", "达摩数据一致性平台")
    ;

    private Integer index;
    private String name;
    private String value;

    SystemCodeEnum(Integer index,String name,String desc) {
        this.index = index;
        this.name = name;
        this.value = desc;
    }

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDesc() {
        return this.value;
    }


    public static String getNameByIndex(int index){
        for(SystemCodeEnum e : SystemCodeEnum.values()){
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
    public static SystemCodeEnum getByIndex(int index){
        for(SystemCodeEnum e : SystemCodeEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }

    /**
     * 根据索引获取枚举对象
     * @param desc 索引
     * @return
     */
    public static SystemCodeEnum getByDesc(String desc){
        for(SystemCodeEnum e : SystemCodeEnum.values()){
            if(e.getDesc().equals(desc)){
                return e;
            }
        }
        return null;
    }
}
