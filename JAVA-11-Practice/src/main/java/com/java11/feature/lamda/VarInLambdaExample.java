package com.java11.feature.lamda;

import java.util.stream.IntStream;

public class VarInLambdaExample {

	/*
	 * Benefits of using var One benefit of using 'var' in lambdas is that , type
	 * annotations can be applied to local variables without losing brevity:
	 * 
	 * (@Nonnull var x, @Nullable var y) -> x.process(y) 
	 * 
	 * Also we can use 'final'  with var: 
	 *  (final var x) -> Math.pow(x, 4)
	 */
	public static void main(String[] args) {
		
		//IntStream.of(1, 2, 3, 5, 6, 7).filter((var i) -> i % 3 == 0).forEach(System.out::println);

									// Limitations

		//   (var s1, s2) -> s1 + s2 // we cannot use var for some parameters and skip for others:

		// (var s1, String s2) -> s1 + s2  // we cannot mix var with explicit types:

		// s1 -> s1.toUpperCase() // even though we can skip the parentheses in single parameter lambda:

		// var s1 -> s1.toUpperCase() // we cannot skip them while using var:

	}
}
