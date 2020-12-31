package com.lyqc.base.tuple;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: Tuple容器类
 * @Date : 上午10:36 2017/9/28
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThreeTuple<A,B,C> {
    /**
     * 容器元素1
     */
    private A first;
    /**
     * 容器元素2
     */
    private B second;
    /**
     * 容器元素3
     */
    private C third;

    /**
     * 静态方法，返回一个容器实例对象
     * @param a 容器元素1
     * @param b 容器元素2
     * @param c 容器元素3
     * @param <A>
     * @param <B>
     * @param <C>
     * @return
     */
    public static <A,B,C> ThreeTuple<A,B,C> newInstance(A a, B b, C c){
        return new ThreeTuple(a,b,c);
    }
}
