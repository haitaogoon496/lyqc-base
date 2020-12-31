package com.lyqc.base.enums.dbenum;

import com.lyqc.base.enums.EnumDesc;

/**
 * 参数化查询枚举
 */
public class UlEnum {
    public enum UlSysEnum implements EnumDesc {
        UNKONW(-1, "未知"),
        CAR_YULV(1, "收单-门神"),
        GPS_PROVIDER(2, "GPS服务"),

        SIMBA(50, "辛巴");

        private Integer index;
        private String name;

        UlSysEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }

        @Override
        public String getDesc() {
            return name;
        }

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public String getName() {
            return name;
        }

        public static UlSysEnum getStatusByIndex(Integer index){
            if(index == null){
                return UNKONW;
            }
            for(UlSysEnum s : UlSysEnum.values()){
                if(s.getIndex() == index.intValue()){
                    return s;
                }
            }
            return UNKONW;
        }
    }

    public enum UlParamTypeEnum implements EnumDesc {
        UNKONW(-1, "未知"),
        INPUT(1, "入参"),
        OUTPUT(2, "出参");

        private Integer index;
        private String name;

        UlParamTypeEnum(int index, String name) {
            this.index = index;
            this.name = name;
        }

        @Override
        public String getDesc() {
            return name;
        }

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public String getName() {
            return name;
        }

        public static UlParamTypeEnum getStatusByIndex(Integer index){
            if(index == null){
                return UNKONW;
            }
            for(UlParamTypeEnum s : UlParamTypeEnum.values()){
                if(s.getIndex() == index.intValue()){
                    return s;
                }
            }
            return UNKONW;
        }
    }

    public enum UlNotifySysCallWay implements EnumDesc {
        UNKONW(-1, "未知"),
        HTTP(1, "HHTP"),
        KAFKA(2, "KAFKA");

        private Integer index;
        private String name;

        UlNotifySysCallWay(int index, String name) {
            this.index = index;
            this.name = name;
        }

        @Override
        public String getDesc() {
            return name;
        }

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public String getName() {
            return name;
        }

        public static UlNotifySysCallWay getStatusByIndex(Integer index){
            if(index == null){
                return UNKONW;
            }
            for(UlNotifySysCallWay s : UlNotifySysCallWay.values()){
                if(s.getIndex() == index.intValue()){
                    return s;
                }
            }
            return UNKONW;
        }
    }
}
