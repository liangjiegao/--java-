package ְ����ģʽ����;

public class Majordomo extends Manager{

	public Majordomo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestApplication(Request request) {
		// TODO Auto-generated method stub
		if(request.getType().equals("���")) {
			System.out.println(this.name + ": " + request.getType() + " ����");
		}else {
			if(superior != null) {
				superior.requestApplication(request);

			}
		}
	}

}
