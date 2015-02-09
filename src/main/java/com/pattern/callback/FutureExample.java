package com.pattern.callback;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newCachedThreadPool();

		Runnable task1 = new Runnable() {

			public void run() {
				System.out.println("I am task1......");
			}
		};

		Callable<Integer> task2 = new Callable() {

			@Override
			public Object call() throws Exception {

				// dodo
				return new Integer(1);
			}
		};

		Future<?> f1 = executor.submit(task1);
		Future<Integer> f2 = executor.submit(task2);
		
		System.out.println("task1 is completed? "+f1.isDone());
		System.out.println("task2 is completed? "+f2.isDone());
		
		while(f1.isDone()){
			System.out.println("task1 is completed");
			break;
		}
		
		while(f2.isDone()){
			System.out.println("return value by task2: "+f2.get());
			break;
		}
		
		
	}

}
