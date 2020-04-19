package com.java11.feature.string;

import java.util.stream.Collectors;

public class Lines {

	public static void main(String[] args) {
		String str = "ect\nvelankani\nsoftware";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));
	}
}
