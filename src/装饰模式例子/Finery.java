package װ��ģʽ����;

public class Finery extends Person{
	
	protected Person component;
	
	public void Decorate(Person component) {
		
		this.component = component;
		
	}

	public void show() {
		
		if(component != null) {
			
			component.show();
			
		}
		
	}
	
}
