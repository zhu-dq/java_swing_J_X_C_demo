	package JXC;
	
	import java.awt.List;
	import java.util.*;

import means.dushuju_gys;
	
	import User.Suppliers;
import User.User;
	
	public class jxc_gys {
		static ArrayList gysList=new ArrayList();
		
	//-------添加
		public void add(Suppliers gys) {
			 gysList.add(gys);
			
		}
		
	//------删除
		public void removegys(Suppliers gys) {
			gysList.remove(gys);
		}
	//-----通过全称获取gys
		public Suppliers getgyqbyqc(String gysqc) {
			Suppliers gys = new Suppliers(gysqc);
			int index = gysList.indexOf(gys);
			if (index == -1) {
				return null;
			}
			return (Suppliers) gysList.get(index);
		}
	//-----获取所有的用户
		public void showAllgys() {
			for (int i = 0; i < gysList.size(); i++) {
				System.out.println("账户" + (i + 1) + ":" + gysList.get(i));
			}
		}
			public ArrayList getAllUser() {
				return gysList;
		}	
	}
