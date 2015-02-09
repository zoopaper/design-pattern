package com.pattern.callback;

public class GithubFetcher implements Fetcher {

	private final Data data;

	public GithubFetcher(Data data) {
		this.data = data;
	}

	public void fetchData(FetcherCallback callback) {
		try {
			callback.onData(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
