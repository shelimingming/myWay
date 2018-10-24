package com.myway.product.util;

import java.util.List;

public class Page<T> {
    private List<T> objectList;
    //起始索引
    private int start;
    //当前页数
    private int pageNum;
    //页面容量
    private int pageSize;
    //总个数
    private long totalCount;

    public List<T> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<T> objectList) {
        this.objectList = objectList;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "Page{" +
                "objectList=" + objectList +
                ", start=" + start +
                ", nowPage=" + pageNum +
                ", pageSize=" + pageSize +
                ", totalCount=" + totalCount +
                '}';
    }
}
