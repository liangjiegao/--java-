package ״̬ģʽʵ��;

public class AftennoonState extends State{

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour() < 17) {
			System.out.println("����");
		}else {
			w.setCurrent(new EveningState());
			w.writeProgram();
		}
	}

}
