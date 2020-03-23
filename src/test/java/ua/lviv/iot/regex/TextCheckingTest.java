package ua.lviv.iot.regex;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.regex.manager.TextChecking;

public class TextCheckingTest {

	@Test
	public void test() {

		String text = "Phew!" + "Said Mr. Fox." + "They'll never get as deep as that." + " Well	done, everyone!";
		InputStream stringInput = new ByteArrayInputStream(text.getBytes());
		System.setIn(stringInput);

		Scanner stringScanner = new Scanner(stringInput);
		String string = stringScanner.nextLine();
		TextChecking.countConsonantsInExclamantorySentences(string);
		System.out.println("Number of consonants in exclamantory sentences: "
				+ TextChecking.countConsonantsInExclamantorySentences(string));
		stringScanner.close();
	}

}