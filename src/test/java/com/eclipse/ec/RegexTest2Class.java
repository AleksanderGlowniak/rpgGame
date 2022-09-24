package com.eclipse.ec;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class RegexTest2Class {
	@Test
	public void regexTest2() {
		String patternToFind = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern pattern = Pattern.compile(patternToFind, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("google@mail.com.pl");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Email found");
		} else {
			System.out.println("Email not found");
		} // bez assercji zawse test będzie zielony
	}
}
