package micro;

import java.util.Stack;

public class ValidExp {
	public static void main(String[] args) {
	/*	input :: "{()}[]" //
			output :: Balanced
missing number without sorting
			input :: "{()}]"
			output :: Unbalanced*/
		String input = "{()}[]";
		Stack<Character> st = new Stack<>();
		boolean flag = false;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='{' || input.charAt(i)=='(' || input.charAt(i)=='[') {
				st.push(input.charAt(i));
			}else {
				if(st.isEmpty()) {
					//System.out.println("unBalanced");
					//return;
					flag = false;
					//return;
				}else {
					char next = st.pop();
					if(input.charAt(i)==')' && next=='(' ||
							input.charAt(i)=='}' && next=='{'||
								input.charAt(i)==']' && next=='[') {
						//System.out.println("balanced");	
						flag = true;
					}
				}
			}
		}
		if(flag) {
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}
	}
}
