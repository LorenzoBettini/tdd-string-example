package string.example;

public class MyStringUtils {

	public String leftTrim(String input) {
		if (input == null || input.isEmpty())
			return input;
		if (input.charAt(0) == ' ')
			return input.substring(1);
		return input;
	}

}
