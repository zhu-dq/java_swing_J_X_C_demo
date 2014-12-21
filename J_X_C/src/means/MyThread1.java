package means;

import java.text.SimpleDateFormat;
import java.util.Date;
import Jframe.xiaoshoutuihuo;

public class MyThread1 extends  Thread{	
	SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
				Date d=new Date();	
				xiaoshoutuihuo.settxt(sd.format(d));
			} catch (Exception e) {
				System.out.println("shiÎÒÂð");
			}
			
		}
		
	}
}

