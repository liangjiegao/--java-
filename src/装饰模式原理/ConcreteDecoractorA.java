package װ��ģʽԭ��;

public class ConcreteDecoractorA extends Decorator{

	private String addedState;
	
	@Override
	public void Operation() {
		
		super.Operation();
		addedState = "New State";
		System.out.println("����װ����A");
		
	}
	
}
