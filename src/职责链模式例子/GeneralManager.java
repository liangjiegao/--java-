package ְ����ģʽ����;

public class GeneralManager extends Manager{

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestApplication(Request request) {
		// TODO Auto-generated method stub
		if(request.getType().equals("��н") && request.getCount() < 1000) {
			System.out.println(this.name + ": " + request.getType() + request.getCount() + " ��ȥ��");
		}else {
			System.out.println(this.name + ": " + request.getType() + request.getCount() + " �Ӹ�����");
		}
	}

}
