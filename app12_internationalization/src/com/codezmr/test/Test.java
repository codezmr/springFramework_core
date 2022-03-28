package com.codezmr.test;

import java.text.NumberFormat;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		
		Locale locale = new Locale("en", "US");
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		System.out.println(numberFormat.format(1234567890.23456788));
	}

}
