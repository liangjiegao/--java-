package ���ģʽ����;

public class Main {
	
	public static void main(String[] args) {
		
		ConcreteCompany root = new ConcreteCompany("�����ܹ�˾");
		root.add(new HRDepartment("�ܲ�������Դ��"));
		root.add(new FinanceDepartment("�ܲ�������"));
		
		ConcreteCompany comp = new ConcreteCompany("�Ϻ������ֹ�˾");
		comp.add(new HRDepartment("����������Դ��"));
		comp.add(new FinanceDepartment("����������"));
		
		root.add(comp);
		
		ConcreteCompany comp2 = new ConcreteCompany("�Ͼ����´�");
		comp2.add(new HRDepartment("�Ͼ�������Դ��"));
		comp2.add(new FinanceDepartment("�Ͼ�������"));
		
		comp.add(comp2);
		
		ConcreteCompany comp3 = new ConcreteCompany("���ݰ��´�");
		comp3.add(new HRDepartment("����������Դ��"));
		comp3.add(new FinanceDepartment("���ݲ�����"));
		
		comp.add(comp3);
		System.out.println("�ṹͼ��");
		root.display(1);
		System.out.println("ְ��");
		root.lineOfDuty();

	}
	
}
