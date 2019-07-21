package micro;

import java.util.Arrays;

public class LISLength {
	public static void main(String[] args) {
		//int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
		int[] arr = {0, 4, 12, 2, 10, 6, 9, 13, 3, 11, 7, 15};
		int[] lenArr = new int[arr.length];
		int[] lonSubSeqArrIndex = new int[arr.length];
		for(int i=0;i<lenArr.length;i++) {
			lenArr[i]=1;
		}
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					lenArr[i] = Math.max(lenArr[j]+1, lenArr[i]);
					if(lenArr[i]>lenArr[j]+1) {
						break;
					}
					lonSubSeqArrIndex[i] = j;
				}
			}
		}
		
		//print max of lenArr
		int j=0;
		int[] tempArr = new int[arr.length];
		System.out.println(Arrays.stream(lenArr).max().getAsInt());
		for(int i=lonSubSeqArrIndex.length-1;i>=0;i--) {
			if(lonSubSeqArrIndex[i] == i) {
				tempArr[j] = i;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(tempArr[i] == i) {
			System.out.println(arr[i]);	
			}
		}
	}
}
