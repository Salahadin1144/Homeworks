package w2l5hw5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import w2l5hw2.MinimumCharacter;

class MinimumCharacterTest {

	@Test
	void testSuccessFindMinimum() {
		MinimumCharacter mc = new MinimumCharacter();
		String Ooutput = mc.findMinimum("fibonac");
		String Eoutput = "a";
		assertEquals(Ooutput, Eoutput);
	}

	@Test
	void testFailureFindMinimum() {
		MinimumCharacter mc = new MinimumCharacter();
		String Ooutput = mc.findMinimum("fibonac");
		String Eoutput = "f";
		assertEquals(Ooutput, Eoutput);
	}

}
