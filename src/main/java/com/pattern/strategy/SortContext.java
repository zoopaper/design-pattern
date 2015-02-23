package com.pattern.strategy;

import java.util.Collection;

public class SortContext {

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
