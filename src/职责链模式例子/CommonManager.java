package ְ����ģʽ����;

public class CommonManager extends Manager{

	public CommonManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestApplication(Request request) {
		// TODO Auto-generated method stub
		if(request.getType().equals("�ϲ���")) {
			System.out.println(this.name + ": " + request.getType() + " ����");
		}else {
			if(superior != null) {
				superior.requestApplication(request);

			}
		}
	}

}
