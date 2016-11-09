package com.huan.visit.httphelper;

public class Main {

	public static void main(String[] args) {
		String web1="https://don-fandy.rhcloud.com/course_sort/notdone.jsp";
		String web2="https://util-fandy.rhcloud.com/input.action";
		new Thread(new VisitThread(web1)).start();
		new Thread(new VisitThread(web2)).start();
	}
}
