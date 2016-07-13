package com.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * User: shijingui
 * Date: 2016/7/13
 */
public class Main {
    public static void main(String[] args) {
        SortContext sortContext = new SortContext();
        sortContext.setSortStrategy(new BubbleSort());
        List nameList = new ArrayList<String>();
        sortContext.sort(nameList);
    }
}
