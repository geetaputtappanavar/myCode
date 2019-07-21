package micro;

public class CatchMouseByCat {
	public static void main(String[] args) {
		//
		//1 2 3 -- 3-1 = 2, 3-2=1 mouse
		//1 3 2 catA, catB, MOuse 3-1= 2, 3-2=1 cata
		System.out.println(catAndMouse(1, 3, 2)); 
	}
	
	static String catAndMouse(int x, int y, int z) {
		int a = Math.abs(z-x);
		int b = Math.abs(z-y);
		if(a<b) {
			return "Cat A";
		}else if(b<a) {
			return "Cat B";
		}else {
			return "Mouse C";
		}
    }
}
