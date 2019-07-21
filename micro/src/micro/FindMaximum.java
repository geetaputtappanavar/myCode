package micro;

public class FindMaximum {
	
	public static void main(String[] args) {
		int arr[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
		FindMaximum obj = new FindMaximum();
		System.out.println(obj.findMax(arr));
	}

	public int findMax(int [] arr) {
		int max = -1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>arr[i] && j-i >max) {
					max = j-i;
				}
			}
		}
		return max;
	}
}
