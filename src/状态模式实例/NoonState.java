package ״̬ģʽʵ��;

public class NoonState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour() < 13) {
			System.out.println("����");
		}else {
			w.setCurrent(new AftennoonState());
			w.writeProgram();
		}
	}

}
