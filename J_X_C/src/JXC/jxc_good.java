package JXC;
import java.awt.List;
import java.util.*;

import means.dushuju_good;
import User.Goods;
public class jxc_good {
	static ArrayList userList = new ArrayList();
	// -------���
	public void add(Goods good) {
		userList.add(good);
	}
	// ------ɾ��
	public void removeUser(Goods good) {
		userList.remove(good);
	}

	// -----ͨ��ȫ�ƻ�ȡ
	public Goods getgoodbyspmc(String spmc) {
		Goods good = new Goods(spmc);
		int index = userList.indexOf(good);
		if (index == -1) {
			return null;
		}
		return (Goods) userList.get(index);
	}

	// -----��ȡ���е��û�
	public void showAllgood() {
		for (int i = 0; i < userList.size(); i++) {
			System.out.println("�˻�" + (i + 1) + ":" + userList.get(i));
		}
	}

	public ArrayList getAllgood() {
		return userList;
	}
}
