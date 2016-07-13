package com.pattern.strategy;

import java.util.Collection;

/**
 * 排序策略接口定义
 *
 * @author krisjin
 */
public interface SortStrategy {

    public void sort(Collection collection);

}
