package ְ����ģʽ����;

public class Main {
	
	public static void main(String[] args) {
		
		Manager cm = new CommonManager("�ƾ���");
		Manager md = new Majordomo("���ܼ�");
		Manager gm = new GeneralManager("���ܾ���");
		cm.setSuperior(md);
		md.setSuperior(gm);
		
		Request request = new Request();
		request.setType("�ϲ���");
		cm.requestApplication(request);
		
		request.setType("���");
		cm.requestApplication(request);
		
		request.setType("��н");
		request.setCount(500);
		cm.requestApplication(request);
		
		request.setCount(2000);
		cm.requestApplication(request);
	}
	
}
