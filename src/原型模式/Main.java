package ԭ��ģʽ;

public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Resume resumeOrg = new Resume("���ܸ�");
		resumeOrg.setPersonalInfo("��", "22");
		resumeOrg.setWorkExperience("2019-7-19 �� 2020-6-25", "���������Ϣ�Ƽ����޹�˾");
		
		Resume resumeCopy = (Resume) resumeOrg.clone();
		resumeCopy.setPersonalInfo("Ů", "23");
		resumeCopy.setWorkExperience("2020-11-10 �� ����", "��Ѷ");
		
		resumeOrg.display();
		resumeCopy.display();
	}
	
}
