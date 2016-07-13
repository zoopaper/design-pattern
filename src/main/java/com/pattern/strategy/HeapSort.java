package com.pattern.strategy;

import java.util.Collection;

public class HeapSort implements SortStrategy {

    @Override
    public void sort(Collection col) {
        System.out.println("heapsort.........");
    }

}
