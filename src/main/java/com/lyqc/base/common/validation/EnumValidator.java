package com.lyqc.base.common.validation;

import net.sf.oval.Validator;
import net.sf.oval.configuration.annotation.AbstractAnnotationCheck;
import net.sf.oval.context.FieldContext;
import net.sf.oval.context.OValContext;
import net.sf.oval.exception.OValException;

import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 用户规约DTO相关必须枚举字段的注解约束
 * @Date : 2018/6/2 下午3:00
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public class EnumValidator extends AbstractAnnotationCheck<EnumValidation> {
    @Override 
    public boolean isSatisfied(Object target, Object value, OValContext ctx, Validator validator) throws OValException {
        try {
            if(null == value || "".equals(value.toString())){
                return true;
            }
            EnumValidation constraint = ((FieldContext) ctx).getField().getDeclaredAnnotation(EnumValidation.class);
            Class<?> clazz = constraint.enums();
            if(clazz.isEnum() && !constraint.acceptNull() ){
                EnumValidation.InvokeMethod method = constraint.method();
                Method  getIndex = clazz.getMethod(method.name());
                List<String> indexes = new ArrayList<>();
                for(Object obj : clazz.getEnumConstants()){
                    indexes.add(getIndex.invoke(obj).toString());
                }
                String message = MessageFormat.format(constraint.message(),indexes.toString());
                super.setMessage(message);
                return indexes.contains(value.toString());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }
}
