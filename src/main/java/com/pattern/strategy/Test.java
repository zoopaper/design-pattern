package com.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * User: krisjin
 * Date: 2016/7/13
 */
public class Test {
    public static void main(String[] args) {
        SortContext sortContext = new SortContext();
        sortContext.setSortStrategy(new BubbleSort());
        List nameList = new ArrayList<String>();
        sortContext.sort(nameList);
    }
}
