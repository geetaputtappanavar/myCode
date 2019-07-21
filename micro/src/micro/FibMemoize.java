package micro;

import java.util.HashMap;
import java.util.Map;

public class FibMemoize {
	private static Map<Integer, Integer> resMap = new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		System.out.println(fibMem(5));
	}

	public static int fibMem(int n) {
		if(resMap.containsKey(n)) {
			return resMap.get(n);
		}
		if(n==0) {
			return 0;
		}else if(n==1){
			return 1;
		}else {
			int nextN = fibMem(n-1)+fibMem(n-2);
			resMap.put(n, nextN);
			return nextN;
		}
	}
}
