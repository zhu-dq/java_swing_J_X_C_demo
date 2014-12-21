package JXC;

import java.awt.List;
import java.util.*;

import User.User;

public class jxc_kh {
	static ArrayList userList=new ArrayList();
	
//-------添加
	 public void add(User user){
   	  userList.add(user);
     }
//------删除
	public void removeUser(User user) {
		userList.remove(user);
	}
//-----通过全称获取user
	public User getUserbyupc(String uqc) {
		User user = new User(uqc);
		int index = userList.indexOf(user);
		if (index == -1) {
			return null;
		}
		return (User) userList.get(index);
	}
//-----获取所有的用户
	public void showAllUser() {
		for (int i = 0; i < userList.size(); i++) {
			System.out.println("账户" + (i + 1) + ":" + userList.get(i));
		}
	}
		public ArrayList getAllUser() {
			return userList;
	}
}
