package com.huan.visit.httphelper;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {
	
	public static void visitWeb(String strURL) throws Exception{
		URL url = new URL(strURL);
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		new InputStreamReader(httpConn.getInputStream(), "utf-8");
	}

}
