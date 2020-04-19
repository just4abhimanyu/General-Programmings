package com.java11.feature.string;

public class IsBlank {

	public static void main(String[] args) throws Exception {
        // This instance method returns a boolean value.
		//Empty Strings and Strings with only white spaces are treated as blank.
        
        System.out.println(" ".isBlank()); //true
        
        String s = " abhi";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true
    }
}
