package ���󹤳�ģʽ.part2;

public class SqlserverDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("sqlserver����һ������");
	}


	@Override
	public User getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("��ȡidΪ" + id + "�Ĳ���");

		return null;
	}

}
