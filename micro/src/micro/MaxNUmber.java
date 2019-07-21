package micro;

public class MaxNUmber {

	public static void main(String[] args) {
		//IX
		String romanStr = "MCMIV";//"IX"; // 1000  100  1000  1  5
		
		int dec = 0;
		for(int i=0;i<romanStr.length();i++) {
			int decVal = getVal(romanStr.charAt(i));//1000
			int decValNext = getVal(romanStr.charAt(i+1));// 100
			if(decVal>decValNext) {
				dec = dec + decVal;
			}else {
				dec = dec + decValNext - decVal;
				i++;
			}
		}
		System.out.println(dec);
	}
	
	private static int getVal(Character ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'M':
			return 1000;
		default:
			break;
		}
		return 0;
	}
}

