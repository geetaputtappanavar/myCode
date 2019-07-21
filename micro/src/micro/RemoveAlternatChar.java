package micro;

import java.util.HashMap;
import java.util.Map;

public class RemoveAlternatChar {

/*	public static void main(String[] args) {
		String output="";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		//String str = "tttt"; //put-ta-pn-va-r- tttt => t-tt
		String str = "putttappanavart";//put-ta-p-n-v-r-
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				if(map.get(str.charAt(i))==1) {
					map.remove(str.charAt(i));
				}
			}else {
				output = output+str.charAt(i);
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(output);
	}*/
	
	public static void main(String[] args) {
		String s = "ACABBACDDC";//ACA--AC--C ->AC
		System.out.println(removeConsecutiveDupStr(s));
	}
	
	//String s = "ACABBACDDC";//ACA--AC--C ->AC
	private static String removeConsecutiveDupStr(String s) {
		while(true) {
			String newStr = "";
			for (int i = 0; i < s.length(); i++) {
				if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
					i = i + 1;
				} else {
					newStr = newStr + s.charAt(i);
				}
			}
			if(s.equals(newStr)) {
				return newStr;
			}else {
				s=newStr;
			}
		}
	}
}
