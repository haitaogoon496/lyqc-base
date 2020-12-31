package com.lyqc.base.enums;

/**
 * @description: GPS历史记录相关枚举常量
 * @Date : 2018/1/4 下午2:11
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public final class GpsHistoryConstant {

    /**
     * CaGpsHistory 中安装方式 installStatus
     * 安装状态(0:未安装 1:已安装)
     * @author 石冬冬
     */
    public enum GpsInstallStatusEnum implements EnumValue {

        UN_INSTALL(0, "未安装"),
        INSTALLED(1, "已安装");

        private int index;
        private String name;

        GpsInstallStatusEnum(int index, String name) {
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
            for(GpsInstallStatusEnum e : GpsInstallStatusEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static GpsInstallStatusEnum getByIndex(int index){
            for(GpsInstallStatusEnum e : GpsInstallStatusEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }


    /**
     * CaGpsHistory 中安装方式 approvalStatus
     * 审批状态(0:未审批 1:已审批 2:已驳回)
     * @author 石冬冬
     */
    public enum GpsApprovalStatusEnum implements EnumValue {

        UN_APPROVE(0, "未审批"),
        APPROVED(1, "已审批"),
        REJECTED(2, "已驳回");
        private int index;
        private String name;

        GpsApprovalStatusEnum(int index, String name) {
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
            for(GpsApprovalStatusEnum e : GpsApprovalStatusEnum.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static GpsApprovalStatusEnum getByIndex(int index){
            for(GpsApprovalStatusEnum e : GpsApprovalStatusEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
