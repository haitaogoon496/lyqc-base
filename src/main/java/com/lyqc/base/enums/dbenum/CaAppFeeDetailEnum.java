package com.lyqc.base.enums.dbenum;

import java.util.HashMap;
import java.util.Map;

public class CaAppFeeDetailEnum {
    public enum FeeItemEnum {
        GPS(1, "GPS基本费"),
        GPS_FLOAT(2, "GPS浮动费"),
        COMM(3, "平台基本费"),
        COMM_FLOAT(4, "平台浮动费"),
        OFFLINE_COM_FEE_APPLY(5, "线下平台费"),
        OFFLINE_COM_FEE_REPLY(6, "批复线下平台费");

        public final int CODE;
        public final String NAME;
        private static Map<Integer, FeeItemEnum> codeMap = new HashMap();

        private FeeItemEnum(int CODE, String NAME) {
            this.CODE = CODE;
            this.NAME = NAME;
        }

        public static FeeItemEnum getByCode(Integer code) {
            return (FeeItemEnum)codeMap.get(code);
        }

        static {
            FeeItemEnum[] var0 = values();
            int var1 = var0.length;

            for(int var2 = 0; var2 < var1; ++var2) {
                FeeItemEnum item = var0[var2];
                codeMap.put(item.CODE, item);
            }

        }
    }

    public enum ApplyTypeEnum {
        APPLY(1, "申请"),
        REPLY(2, "批复");

        public final int CODE;
        public final String NAME;

        private ApplyTypeEnum(int CODE, String NAME) {
            this.CODE = CODE;
            this.NAME = NAME;
        }

        public static ApplyTypeEnum getByCode(Integer code) {
            if (code == null) {
                return null;
            } else {
                ApplyTypeEnum[] var1 = values();
                int var2 = var1.length;

                for(int var3 = 0; var3 < var2; ++var3) {
                    ApplyTypeEnum item = var1[var3];
                    if (item.CODE == code) {
                        return item;
                    }
                }

                return null;
            }
        }
    }
}
