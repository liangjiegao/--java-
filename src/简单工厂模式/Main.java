package �򵥹���ģʽ;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("����������, ��ͨ normal, 300��100 return, �ۿ� rebate");
		CashSuper cs = CashFactory.createCashAccept(sn.next());
		
		if(cs == null) {
			System.out.println("���ڹ���ֹ����!");
			return;
		}
		System.out.println("�������");
		double money = sn.nextDouble();
		double re = cs.acceptCash(money);
		
		System.out.println("�Żݺ�� " + re);
	}
	
}
