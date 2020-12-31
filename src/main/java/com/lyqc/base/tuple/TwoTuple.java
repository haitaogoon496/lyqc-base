package com.lyqc.base.tuple;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: Tuple容器类
 * @Date : 上午10:35 2017/9/28
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwoTuple<A,B> {
    /**
     * 容器元素1
     */
    private A first;
    /**
     * 容器元素2
     */
    private B second;

    /**
     * 静态方法，返回一个容器实例对象
     * @param a 容器元素1
     * @param b 容器元素2
     * @param <A>
     * @param <B>
     * @return
     */
    public static <A,B> TwoTuple<A,B> newInstance(A a, B b){
        return new TwoTuple(a,b);
    }
}
