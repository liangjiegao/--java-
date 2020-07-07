package ���ģʽ;

public class Facade {
	
	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;
	SubSystemFour four;

	
	public Facade() {
		
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
		
	}
	
	public void MethodA() {
		
		System.out.println("������A");
		one.methodOne();
		two.methodTwo();
		four.methodFour();
		
	}
	
	public void MethodB() {
		
		System.out.println("������B");
		one.methodOne();
		three.methodThree();
		
	}
	
}
