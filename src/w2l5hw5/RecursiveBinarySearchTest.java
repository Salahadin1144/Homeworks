package w2l5hw5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import w2l5hw3.RecursiveBinarySearch;

class RecursiveBinarySearchTest {

	@Test
	void tesSuccesstSearch() {
		RecursiveBinarySearch rbs = new RecursiveBinarySearch();
		int Ooutput = rbs.search("program", 'g');
		int Eoutput = 1;
		assertEquals(Ooutput, Eoutput);
	}

	@Test
	void tesFailuretSearch() {
		RecursiveBinarySearch rbs = new RecursiveBinarySearch();
		int Ooutput = rbs.search("program", 'g');
		int Eoutput = 4;
		assertEquals(Ooutput, Eoutput);
	}

}
