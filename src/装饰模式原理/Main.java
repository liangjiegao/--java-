package װ��ģʽԭ��;

public class Main {
	
	public static void main(String[] args) {
		
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoractorA cda = new ConcreteDecoractorA();
		ConcreteDecoractorB cdb = new ConcreteDecoractorB();
		
		cda.setComponent(c);
		cdb.setComponent(cda);
		cdb.Operation();
		
	}
	
}
