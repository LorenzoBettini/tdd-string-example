package string.example;

public class MyStringUtils {

	public String leftTrim(String input) {
		if (input == null || input.isEmpty())
			return input;
		return input.substring(1);
	}

}
