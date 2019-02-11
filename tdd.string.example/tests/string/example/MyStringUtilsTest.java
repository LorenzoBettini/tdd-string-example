package string.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStringUtilsTest {

	@Test
	public void testLeftTrimWithNullString() {
		MyStringUtils myStringUtils = new MyStringUtils();
		String result = myStringUtils.leftTrim(null);
		assertNull(result);
	}

}
