package ������ģʽ;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		
//		Aggregate aggregate = new ConcreteAggregate();
//		aggregate.add("superl");
//		aggregate.add("liangjiegao");
//		aggregate.add("jj");
//		aggregate.add("gg");
//
//		
//		Iterator iterator = aggregate.createIterator();
//		
//		while (!iterator.isDone()) {
//			System.out.println("��ǰֵ��" + iterator.curentItem());
//			System.out.println("��һ��ֵ��" + iterator.next());
//			
//		}
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator<String> iterator =  list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
