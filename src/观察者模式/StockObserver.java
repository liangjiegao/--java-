package �۲���ģʽ;

public class StockObserver extends Observer{

	public StockObserver(String name, Subject subject) {
		super(name, subject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s �رչ�Ʊ�˼���������\n", subject.subjectStatue, name);
	}

}
