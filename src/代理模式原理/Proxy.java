package ����ģʽԭ��;

public class Proxy implements Subject{

	RealSubject realSubject;
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		if(realSubject == null) {
			
			realSubject = new RealSubject();
			
		}
		System.out.println("���������ʵ");
		realSubject.request();
	}

}
