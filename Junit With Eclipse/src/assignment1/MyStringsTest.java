package assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MyStringsTest {

	@Test
	void testStringConcat() {
		MyStrings myUnit = new MyStrings();
		assertEquals("Result", "YashKumar", myUnit.stringConcat("Yash", "Kumar"));
	}

}