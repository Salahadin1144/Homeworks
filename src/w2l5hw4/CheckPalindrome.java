package w2l5hw4;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CheckPalindrome().checkPalindrome("mororom"));
	}

	public boolean checkPalindrome(String s) {
		// TODO Auto-generated method stub
		if (s.length() == 0 || s.length() == 1)
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return checkPalindrome(s.substring(1, s.length() - 1));
		return false;
	}

}
