package com.lyqc.base.common.validation;

import com.lyqc.base.enums.EnumValue;
import net.sf.oval.configuration.annotation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description: 用户规约DTO相关必须枚举字段的注解约束
 * @Date : 2018/6/2 下午2:42
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Constraint(checkWith = EnumValidator.class)
public @interface EnumValidation {
    /**
     * 枚举调用方法
     */
    enum InvokeMethod{
        getIndex,getName
    }
    /**
     * 是否可以为空
     * @return
     */
    boolean acceptNull() default false;
    /**
     * 调用枚举方法
     * @return
     */
    InvokeMethod method() default InvokeMethod.getIndex;
    /**
     * 校验信息，支持形如 "[户口性质]不合法，必须({0})"，这时会取对应枚举的成员替换消息模板中的占位符
     * @return
     */
    String message() default "非法枚举值";
    /**
     * 枚举类
     * @return
     */
    Class<?> enums() default EnumValue.class;
}
