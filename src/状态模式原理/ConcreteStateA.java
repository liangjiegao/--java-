package ״̬ģʽԭ��;

public class ConcreteStateA extends State{

	@Override
	public void handle(Context context) {
		System.out.println("��״̬A��Ϊ״̬B");
		context.setState(new ConcreteStateB());
		
	}
	
	
	
}
