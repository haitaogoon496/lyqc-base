package com.lyqc.base.enums.dbenum;

import com.lyqc.base.enums.EnumValue;

/**
 * Created by xiaoxian on 2018/6/21.
 */
public class CaAppLoanAccountEnum {
    public enum AccountTypeEnum implements EnumValue {
        DUIGONG(1,"对公"),
        DUISI(2,"对私");

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

        AccountTypeEnum(int index, String name){
            this.index = index;
            this.name = name;
        }

        public static AccountTypeEnum getByIndex(Integer index){
            if(index == null){
                return null;
            }
            for(AccountTypeEnum accountTypeEnum : AccountTypeEnum.values()){
                if(accountTypeEnum.getIndex() == index.intValue()){
                    return accountTypeEnum;
                }
            }
            return null;
        }
    }

    public enum LoanTypeEnum implements EnumValue {
        MF(1,"放款账户"),
        CF(2,"返点账户");

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

        LoanTypeEnum(int index, String name){
            this.index = index;
            this.name = name;
        }

        public static LoanTypeEnum getByIndex(Integer index){
            if(index == null){
                return null;
            }
            for(LoanTypeEnum e : LoanTypeEnum.values()){
                if(e.getIndex() == index.intValue()){
                    return e;
                }
            }
            return null;
        }
    }
    public enum DistributeTypeEnum implements EnumValue {
        SINGLE_AMOUNT(1,"单账户全额"),
        DUBBO_RATIO(2,"双账户定比"),
        DUBBO_AMOUNT(3,"双账户定额");

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

        DistributeTypeEnum(int index, String name){
            this.index = index;
            this.name = name;
        }

        public static DistributeTypeEnum getByIndex(Integer index){
            if(index == null){
                return null;
            }
            for(DistributeTypeEnum e : DistributeTypeEnum.values()){
                if(e.getIndex() == index.intValue()){
                    return e;
                }
            }
            return null;
        }
    }
    public enum RebeatTypeEnum implements EnumValue {
        AMOUNT(1,"全额返点");

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

        RebeatTypeEnum(int index, String name){
            this.index = index;
            this.name = name;
        }

        public static RebeatTypeEnum getByIndex(Integer index){
            if(index == null){
                return null;
            }
            for(RebeatTypeEnum e : RebeatTypeEnum.values()){
                if(e.getIndex() == index.intValue()){
                    return e;
                }
            }
            return null;
        }
    }
}
