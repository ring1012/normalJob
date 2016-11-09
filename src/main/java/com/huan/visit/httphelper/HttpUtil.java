package com.huan.visit.httphelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {

	public static void visitWeb(String strURL) throws Exception {
		URL url = new URL(strURL);
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		InputStreamReader input = new InputStreamReader(httpConn.getInputStream(), "utf-8");
		BufferedReader bufReader = new BufferedReader(input);
		String line = "";
		StringBuilder contentBuf = new StringBuilder();
		while ((line = bufReader.readLine()) != null) {
			contentBuf.append(line);
		}
		String buf = contentBuf.toString();
		System.out.println(buf);
	}

}
