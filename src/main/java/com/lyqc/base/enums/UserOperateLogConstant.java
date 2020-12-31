package com.lyqc.base.enums;

/**
 * @description: 用户操作日志相关枚举
 * @Date : 2018/3/3 上午11:06
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public final class UserOperateLogConstant {
    /**
     * @description: 用户操作日志 操作类型 枚举
     * @Date : 2018/3/3 上午11:06
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum AuthTypeEnum implements EnumValue {
        //创建记录操作
        CREATE(1,"C"),
        //修改记录操作
        UPDATE(2,"U"),
        //删除记录操作
        DELETE(3,"D");
        AuthTypeEnum(int index, String name) {
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
            for(AuthTypeEnum e : AuthTypeEnum.values()){
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
        public static AuthTypeEnum getByIndex(int index){
            for(AuthTypeEnum e : AuthTypeEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 用户操作日志 业务类型 枚举
     * @Date : 2018/3/3 上午11:06
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    @Deprecated
    public enum AuthModelEnum implements EnumValue {
        /**
         * 注意 100001~100010 微信相关操作
         */
        WECHAT_LOGIN(100001,"微信登录"),
        WECHAT_APP_INFO_SAVE(100002,"微信保存申请单操作"),
        WECHAT_APP_INFO_UPDATE(100003,"微信更新申请单操作"),
        WECHAT_APP_INFO_SUBMIT(100004,"微信提交申请单操作"),
        WECHAT_APP_INFO_UPLOAD_ATTACH(100005,"微信上传申请附件操作"),
        WECHAT_APP_INFO_UPLOAD_LOAN_BEFORE_DOCS(100006,"微信上传贷前附件操作"),
        WECHAT_APP_INFO_UPLOAD_LOAN_AFTER_DOCS(100007,"微信上传贷后附件操作"),
        WECHAT_MESSAGE(100008,"微信留言操作"),
        WECHAT_GPS_UPLOAD_ATTACH(100009,"微信上传GPS附件操作"),
        WECHAT_APP_INFO_SQUARE(100010,"微信申请提前结清操作"),
        /**
         * 注意 100111~100115 车贷产品相关操作
         */
        CAR_PRODUCT_REVIEW(100111,"车贷产品复核"),
        CAR_PRODUCT_ENABLE(100112,"车贷产品启用"),
        CAR_PRODUCT_MODIFY(100113,"车贷产品修改"),
        CAR_PRODUCT_PAUSE(100114,"车贷产品暂停"),
        CAR_PRODUCT_MANAGE(100115,"车贷产品管理"),
        CAR_PRODUCT_TYPE(100116,"产品分类管理"),
        CAR_PRODUCT_CONTRACT(100117,"产品与其对应的合同管理"),
        CAR_PRODUCT_COMPONENT(100118,"产品组件配置"),
        /**
         * 注意 100201~100299 车贷申请单相关操作
         */
        APP_CREATE(100201,"车贷申请单创建"),
        APP_UPDATE(100202,"车贷申请单修改"),
        APP_CANCEL(100203,"车贷申请单取消"),
        LOAN_ACCOUNT(100211,"贷款账号操作"),
        /**
         * 注意 100301~100340 车贷审批相关操作
         */
        APPROVE_END(100304,"终审审批"),
        APPROVE_REPEAT(100305,"复审审批、退回复审审批"),
        APP_APPROVE(100313,"车贷审批"),
        LOAN_AFTER_DOCS(100314,"贷后资料"),
        APPROVE_UPDATE(100321,"车贷申请单修改"),
        APP_DIVIDE_DONE(100325,"分单管理-分单操作"),
        APP_DIVIDE_REJECT(100326,"分单管理-退单单操作"),
        APP_INFO_APPROVE(100340,"车贷申请单审批"),
        /**
         * 注意 100401~100499 产品费用规则 相关操作
         */
        GPS_RULE(100401,"GPS规则配置"),
        RATE_RULE(100402,"利率规则配置"),
        SER_FIN_RULE(100403,"平台费规则配置"),
        INSURANSE_RULE(100404,"第{0}年保险费规则配置"),
        ACCOUNT_RULE(100405,"账户管理费规则配置"),
        YAN_BAO_RULE(100640,"延保费规则配置"),
        LIFE_INSURANSE(100407,"人身保险费规则配置"),
        PRODUCT_RULE(100408,"产品规则配置"),
        AUTO_APPR_RULE(100409,"前置规则配置"),
        AUTO_APPR_RULE_PROP(100410,"前置规则属性配置"),
        APPLY_DEALER(100411,"管理所属门店"),
        RULE_TAG(100412,"规则标签管理"),
        PD_RULE_GROUP(100413,"规则组管理"),
        DEALER_FEE_RULE_SET(100414,"批量关联设置"),
        POST_POSITION_RULE(100415,"后置规则"),
        POST_POSITION_RULE_DETAUL(100416,"后置规则属性"),
        AUTO_APPR_RULE_STATUS(100417,"前置规则状态"),
        POST_POSITION_RULE_STATUS(100418,"后置规则状态"),

        /**
         * 注意 100501~100599 基础数据管理 相关操作
         */
        SY_ARG_CONTROL(100501,"数据字典管理"),
        SY_DEALER_MANAGER(100502,"门店管理"),
        PD_CALC_MODEL(100503, "产品公式配置"),
        PD_CALC_MODEL_PARAMS(100504, "公式参数配置"),
        PD_CALC_LOG(100505, "产品计算log"),
        PD_GRAYSCALE_CONTROL(100506, "灰度中心控制"),
        PD_CONFIG_PARAM(100507, "系统参数配置"),
        USER_OPERATE_LOG(100508, "用户操作日志"),
        FUND(100509,"资金方配置"),
        PD_FUND_RULE(100510,"资金方规则"),
        PD_FUND_RULE_PROP(100511,"资金方规则属性"),
        PD_CALC_FORMULA_PARAMS(100512, "产品公式合法参数配置");


        AuthModelEnum(int index, String name) {
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
            for(AuthModelEnum e : AuthModelEnum.values()){
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
        public static AuthModelEnum getByIndex(int index){
            for(AuthModelEnum e : AuthModelEnum.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
    /**
     * @description: 只提供给金融产品使用
     * @Date : 2019/2/27 下午7:47
     * @Author : 石冬冬-Seig Heil
     */
    public enum AuthModelEnumForProduct implements EnumValue {
        CAR_PRODUCT_MANAGE(100115,"车贷产品管理"),
        CAR_PRODUCT_TYPE(100116,"产品分类管理"),
        CAR_PRODUCT_FEE_SET(100118,"产品费用设置"),
        /**
         * 注意 100401~100499 产品费用规则 相关操作
         */
        GPS_RULE(100401,"GPS规则配置"),
        RATE_RULE(100402,"利率规则配置"),
        SER_FIN_RULE(100403,"平台费规则配置"),
        INSURANSE_RULE(100404,"第{0}年保险费规则配置"),
        ACCOUNT_RULE(100405,"账户管理费规则配置"),
        YAN_BAO_RULE(100640,"延保费规则配置"),
        LIFE_INSURANSE(100407,"人身保险费规则配置"),
        PRODUCT_RULE(100408,"产品规则配置"),
        AUTO_APPR_RULE(100409,"前置规则配置"),
        AUTO_APPR_RULE_PROP(100410,"前置规则属性配置"),
        APPLY_DEALER(100411,"管理所属门店"),
        RULE_TAG(100412,"规则标签管理"),
        DEALER_FEE_RULE_SET(100414,"批量关联设置"),
        POST_POSITION_RULE(100415,"后置规则"),
        POST_POSITION_RULE_DETAUL(100416,"后置规则属性"),
        AUTO_APPR_RULE_STATUS(100417,"前置规则状态"),
        POST_POSITION_RULE_STATUS(100418,"后置规则状态"),

        /**
         * 注意 100501~100599 基础数据管理 相关操作
         */
        SY_ARG_CONTROL(100501,"数据字典管理"),
        SY_DEALER_MANAGER(100502,"门店管理"),
        PD_CALC_MODEL(100503, "产品公式配置"),
        PD_CALC_MODEL_PARAMS(100504, "公式参数配置"),
        PD_CALC_LOG(100505, "产品计算log"),
        PD_GRAYSCALE_CONTROL(100506, "灰度中心控制"),
        PD_CONFIG_PARAM(100507, "系统参数配置"),
        USER_OPERATE_LOG(100508, "用户操作日志"),
        FUND(100509,"资金方配置"),
        PD_FUND_RULE(100510,"资金方规则"),
        PD_FUND_RULE_PROP(100511,"资金方规则属性"),
        PD_CALC_FORMULA_PARAMS(100512, "产品公式合法参数配置"),
        SY_DEALER_COMPANY(100513, "门店单位管理");


        AuthModelEnumForProduct(int index, String name) {
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
            for(AuthModelEnumForProduct e : AuthModelEnumForProduct.values()){
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
        public static AuthModelEnumForProduct getByIndex(int index){
            for(AuthModelEnumForProduct e : AuthModelEnumForProduct.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
