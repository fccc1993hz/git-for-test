package com.fccc.git;

import java.util.List;

/**
 * 此类所有计数字段从1开始
 */
public class Page<T> {
    /**
     * 当前页
     */
    private int currentIndex;

    /**
     * 每页记录数
     */
    private int pageSize = 10;

    /**
     * 总记录数
     */
    private int totalNumber;

    /**
     * 总页数
     */
    private int totalPage;

    /**
     * 下一页
     */
    private int nextIndex;

    /**
     * 上一页
     */
    private int preIndex;

    /**
     * 当前页的数据记录
     */
    private List<T> items;

    public Page() {
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public int getTotalPage() {
        int size = this.totalNumber / this.pageSize;
        if (this.totalNumber % this.pageSize != 0) {
            size = size + 1;
        }
        return size;
    }

    public int getNextIndex() {
        if (this.currentIndex >= this.getTotalPage()) {
            this.nextIndex = this.currentIndex;
        } else {
            this.nextIndex = this.currentIndex + 1;
        }
        return nextIndex;
    }

    public int getPreIndex() {
        if (this.currentIndex <= 1) {
            this.preIndex = 1;
        } else {
            this.preIndex = this.currentIndex - 1;
        }

        return preIndex;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
