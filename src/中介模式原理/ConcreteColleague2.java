package �н�ģʽԭ��;

public class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void notifyC(String message) {
		System.out.println("c2���յ���Ϣ " + message);
	}
}
