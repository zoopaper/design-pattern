package com.pattern.callback;

public interface FetcherCallback {
	
	public void onData(Data data) throws Exception;

	public void onError(Throwable cause);
}
