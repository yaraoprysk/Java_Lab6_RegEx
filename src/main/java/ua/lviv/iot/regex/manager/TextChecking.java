package ua.lviv.iot.regex.manager;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextChecking {

	public static int countConsonantsInExclamantorySentences(final String text) {
		return findInSentenceConsonant(findExclamantorySentences(text));
	}

	private static String findExclamantorySentences(final String text) {

		Set<String> foundStrings = new LinkedHashSet<>();

		String patternString = "[^.!?]+\\!";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			foundStrings.add(matcher.group());
		}
		return foundStrings.toString();
	}

	private static int findInSentenceConsonant(final String text) {
		int foundConsonantsQuantity = 0;
		String patternString = "(?![aAeEiIoOuU])[a-zA-Z]";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			foundConsonantsQuantity++;
		}
		return foundConsonantsQuantity;

	}

}