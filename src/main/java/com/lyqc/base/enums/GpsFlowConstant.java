package com.lyqc.base.enums;

/**
 * @description: Gps审批流程相关枚举类
 * @Date : 2018/1/4 下午2:12
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public class GpsFlowConstant {

    /**
     * 未审批===>审批中===>已驳回/审批通过
     * CaGpsFlowService 中安装方式 flowStatus
     * 流程状态(0:未审批 1:审批通过 2:已驳回 3:审批中)
     * @author 石冬冬
     */
    public enum GpsFlowStatusEnum implements EnumValue {

        NO_APPROVAL(0, "未审批"),
        APPROVAL_SUCCESS(1, "审批通过"),
        REJECTED(2, "已驳回"),
        PROCESSING(3, "审批中");

        private int index;
        private String name;

        GpsFlowStatusEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public String getName() {
            return name;
        }

        public static String getNameByIndex(int index){
            for(GpsFlowStatusEnum e : GpsFlowStatusEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static GpsFlowStatusEnum getByIndex(int index){
            for(GpsFlowStatusEnum e : GpsFlowStatusEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }


    /**
     * 开始===>领单===>审批====>结束
     * CaGpsFlowService 中安装方式 flowStep
     * 流程步骤(0:开始 1:审批 2:结束 3:领单)
     * @author 石冬冬
     */
    public enum GpsFlowStepEnum implements EnumValue {
        START(0, "开始"),
        APPROVAL(1, "审批"),
        END(2, "结束"),
        PULL(3, "领单");

        private int index;
        private String name;

        GpsFlowStepEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public String getName() {
            return name;
        }

        public static String getNameByIndex(int index){
            for(GpsFlowStepEnum e : GpsFlowStepEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static GpsFlowStepEnum getByIndex(int index){
            for(GpsFlowStepEnum e : GpsFlowStepEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * GPS审批操作记录备注枚举
     * ca_gps_operate_record表remark字段
     * @author 石冬冬
     */
    public enum OperateRecordRemarkEnum implements EnumValue {
        GPS_INSTALL_INFO_UPDATE_FOR_SERVER(1, "后台GPS安装信息更新"),
        GPS_INSTALL_INFO_UPDATE_FOR_APP(2, "GPS安装信息"),
        GPS_INSTALL_ATTACH_UPDATE_FOR_APP(3, "GPS附件资料"),
        LOAN_APPROVE_BACK(4, "对接放款退回操作"),
        GPS_APPROVE_SUCCESS(5, "审批成功"),
        GPS_APPROVE_REJECT(6, "审批驳回"),
        GPS_HOOK(7, "订单勾回");

        private int index;
        private String name;

        OperateRecordRemarkEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public String getName() {
            return name;
        }

        public static String getNameByIndex(int index){
            for(OperateRecordRemarkEnum e : OperateRecordRemarkEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static OperateRecordRemarkEnum getByIndex(int index){
            for(OperateRecordRemarkEnum e : OperateRecordRemarkEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
