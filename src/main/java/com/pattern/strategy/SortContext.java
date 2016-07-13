package com.pattern.strategy;

import java.util.Collection;

/**
 * 排序使用上下文
 */
public class SortContext {

    /**
     * 排序策略接口
     */
    private SortStrategy sortStrategy;

    public SortStrategy getSortStrategy() {
        return sortStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(Collection col) {
        sortStrategy.sort(col);
    }

}
