package ����ģʽ����;

public class Main {
	
	public static void main(String[] args) {
		SchoolGirl sg = new SchoolGirl();
		sg.setName("�������");
		
		Proxy proxy = new Proxy(sg);
		
		proxy.giveDolls();
		proxy.giveFlowers();
		proxy.giveChocolate();
	}
	
}
