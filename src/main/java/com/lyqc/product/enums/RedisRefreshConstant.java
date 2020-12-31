package com.lyqc.product.enums;

import com.lyqc.base.enums.EnumValue;

/**
 * @description: Redis缓存刷新相关常量枚举
 * @Date : 2019/1/2 下午7:01
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public final class RedisRefreshConstant {
    /**
     * @description: 事件源类型
     * @Date : 2019/1/2 下午7:02
     * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
     */
    public enum EventSource implements EnumValue {
        METADATA(1,"数据字典"),
        PRODUCT_INFO(2,"产品详情"),
        ;

        private int index;
        private String name;

        EventSource(int index, String name){
            this.name = name;
            this.index = index;
        }

        @Override
        public int getIndex() {
            return index;
        }

        @Override
        public String getName() {
            return name;
        }

        public static String getNameByIndex(int index){
            for(EventSource e : EventSource.values()){
                if(e.getIndex() == index){
                    return e.getName();
                }
            }
            return null;
        }

        public static EventSource getByIndex(int index){
            for(EventSource e : EventSource.values()){
                if(e.getIndex() == index){
                    return e;
                }
            }
            return null;
        }
    }
}
