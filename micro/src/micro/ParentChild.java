package micro;

public class ParentChild extends Parent{
	public static void main(String[] args) {
		new ParentChild().method();
	}
	
	final StringBuffer var = new StringBuffer("abc");
	
	@Override
	public  void method() {
		var = var.append("d");
		System.out.println(var);
	}
}
