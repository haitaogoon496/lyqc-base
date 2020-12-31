package com.lyqc.base.tuple;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: Tuple容器类
 * @Date : 上午10:33 2017/9/28
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tuple<A> {
    /**
     * 容器元素
     */
    private A first;
    /**
     * 静态方法，返回一个容器实例对象
     * @param a 容器元素
     * @param <A>
     * @return
     */
    public static <A> Tuple<A> newInstance(A a){
        return new Tuple<>(a);
    }
}
