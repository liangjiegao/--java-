package �н�ģʽԭ��;

public class ConcreteColleague1 extends Colleague{

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void notifyC(String message) {
		System.out.println("c1���յ���Ϣ " + message);
	}
	
}
