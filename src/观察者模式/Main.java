package �۲���ģʽ;

public class Main {
	
	public static void main(String[] args) {
		
		Secretary secretary = new Secretary();
		
		StockObserver yellow = new StockObserver("����", secretary);
		StockObserver mingXiao = new StockObserver("С��", secretary);
		secretary.attach(yellow);
		secretary.attach(mingXiao);
		
		secretary.subjectStatue = "�ϰ������";
		secretary.notifyOb();
		
	}
	
}
