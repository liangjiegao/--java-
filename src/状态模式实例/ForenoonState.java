package ״̬ģʽʵ��;

public class ForenoonState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour() < 12) {
			System.out.println("����");
		}else {
			w.setCurrent(new NoonState());
			w.writeProgram();
		}
	}
	
	
	
}
