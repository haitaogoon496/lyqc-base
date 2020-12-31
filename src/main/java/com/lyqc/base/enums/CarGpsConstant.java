package com.lyqc.base.enums;

/**
 * @description: 车辆GPS模块常量枚举实体类
 * @Date : 下午1:52 2018/1/4
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Deprecated
public final class CarGpsConstant {
    /**
     * @description: GPS规则配置-GPS属性 枚举
     * @Date : 2018/3/22 下午3:45
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum GpsProEnum implements EnumValue {

        NONE(0, "无需安装"),
        WIRELESS1(1, "无线X1"),
        WIRELESS1_AND_WIRED1(2, "无线X1,有线X1");

        GpsProEnum(int index, String name) {
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
            for(GpsProEnum e : GpsProEnum.values()){
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
        public static GpsProEnum getByIndex(int index){
            for(GpsProEnum e : GpsProEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: GPS安装方式 枚举
     * @Date : 2018/6/4 下午7:47
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum GpsInstallTypeEnum implements EnumValue {
        PICK_UP_INSTALL(1, "带货安装"),
        BY_ONESELF_INSTALL(2, "自行安装");

        GpsInstallTypeEnum(int index, String name) {
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
            for(GpsInstallTypeEnum e : GpsInstallTypeEnum.values()){
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
        public static GpsInstallTypeEnum getByIndex(int index){
            for(GpsInstallTypeEnum e : GpsInstallTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }

    /**
     * @description: 门店管理 秒据接口 枚举
     * @Date : 2017/9/27 下午2:55
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum AppInfoIsGpsEnum implements EnumValue {

        UNINSTALL(0, "未安装"),
        INSTALLED(1, "已确认安装"),
        UPLOADED(2, "安装单已上传");

        AppInfoIsGpsEnum(int index, String name) {
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
            for(AppInfoIsGpsEnum e : AppInfoIsGpsEnum.values()){
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
        public static AppInfoIsGpsEnum getByIndex(int index){
            for(AppInfoIsGpsEnum e : AppInfoIsGpsEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
