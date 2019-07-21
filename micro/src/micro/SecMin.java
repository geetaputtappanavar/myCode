package micro;

public class SecMin {
	
	int i = 8;
	public static void main(String[] args) {
		
		Class c = new SecMin().getClass();
		int i = 9;
		SecMin obj = new SecMin();
		int[] intArr = {4, 1, 5, 4, 2, 6};
		int secMin = obj.findSecMin(intArr);
		System.out.println(secMin);
	}
	
	public int findSecMin(int[] intArr) {
		int firstMin = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		for(int i=0;i<intArr.length;i++) {
			if(/*secMin<firstMin &&*/ firstMin>intArr[i]) {
				secMin = firstMin;
				firstMin = intArr[i];
				
			}else if(secMin > intArr[i] && intArr[i] != firstMin) {
				secMin = intArr[i];
			}
		}
		return secMin;
	}
}
