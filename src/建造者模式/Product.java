package ������ģʽ;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	List<String> list = new ArrayList<String>();
	
	public void add(String part) {
		list.add(part);
	}
	
	public void show() {
		System.out.println("��Ʒ������");
		for (String string : list) {
			System.out.println(string);
		}
		
	}
	
}
