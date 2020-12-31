package com.lyqc.contract.enums.common;

import com.lyqc.base.enums.EnumDesc;
import com.lyqc.receiveorder.enums.YulvMethodEnum;

/**
 * 电子合同url枚举
 * @author huyue
 * @date 2018/12/11 14:25
 */
public enum  EContractMethodEnum implements EnumDesc {


    PROCESS_CREATE_PAPER_BATCH(1001,"/doraemon/process/createPaperBatch/{channel}/{appCode}","相同合同号批量创建纸质合同"),
    PROCESS_CREATE_ELE_BATCH(1002,"/doraemon/process/createEleBatch/{channel}/{appCode}","相同合同号批量创建电子合同"),
    PROCESS_SIGN_CONTRACT(1003,"/doraemon/process/sign/{appCode}","进行合同签署"),
    PROCESS_ADD_FINAL_CONTRACT(1004,"/doraemon/process/addFinalContract","添加外部生成最终查询合同"),
    PROCESS_ADD_SIGN_CONTRACT(1005,"/doraemon/process/sign/{appCode}","添加签署合同"),



    QUERY_CONTRACT_DATA(2001,"/doraemon/query/data/{channel}/{appCode}/{contractCode}","根据订单号和类型查询创建合同数据"),
    QUERY_CONTRACT_STATUS(2002,"/doraemon/query/status/{channel}/{batchId}","根据批次号查询签约状态"),
    QUERY_CONTRACT_PUSH_LIST(2003,"/doraemon/query/data/push/{appCode}","进行合同签署")


    ;

    /**
     * 方法编号
     * 规则4位，前两位表示同一业务范围  后两位表示序号
     */
    private Integer index;
    /**
     * url
     */
    private String url;
    /**
     * 描述
     */
    private String desc;

    EContractMethodEnum(Integer index, String url, String desc) {
        this.index = index;
        this.url = url;
        this.desc = desc;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public String getName() {
        return getUrl();
    }

    public String getUrl() {
        return url;
    }

    public static YulvMethodEnum getYulvMethodEnum(String url){
        YulvMethodEnum[] values = YulvMethodEnum.values();
        for (YulvMethodEnum methodEnum : values) {
            String url1 = methodEnum.getUrl();
            if (url1.equals(url)){
                return methodEnum;
            }
        }
        return null;
    }

    /***获取实际的URL**/
    public String getUrl(String ... args){
        if (args.length == 0){
            return url;
        }
        String result=url;
        for (String arg : args) {
            result = result.replaceFirst("\\{[a-zA-Z]+\\}", arg);
        }
        return result;
    }
}
