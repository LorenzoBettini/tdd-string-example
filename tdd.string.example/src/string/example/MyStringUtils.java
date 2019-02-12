package string.example;

public class MyStringUtils {

	public String leftTrim(String input) {
		if (input == null || input.isEmpty())
			return input;
		int beginIndex = 0;
		while (beginIndex < input.length() &&
				Character.isWhitespace(input.charAt(beginIndex)))
			beginIndex++;
		return input.substring(beginIndex);
	}

}
