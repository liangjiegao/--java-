package ����ģʽ����;

public class Pursuit implements IGiveGift{
	
	SchoolGirl sg;
	
	public Pursuit(SchoolGirl sg) {
		
		this.sg = sg;
		
	}

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println(sg.getName() + " ���������ޣ�");
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(sg.getName() + " ���㻨��");
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(sg.getName() + " �����ɿ�����");
	}
	
}
