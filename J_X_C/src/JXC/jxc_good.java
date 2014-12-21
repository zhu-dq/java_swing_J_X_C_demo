package JXC;
import java.awt.List;
import java.util.*;

import means.dushuju_good;
import User.Goods;
public class jxc_good {
	static ArrayList userList = new ArrayList();
	// -------添加
	public void add(Goods good) {
		userList.add(good);
	}
	// ------删除
	public void removeUser(Goods good) {
		userList.remove(good);
	}

	// -----通过全称获取
	public Goods getgoodbyspmc(String spmc) {
		Goods good = new Goods(spmc);
		int index = userList.indexOf(good);
		if (index == -1) {
			return null;
		}
		return (Goods) userList.get(index);
	}

	// -----获取所有的用户
	public void showAllgood() {
		for (int i = 0; i < userList.size(); i++) {
			System.out.println("账户" + (i + 1) + ":" + userList.get(i));
		}
	}

	public ArrayList getAllgood() {
		return userList;
	}
}
