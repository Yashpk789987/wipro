package palindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyStringsTest {

	MyStrings string = new MyStrings();

	@Test
	public void testPalindromeCheck() {
		assertTrue("Result: ", string.palindromeCheck("madam"));
		assertTrue("Result: ", string.palindromeCheck("mom"));
		assertTrue("Result: ", string.palindromeCheck("dad"));
		assertTrue("Result: ", string.palindromeCheck("malayalam"));
		assertFalse("Result: ", string.palindromeCheck("kerala"));
		assertFalse("Result: ", string.palindromeCheck("india"));
	}

}
