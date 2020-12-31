package com.lyqc.base.enums.dbenum;

import com.lyqc.base.enums.EnumValue;

/**
 * Created by xiaoxian on 2018/8/3.
 */
public class CaProppserInfoEnum{
    public enum IdTypeEnum implements EnumValue{
        ID_CARD(15, "居民身份证"),
        PASSPORT(20, "护照"),
        MILITARY_CARD(17, "军官证/士兵证");

        private int index;
        private String name;

        @Override
        public int getIndex() {
            return index;
        }
        public void setIndex(int index) {
            this.index = index;
        }
        @Override
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        IdTypeEnum(int index, String name){
            this.index = index;
            this.name = name;
        }

        public static IdTypeEnum getByIndex(Integer index){
            if(index == null){
                return null;
            }
            for(IdTypeEnum idtype : IdTypeEnum.values()){
                if(idtype.getIndex() == index.intValue()){
                    return idtype;
                }
            }
            return null;
        }
    }

    public enum AuthTypeEnum {
        DZ("2", "DZ","1"),
        ZZ("1", "ZZ","0");

        private String code; //1表示纸质,2表示电子版
        private String Name;
        private String queryYh;//0表示需要先审核资料再调央行征信,1表示可以直接调用征信,用于合规性

        AuthTypeEnum(String code, String Name, String queryYh) {
            this.code = code;
            this.Name = Name;
            this.queryYh = queryYh;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return Name;
        }

        public String getQueryYh() {
            return queryYh;
        }
    }
}
