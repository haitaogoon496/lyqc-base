package com.lyqc.base.common.validation;

import net.sf.oval.configuration.annotation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @description: 级联DTO对象验证
 * @Date : 2018/7/27 下午5:33
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Constraint(checkWith = CascadeValidator.class)
public @interface CascadeValidation {
    /**
     * 是否可以为空
     * @return
     */
    boolean acceptNull() default false;
    /**
     * 绑定对象
     * @return
     */
    String value();
    /**
     * 校验信息
     * @return
     */
    String message() default "级联对象验证不通过";
}
