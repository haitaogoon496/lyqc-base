package com.lyqc.base.common.validation;

import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import net.sf.oval.configuration.annotation.AbstractAnnotationCheck;
import net.sf.oval.context.FieldContext;
import net.sf.oval.context.OValContext;
import net.sf.oval.exception.OValException;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.List;

/**
 * @description: 级联对象oval验证，级联对象可以是collection集合或者普通object对象。
 * @see  com.lyqc.gpsprovider.dto.GpsInstallInfoDTO
 * @Date : 2018/11/14 下午1:38
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public class CascadeValidator extends AbstractAnnotationCheck<CascadeValidation> {
    @Override
    public boolean isSatisfied(Object target, Object value, OValContext ctx, Validator validator) throws OValException {
        boolean satisfied = true;
        try {
            CascadeValidation constraint = ((FieldContext) ctx).getField().getDeclaredAnnotation(CascadeValidation.class);
            if(!constraint.acceptNull()){
                if(value instanceof Collection){
                    Collection collection = (Collection)value;
                    if(collection.isEmpty()){
                        super.setMessage(MessageFormat.format("级联对象{0}不能为空",constraint.value()));
                        satisfied = false;
                    }else{
                        for(Object each : collection){
                            satisfied = validate(each);
                            if(!satisfied){
                                break;
                            }
                        }
                    }
                }else{
                    if(null == value){
                        super.setMessage(MessageFormat.format("级联对象{0}不能为空",constraint.value()));
                        satisfied = false;
                    }else{
                        satisfied = validate(value);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return satisfied;
    }

    protected boolean validate(Object value){
        Validator valid = new Validator();
        List<ConstraintViolation> violations = valid.validate(value);
        if (!violations.isEmpty()) {
            String message = violations.get(0).getMessage();
            super.setMessage(message);
            return false;
        }
        return true;
    }
}
