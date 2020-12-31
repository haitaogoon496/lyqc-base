package com.lyqc.util;

import com.lyqc.base.enums.EnumDesc;
import com.lyqc.base.enums.EnumValue;
import com.lyqc.base.enums.RuleConditionConstant;
import com.lyqc.product.enums.ConstEnum;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @description: 枚举转换类
 * @Date : 2018/6/11 下午6:16
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public final class EnumConvert {

    private static final String SYMBOL = ",";
    private static final String DEFAULT_VALUE = "";

    /**
     * 把枚举成员的对应索引获取其name值，返回一个字符串
     * @param enumValues 枚举成员
     * @param value 以,分割的索引字符串
     * @return
     */
    public static final String convertIndex2String(EnumValue[] enumValues,String value){
        return convertIndex2String(enumValues,value,DEFAULT_VALUE);
    }
    /**
     * 把枚举成员的对应索引获取其name值，返回一个字符串
     * @param enumValues 枚举成员
     * @param value 以,分割的索引字符串
     * @return
     */
    public static final String convertIndex2String(EnumValue[] enumValues,String value,String defaultValue){
        if(null == value || "".equals(value)){
            return defaultValue;
        }
        return convertIndex2String(enumValues,Arrays.asList(value.split(SYMBOL)));
    }
    /**
     * 把枚举成员的对应索引获取其name值，返回一个字符串
     * @param enumValues 枚举成员
     * @param values 要迭代的集合,Collection<E> 接口只能传String、Character、Integer、Short类型</>
     * @return
     */
    public static final String convertIndex2String(EnumValue[] enumValues,Collection<Object> values){
        Map<Integer,String> map = Arrays.asList(enumValues).stream().collect(Collectors.toMap(EnumValue::getIndex,EnumValue::getName));
        return appendEnumValue(map,values);
    }

    /**
     * 把枚举成员的对应索引获取其name值，返回一个字符串
     * @param enumValues 枚举成员
     * @param values 要迭代的集合,Collection<E> 接口只能传String、Character、Integer、Short类型</>
     * @return
     */
    public static final String convertIndex2String(EnumDesc[] enumValues, Collection<Object> values, Function<EnumDesc,String> valueMapper){
        Map<Integer,String> map = Arrays.asList(enumValues).stream().collect(Collectors.toMap(EnumDesc::getIndex,valueMapper));
        return appendEnumValue(map,values);
    }

    /**
     * 循环Collection<Object>集合，并从map容器中获取对应的元素返回字符串
     * @param map map容器
     * @param values Collection<Object>集合
     * @return
     */
    protected static String appendEnumValue(Map<Integer,String> map,Collection<Object> values){
        StringBuffer sb = new StringBuffer();
        for(Object each : values){
            String enumValue = null;
            if(each instanceof Integer || each instanceof Short || each instanceof String || each instanceof Character){
                enumValue = map.get(Integer.valueOf(each.toString()));
            }
            if(enumValue != null){
                sb.append(enumValue).append(SYMBOL);
            }
        }
        String result = sb.toString();
        return result.length() > 0 && result.endsWith(SYMBOL) ? result.substring(0,result.length() - 1) : result;
    }

    private EnumConvert(){}

    public static void main(String[] args) {
        System.out.println(convertIndex2String(RuleConditionConstant.IsLcvEnum.values(),"","不限"));
        System.out.println(convertIndex2String(RuleConditionConstant.IsLcvEnum.values(),Arrays.asList("0","1")));
        System.out.println(convertIndex2String(RuleConditionConstant.IsLcvEnum.values(),Arrays.asList(0,1)));
        System.out.println(convertIndex2String(RuleConditionConstant.IsLcvEnum.values(),Arrays.asList('0','1')));
        System.out.println(convertIndex2String(ConstEnum.DriverLicenseOwnerNewEnum.values(),Arrays.asList("01"),EnumDesc::getDesc));
    }
}
