package װ��ģʽ����;

public class Main {
	
	public static void main(String[] args) {
		
		Person p = new Person("С��");
		
		BigTrouser b = new BigTrouser();
		TShirts t = new TShirts();
		
		b.Decorate(p);
		t.Decorate(b);
		
		t.show();
		
	}
	
}
