package ������ģʽ����;

public class Main {
	
	public static void main(String[] args) {
		
		Player b = new Forwards("�͵ٶ�");
		b.attack();
		
		Player m = new Guards("��˸��׵�");
		m.attack();
		
//		Player ym = new Center("Ҧ��");
//		ym.attack();		// ʵ����һ��ʼҦ������������ɶ��
//		ym.defense();
		
		Player ym = new Translator("Ҧ��");	// ���˷����֪�� attact�ǽ�����defense�Ƿ���
		ym.attack();
		ym.defense();
	}
	
}
