package com.lyqc.base.enums.dbenum;

public class CaRelativesInfoEnum {
    public enum RELATIONGFL {
        FRIEND("02", "朋友"),
        PARENTS("03", "父母"),
        RELATIVE("04", "亲戚"),
        COUPLE("01", "夫妻"),
        CHILDREN("05", "子女"),
        COLLEAGUE("06", "同事");

        private String code;
        private String cnName;

        private RELATIONGFL(String code, String cnName) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public String getCnName() {
            return cnName;
        }
    }
}
