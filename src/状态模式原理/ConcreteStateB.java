package ״̬ģʽԭ��;

public class ConcreteStateB extends State{

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("��״̬B��Ϊ״̬C");
		context.setState(new ConcreteStateC());
	}

}
