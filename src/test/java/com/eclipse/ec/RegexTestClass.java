package com.eclipse.ec;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class RegexTestClass {

	@Test
	public void regexTest1() {
		Pattern pattern = Pattern.compile("Sii", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Kurs Sii z Javy)");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		} // bez assercji zawse test będzie zielony
	}
	
}
