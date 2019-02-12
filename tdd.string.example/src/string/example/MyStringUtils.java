package string.example;

public class MyStringUtils {

	public String leftTrim(String input) {
		if (input == null || input.isEmpty())
			return input;
		int beginIndex = 0;
		if (input.charAt(beginIndex) == ' ')
			return input.substring(beginIndex + 1);
		return input;
	}

}
