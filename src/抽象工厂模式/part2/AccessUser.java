package ���󹤳�ģʽ.part2;

public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("access����һ���û�");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��ȡidΪ" + id + "���û�");

		return null;
	}

}
