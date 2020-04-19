package com.java11.feature.string;

public class Strip {

	public static void main(String[] args) {
		//strip() is “Unicode-aware” evolution of trim().
		String str = " JD "; 
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");
        // StartJDEnd
        
        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End"); 
      //StartJD End
        
        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");
        //Start JDEnd

	}
}
