	package JXC;
	
	import java.awt.List;
	import java.util.*;

import means.dushuju_gys;
	
	import User.Suppliers;
import User.User;
	
	public class jxc_gys {
		static ArrayList gysList=new ArrayList();
		
	//-------���
		public void add(Suppliers gys) {
			 gysList.add(gys);
			
		}
		
	//------ɾ��
		public void removegys(Suppliers gys) {
			gysList.remove(gys);
		}
	//-----ͨ��ȫ�ƻ�ȡgys
		public Suppliers getgyqbyqc(String gysqc) {
			Suppliers gys = new Suppliers(gysqc);
			int index = gysList.indexOf(gys);
			if (index == -1) {
				return null;
			}
			return (Suppliers) gysList.get(index);
		}
	//-----��ȡ���е��û�
		public void showAllgys() {
			for (int i = 0; i < gysList.size(); i++) {
				System.out.println("�˻�" + (i + 1) + ":" + gysList.get(i));
			}
		}
			public ArrayList getAllUser() {
				return gysList;
		}	
	}
