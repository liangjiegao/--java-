package ģ�巽��ģʽ����;

public class Main {
	
	public static void main(String[] args) {
		
		TestPaper paper;
		System.out.println("Aѧ�����Ծ��");
		paper = new TestPaperA();
		paper.testQuestion1();
		paper.testQuestion2();
		paper.testQuestion3();

		System.out.println("Bѧ�����Ծ��");
		paper = new TestPaperB();
		paper.testQuestion1();
		paper.testQuestion2();
		paper.testQuestion3();
	}
	
}
