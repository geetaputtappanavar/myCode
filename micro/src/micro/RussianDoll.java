package micro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RussianDoll {
	public static void main(String[] agrs) {
		Integer[] arr = {1, 2, 2, 3, 4, 5};
		
		List<Integer> list = new ArrayList();
		list = Arrays.asList(arr);
		helper(list, 0);
	}
	
	private static int helper(List<Integer> list, int count) {
		if(list.size()<=0) {
			return -1;
		}
		//int count = 1;
		count++;
		List<Integer> templist = new ArrayList();
		for(int i=0;i<list.size();i++) {
			if(i+1<list.size() && list.get(i)==list.get(i+1)) {
				templist.add(list.get(i+1));
			}
			/*if(i+1<arr.length && arr[i]==arr[i+1]) {
				tempArr[i] = arr[i];
			}
*/		}
		
		helper(templist, count);
		return count;
	}
}
