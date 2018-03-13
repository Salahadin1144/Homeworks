package w2l5hw2;

public class MinimumCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "zmnal";
		System.out.println(new MinimumCharacter().findMinimum(input));
	}

	public String findMinimum(String input) {
		// TODO Auto-generated method stub
		char minc = input.charAt(0);
		return findMin(input.substring(1), minc);
	}

	private String findMin(String str, char minc) {
		// TODO Auto-generated method stub
		if (str.length() == 0) {
			return "" + minc;
		} else {
			if (str.charAt(0) < minc) {
				minc = str.charAt(0);
			}
			return findMin(str.substring(1), minc);
		}
	}

}
