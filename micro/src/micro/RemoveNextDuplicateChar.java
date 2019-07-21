package micro;

import java.util.HashMap;
import java.util.Map;

//alternative duplicates
public class RemoveNextDuplicateChar {
	public static void main(String[] args) {
		String input = "you got beautiful eyes";
		String output = "";
			// output = you g-t bea--iful --es
		Map<Character, Integer> map = new HashMap();
		for(int i=0;i<input.length();i++) {
			if(map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), map.get(input.charAt(i)));
			}else {
				output = output+input.charAt(i);
			}
		}
	}
}
