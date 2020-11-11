package string.example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyStringUtilsParameterizedTest {

	@Parameters(name = "{index}: leftTrim({0})={1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(
			new Object[][] {
				{null, null},
				{"", ""},
				{" abc", "abc"},
				{"abc", "abc"},
				{"\tabc", "abc"},
				{"  abc", "abc"},
				{"  ", ""},
				{"\t abc", "abc"}
			});
	}

	private MyStringUtils myStringUtils;
	private String input;
	private String expected;

	public MyStringUtilsParameterizedTest(String input, String expected) {
		this.input = input;
		this.expected = expected;
		myStringUtils = new MyStringUtils();
	}

	@Test
	public void testLeftTrim() {
		assertEquals(expected, myStringUtils.leftTrim(input));
	}
}
