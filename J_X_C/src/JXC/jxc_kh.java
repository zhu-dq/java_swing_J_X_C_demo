package JXC;

import java.awt.List;
import java.util.*;

import User.User;

public class jxc_kh {
	static ArrayList userList=new ArrayList();
	
//-------���
	 public void add(User user){
   	  userList.add(user);
     }
//------ɾ��
	public void removeUser(User user) {
		userList.remove(user);
	}
//-----ͨ��ȫ�ƻ�ȡuser
	public User getUserbyupc(String uqc) {
		User user = new User(uqc);
		int index = userList.indexOf(user);
		if (index == -1) {
			return null;
		}
		return (User) userList.get(index);
	}
//-----��ȡ���е��û�
	public void showAllUser() {
		for (int i = 0; i < userList.size(); i++) {
			System.out.println("�˻�" + (i + 1) + ":" + userList.get(i));
		}
	}
		public ArrayList getAllUser() {
			return userList;
	}
}
