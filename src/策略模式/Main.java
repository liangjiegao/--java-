package ����ģʽ;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("����������, ��ͨ normal, 300��100 return, �ۿ� rebate");
		CashContext cc = new CashContext(sn.next());
		
		System.out.println("�������");
		double money = sn.nextDouble();
		double re = cc.getResult(money);
		if(re < 0.0) {
			System.out.println("���ڹ���ֹ����!");
			return;
		}
		System.out.println("�Żݺ�� " + re);
	}
	
}
