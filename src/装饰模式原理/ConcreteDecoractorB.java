package װ��ģʽԭ��;

public class ConcreteDecoractorB extends Decorator{

	
	@Override
	public void Operation() {
		
		super.Operation();
		this.addedBehavior();
		System.out.println("����װ����B");
		
	}
	
	private void addedBehavior() {
		
	}
	
}
