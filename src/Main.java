import java.util.List;

public class Main {
	
	public int a(List<List<Integer>> arr) {
		
		int line1 = 0;	// �Խ���1�����Ͻǵ����½�
		int line2 = 0; 	// �Խ���2�����Ͻǵ����½�
		
		for (int i = 0; i < arr.size(); i++) {
			
			line1 += arr.get(i).get(i);
			
		}
		int index = 0;
		for (int i = arr.size(); i >= 0; i--) {
			
			line2 += arr.get(index++).get(i);
			
		}
		
		return Math.abs(line1 - line2);
	}
	
}
