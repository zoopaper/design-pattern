package com.pattern.strategy;

import java.util.Collection;

public class BubbleSort implements SortStrategy {

    @Override
    public void sort(Collection col) {
        System.out.println("BubbleSort.........");
    }

}
