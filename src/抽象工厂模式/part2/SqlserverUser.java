package ���󹤳�ģʽ.part2;

public class SqlserverUser implements IUser{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("sqlserver����һ���û�");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��ȡidΪ" + id + "���û�");
		return null;
	}

}
