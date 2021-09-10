package com.pattern.strategy;

import java.util.Collection;

public class QuickSort implements SortStrategy {

    @Override
    public void sort(Collection col) {
        System.out.println("QuickSort..........");
    }

}
