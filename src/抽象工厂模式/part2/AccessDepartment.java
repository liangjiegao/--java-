package ���󹤳�ģʽ.part2;

public class AccessDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("access����һ������");
	}


	@Override
	public User getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("��ȡidΪ" + id + "�Ĳ���");

		return null;
	}

}
