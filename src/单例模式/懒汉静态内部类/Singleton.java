package ����ģʽ.������̬�ڲ���;

public class Singleton {
	
	private static class SingletonHolder{
		
		public static Singleton instance = new Singleton();
		
	} 
	
	public Singleton getInstance() {
		return SingletonHolder.instance;
	}
}
