package w2l5hw5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import w2l5hw4.CheckPalindrome;

class CheckPalindromeUnitTest {

	@Test
	void testSuccessCheckPalindrome() {
		CheckPalindrome cp = new CheckPalindrome();
		boolean Ooutput = cp.checkPalindrome("noon");
		boolean Eoutput = true;
		assertEquals(Ooutput, Eoutput);
	}

	@Test
	void testFailureCheckPalindrome() {
		CheckPalindrome cp = new CheckPalindrome();
		boolean Ooutput = cp.checkPalindrome("moon");
		boolean Eoutput = true;
		assertEquals(Ooutput, Eoutput);
	}

}
