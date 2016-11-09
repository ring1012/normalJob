package com.huan.visit.httphelper;

public class VisitThread implements Runnable {

	private String url;
	
	
	public VisitThread(String url){
		this.url=url;
		
	}
	
	public void run() {
		try {
			HttpUtil.visitWeb(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}

}
