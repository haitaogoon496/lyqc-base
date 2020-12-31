package com.lyqc.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: Bean 和 Map 转换
 * 相关说明：https://blog.csdn.net/a859522265/article/details/7195386
 * 特别注意：
 * avaBean的属性是根据其中的setter和getter方法来确定的，而不是根据其中的成员变量。如果方法名为setId，中文意思即为设置id，至于你把它存到哪个变量上，用管吗？
 * 如果方法名为getId，中文意思即为获取id，至于你从哪个变量上取，用管吗？去掉set前缀，剩余部分就是属性名，如果剩余部分的第二个字母是小写的，则把剩余部分的首字母改成小的。
 * setId()的属性名---->id
 * isLast()的属性名---->last
 * setCPU的属性名是什么?---->CPU
 * getUPS的属性名是什么？---->UPS
 * 总之，一个类被当作javaBean使用时，JavaBean的属性是根据方法名推断出来的，它根本看不到java类内部的成员变量。
 * @Date : 2018/7/8 上午10:53
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public final class BeanMapper {
    /**
     * Map 转换 Bean
     * @param map
     * @param beanClass
     * @return
     * @throws Exception
     */
    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws RuntimeException {
        if (map == null)
            return null;
        Object obj;
        try {
            obj = beanClass.newInstance();
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                Method setter = property.getWriteMethod();
                if (setter != null) {
                    setter.invoke(obj, map.get(property.getName()));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("BeanMapper mapToObject 异常");
        }
        return obj;
    }

    /**
     * Bean 转换Map
     * @param obj
     * @return
     * @throws Exception
     */
    public static Map<String, Object> objectToMap(Object obj) throws RuntimeException {
        if(obj == null)
            return null;
        Map<String, Object> map;
        try {
            map = new HashMap<>();
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                if (key.compareToIgnoreCase("class") == 0) {
                    continue;
                }
                Method getter = property.getReadMethod();
                Object value = getter!=null ? getter.invoke(obj) : null;
                map.put(key, value);
            }
        }catch (Exception e) {
            throw new RuntimeException("BeanMapper mapToObject 异常");
        }
        return map;
    }

    private BeanMapper(){}
}
