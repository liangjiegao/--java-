package ģ�巽��ģʽԭ��;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractClass classA = new ConcreteClassA();
		classA.templateMethod();
		
		AbstractClass classB = new ConcreteClassB();
		classB.templateMethod();
	}
	
}
