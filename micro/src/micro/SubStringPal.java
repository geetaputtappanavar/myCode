package micro;

public class SubStringPal {
	public static void main(String[] args) {
		String st = "babad"; // bab, aba
		String maxStr = "";
		for(int i=0;i<st.length();i++) {
			for(int j=1;j<st.length();j++) {
				if(j>i) {
					String str = st.substring(i, j);
					StringBuilder sb = new StringBuilder(str).reverse();
					if(str.equals(sb.toString()) && maxStr.length()<str.length()) {
						maxStr = str;
					}
				}
			}
		}
		System.out.println(maxStr);
	}
}
