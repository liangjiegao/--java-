package ģ�巽��ģʽ����;

public abstract class TestPaper {
	
	public void testQuestion1() {
		System.out.println("����1");
		System.out.println("�𰸣�" + this.answer1());
	}
	
	public void testQuestion2() {
		System.out.println("����2");
		System.out.println("�𰸣�" + this.answer2());
	}
	
	public void testQuestion3() {
		System.out.println("����3");
		System.out.println("�𰸣�" + this.answer3());
	}
	
	public abstract String answer1();
	
	public abstract String answer2();

	public abstract String answer3();

}
