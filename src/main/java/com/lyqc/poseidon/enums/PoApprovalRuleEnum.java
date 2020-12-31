package com.lyqc.poseidon.enums;


/**
 * @Author：rongss
 * @Description
 * @Date：Created in 10:57 AM 2018/11/15
 */
public class PoApprovalRuleEnum {

    public enum RuleTypeEnum {

        RULE("RULE","规则校验数据"),
        DEFAULT("DEFAULT","默认数据");

        private String type;
        private String description;

        RuleTypeEnum(String type,String description){
            this.type = type;
            this.description = description;
        }

        public String getType() {
            return type;
        }

        public String getDescription() {
            return description;
        }
    }



    public enum RuleIdEnum {

        P0001("P0001", "二手车车价上浮比例"),
        P0002("P0002", "二手车车况"),
        P0003("P0003", "发送邮件时间控制"),
        P0004("P0004", "修改复审信息开关"),
        P0005("P0005", "微众校验");

        private String ruleId;
        private String ruleName;

        RuleIdEnum(String ruleId, String ruleName) {
            this.ruleId = ruleId;
            this.ruleName = ruleName;
        }

        public String getRuleId() {
            return ruleId;
        }

        public String getRuleName() {
            return ruleName;
        }

        public static PoApprovalRuleEnum.RuleIdEnum getRuleId(String ruleId){
            for(PoApprovalRuleEnum.RuleIdEnum e : PoApprovalRuleEnum.RuleIdEnum.values()){
                if(e.getRuleId().equals(ruleId)){
                    return e;
                }
            }
            return null;
        }
    }
}
