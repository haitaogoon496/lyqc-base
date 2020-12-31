package com.lyqc.base.page;

import java.io.Serializable;

/**
 * Description: 分页Form类<br/>
 * @version V1.0  by 石冬冬-Heil Hitler on  2017/4/27 12:48
 */
public class PageForm<T> implements Serializable {
    private static final long serialVersionUID = 1315360688901318671L;
    private int draw;
    /**
     * 分页起止
     */
    private int start = 0;
    /**
     * 分页大小（每页多数条）
     */
    private int limit = 20;
    /**
     * 是否分页
     */
    private boolean paging = true;
    /**
     * 分页包装的Form条件
     */
    private T form;

    public PageForm() {
    }

    public PageForm(T form) {
        this.form = form;
    }

    public PageForm(int start, int limit, T form) {
        this.start = start;
        this.limit = limit;
        this.form = form;
    }

    public PageForm(boolean paging) {
        this.paging = paging;
    }

    public PageForm(boolean paging, T form) {
        this.paging = paging;
        this.form = form;
    }

    /**
     * 静态实例方法，外部调用
     * @param start 分页起止
     * @param limit 分页大小（每页多数条）
     * @param form 分页包装的Form条件
     * @param <T>
     * @return
     */
    public static <T> PageForm newInstance(int start, int limit, T form){
        return new PageForm(start,limit,form);
    }

    /**
     * 静态实例方法，外部调用
     * @param paging 是否分页
     * @param form 分页包装的Form条件
     * @param <T>
     * @return
     */
    public static <T> PageForm newInstance(boolean paging,T form){
        return new PageForm(paging,form);
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public T getForm() {
        return form;
    }

    public void setForm(T form) {
        this.form = form;
    }

    public boolean isPaging() {
        return paging;
    }

    public void setPaging(boolean paging) {
        this.paging = paging;
    }
}
