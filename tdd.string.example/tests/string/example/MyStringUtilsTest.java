package string.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyStringUtilsTest {

	private MyStringUtils myStringUtils;

	@Before
	public void setup() {
		myStringUtils = new MyStringUtils();
	}

	@Test
	public void testLeftTrimWithNullString() {
		assertNull(myStringUtils.leftTrim(null));
	}

	@Test
	public void testLeftTrimWithEmptyString() {
		assertEquals("", myStringUtils.leftTrim(""));
	}
}
