package micro;

import java.util.LinkedList;
import java.util.List;

public class Test {

	/*public static void main(String[] args) {
		//int[] intArr = {1, 2, 3, 5}; //4
		int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
		for(int i=intArr.length-1;i>0;i--) {
			if(intArr[i]-intArr[i-1] != 1) {
				System.out.println(intArr[intArr.length-1]-1);
			}
		}
	}
*/

	//10 20 4 30, delete 20
	public static void main(String[] args) {
		List ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(4);
		ll.add(30);
		ll.remove(1);
		System.out.println(ll);
		
		
	}
}
