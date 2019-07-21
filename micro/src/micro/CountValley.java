package micro;

public class CountValley {
	public static void main(String[] args) {
		int level = 0;
		String path = "UDDDUUDDUU";
		int countValley = 0;
		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == 'U') {
				level++;
			} else {
				level--;
			}
			if (level == 0 && path.charAt(i) == 'U') {
				countValley++;
			}
		}
	}

	static int countingValleys(int n, String s) {
		 int countValley = 0;
		 int level = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'U') {
				level++;
			} else {
				level--;
			}
			if (level == 0 && s.charAt(i) == 'U') {
				countValley++;
			}
		}
		return countValley;
	}
}
