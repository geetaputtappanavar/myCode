package micro;

public class JumpGame {
	public static void main(String[] args) {
		//int[] intArr =  new int[8];
		int[] c = {0, 0, 1, 0, 0, 1, 1, 0};
		System.out.println(jumpingOnClouds(c));
	}
	
	static int jumpingOnClouds(int[] c) {
		
		int countJump = 0;
		for(int i=0;i<c.length;i++) {
			if(i+1<c.length && c[i+1]==0) {
				countJump++;
			}
		}
		return countJump;
    }
}
