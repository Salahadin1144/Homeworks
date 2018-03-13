package w2l5hw3;

import java.util.Arrays;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcdefghijklmnopqrstuvwxyz";
		int index = new RecursiveBinarySearch().search(input, 's');
		System.out.println(index);
	}

	public int search(String s, char c) {

		if (s.length() == 0) {
			return -1;
		} else if (s.length() == 1 && s.charAt(0) == c) {
			return 0;
		} else {
			char[] input = s.toCharArray();
			Arrays.sort(input);
			return search(input, 0, input.length, c);
		}
	}

	private int search(char[] object, int low, int high, char c) {
		int mid = (low + high) / 2;
		if (object[mid] == c) {
			return mid;
		} else if (object[mid] < c) {
			return search(object, mid + 1, high, c);
		} else {
			return search(object, low, mid, c);
		}
	}

}
