package com.lyqc.gpsweb.enums;

/**
 * @description: gps退回类型枚举
 * @author zhaoxin
 * @date 2018/7/6 下午5:18
 **/
public enum GpsApprovalBackEnum {

    BEFORE_LOAN_BACK(1, "贷前审核岗审批->退回复审审批"),
    AFTER_LOAN_BACK(2, "贷后审核岗审批->退回复审审批"),
    APPPROVAL_BACK(3, "审批退回管理->退回复审审批"),
    APPPROVAL_DJ_BACK(4, "对接放款管理->退回复审审批"),
    APPPROVAL_DZ_BACK(5, "垫资放款管理->退回复审审批"),
    APPPROVAL_ZD_BACK(6, "自动放款管理->退回复审审批"),
    VIN_CODE_CHANGE(7, "vin码修改"),
    GPS_APPROVAL_RESET(8,"贷前免审核调整金融方案-GPS重置审核状态");

    private int index;
    private String name;

    GpsApprovalBackEnum(int index, String name) {
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
        for(GpsApprovalBackEnum e : GpsApprovalBackEnum.values()){
            if(e.getIndex() == index){
                return e.getName();
            }
        }
        return null;
    }

    public static GpsApprovalBackEnum getByIndex(int index){
        for(GpsApprovalBackEnum e : GpsApprovalBackEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }
}
