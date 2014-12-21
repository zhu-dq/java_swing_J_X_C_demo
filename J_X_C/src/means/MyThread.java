package means;

import java.text.SimpleDateFormat;
import java.util.Date;

import Jframe.xiaoshoudan;

public class MyThread extends  Thread{	
	SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
				Date d=new Date();	
				xiaoshoudan.settxt(sd.format(d));
			} catch (Exception e) {
				System.out.println("shiÎÒÂð");
			}
			
		}
		
	}
}

