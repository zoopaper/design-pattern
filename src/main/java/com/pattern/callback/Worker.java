package com.pattern.callback;

/**
 * @author krisjin
 * @date 2015-2-9
 */
public class Worker {

	public void doWork() {
		Fetcher fetcher = new GithubFetcher(new Data(0, 2));
		fetcher.fetchData(new FetcherCallback() {

			public void onError(Throwable cause) {
				System.out.println("An error accour " + cause.getMessage());
			}

			public void onData(Data data) throws Exception {
				System.out.println("Data received: " + data);
			}
		});

	}
	
	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.doWork();
	}
}
