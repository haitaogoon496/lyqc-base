package com.lyqc.util;

import com.lyqc.base.common.Result;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * @description: DTO基于validation注解校验工具类
 * @Date : 2018/1/2 下午4:09
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public class DTOValidator<R, T> {
    /**
     * 基于DTO注解的教研约束
     * @param t
     * @return
     */
    public Result<R> validate(T t) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        javax.validation.Validator validator = factory.getValidator();
        StringBuilder builder = new StringBuilder();

        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
        for (ConstraintViolation<T> constraintViolation : constraintViolations) {
            builder.append("")
                    .append(constraintViolation.getPropertyPath())
                    .append("[")
                    .append(constraintViolation.getInvalidValue())
                    .append("]:")
                    .append(constraintViolation.getMessage())
                    .append("; ");
        }

        if (builder.length() == 0) {
            return Result.suc();
        } else {
            return Result.fail(builder.toString());
        }
    }

    /**
     * 基于DTO注解的教研约束
     * 只返回注解内的值
     * @param t
     * @return
     */
    public Result<R> validateOnlyMsg(T t) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        javax.validation.Validator validator = factory.getValidator();
        StringBuilder builder = new StringBuilder();

        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
        for (ConstraintViolation<T> constraintViolation : constraintViolations) {
            builder.append("")
                    .append(constraintViolation.getMessage())
                    .append("; ");
        }

        if (builder.length() == 0) {
            return Result.suc();
        } else {
            return Result.fail(builder.toString());
        }
    }
}

