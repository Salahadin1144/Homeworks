package w2l5hw5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import w2l5hw1.MergeSortedStrings;

class MergeSortedStringsTest {

	@Test
	void testSuccessMerge() {
		MergeSortedStrings mss = new MergeSortedStrings();
		String Ooutput = mss.merge("apz", "dsy");
		String Eoutput = "adpsyz";
		assertEquals(Ooutput, Eoutput);
	}

	@Test
	void testFailureMerge() {
		MergeSortedStrings mss = new MergeSortedStrings();
		String Ooutput = mss.merge("apz", "dsy");
		String Eoutput = "adpszy";
		assertEquals(Ooutput, Eoutput);
	}

}
