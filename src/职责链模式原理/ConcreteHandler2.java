package ְ����ģʽԭ��;

public class ConcreteHandler2 extends Handler{

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request < 20) {
			System.out.println(this.getClass().getName() + "��������" + request);
		}else {
			successor.handleRequest(request);
		}
	}

}
