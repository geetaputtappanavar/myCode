package micro;

import java.util.Arrays;

public class AddBArrToArrNotNull {
	int index = 0;
	//int index = 0;
	public static void main(String[] args) {
		AddBArrToArrNotNull obj = new AddBArrToArrNotNull();
		Integer[] a = {1, null, 7, 2};
		Integer[] b = {3, 4};
		System.out.println(Arrays.toString(obj.addBToA(a, b)));x
	}
	
	// A = 1, -, 7, 2
	// B = 3, 4
	//res= 1, 3, 4, 2
	public Integer[] addBToA(Integer[] a, Integer[] b) {
		
		int count = 0;
		int j = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==null && (i+1)-i==1) {
				index++;//2
				count++; // 2
			}
		}
		int startIndex = index-count+1;
		for(int i=0;i<b.length;i++) {
			if(b.length<=count) {
				a[startIndex] = b[j];
				j++;
				startIndex++;
			}
		}
		return a;
	}
}
