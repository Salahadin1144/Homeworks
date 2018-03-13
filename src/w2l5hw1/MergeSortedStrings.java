package w2l5hw1;

public class MergeSortedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ace";
		String str2 = "bdf";

		String output = new MergeSortedStrings().merge(str1, str2);
		System.out.println(output);
	}

	public String merge(String str1, String str2) {
		if (str1.length() == 1 && str2.length() == 0) {
			return str1;
		} else if (str1.length() == 0 && str2.length() == 1) {
			return str2;
		} else {
			char c0 = str1.charAt(0);
			char d0 = str2.charAt(0);
			if (c0 < d0) {
				return c0 + merge(str1.substring(1), str2);
			} else {
				return d0 + merge(str1, str2.substring(1));
			}
		}
	}

}
