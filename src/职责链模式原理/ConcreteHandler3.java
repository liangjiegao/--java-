package ְ����ģʽԭ��;

public class ConcreteHandler3 extends Handler{

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request < 30) {
			System.out.println(this.getClass().getName() + "��������" + request);
		}else {
			System.out.println("�޷����");
		}
	}

}
