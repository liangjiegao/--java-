package ״̬ģʽԭ��;

public class ConcreteStateC extends State{

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("��״̬C��Ϊ״̬A");
		context.setState(new ConcreteStateA());
	}

}
