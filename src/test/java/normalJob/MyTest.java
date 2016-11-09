package normalJob;

import org.junit.Test;

import com.huan.visit.httphelper.VisitThread;


public class MyTest {
	
	@Test
	public void test(){
		String web1="https://don-fandy.rhcloud.com/beta2/index.jsp";
		String web2="https://util-fandy.rhcloud.com/input.action";
		new Thread(new VisitThread(web1)).start();
		new Thread(new VisitThread(web2)).start();
	}
	

}
