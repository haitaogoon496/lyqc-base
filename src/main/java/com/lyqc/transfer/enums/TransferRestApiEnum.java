package com.lyqc.transfer.enums;

import com.lyqc.base.enums.EnumDesc;

/**
 * @description: transfer 服务提供接口枚举类
 * @Date : 2019/3/26 0026 13:18
 * @Author : 尚凌宇
 */
public enum TransferRestApiEnum implements EnumDesc {

    DEALER_QUERY_LOADRECORD(1, "/dealer/loadRecords", "查询门店列表"),

    DICTIONARY_QUERY_LOADRECORD(10, "/dictionaryReg/loadRecords", "查询行政地区列表"),
    DICTIONARY_QUERY_CITY(11, "/dictionaryReg/queryCity", "查询行政城市列表"),

    METADATA_INIT(20, "/metadata/init", "辛巴数据字典初始化"),
    // get 请求
    METADATA_QUERY_ONE(21, "/metadata/queryOne/{0}", "根据 type 查询数据字典"),
    METADATA_QUERY_LIST(22, "/metadata/queryList", "根据 typeList 查询数据字典"),
    ;

    private Integer index;
    private String name;
    private String value;

    TransferRestApiEnum(Integer index,String name,String desc) {
        this.index = index;
        this.name = name;
        this.value = desc;
    }


    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDesc() {
        return this.value;
    }

    public static String getNameByIndex(int index){
        for(TransferRestApiEnum e : TransferRestApiEnum.values()){
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
    public static TransferRestApiEnum getByIndex(int index){
        for(TransferRestApiEnum e : TransferRestApiEnum.values()){
            if(e.getIndex() == index){
                return e;
            }
        }
        return null;
    }

    /**
     * 根据索引获取枚举对象
     * @param desc 索引
     * @return
     */
    public static TransferRestApiEnum getByDesc(String desc){
        for(TransferRestApiEnum e : TransferRestApiEnum.values()){
            if(e.getDesc().equals(desc)){
                return e;
            }
        }
        return null;
    }
}
