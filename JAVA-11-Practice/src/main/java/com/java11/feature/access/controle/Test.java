package com.java11.feature.access.controle;

public class Test {

	/*
	 * Nests allow nested classes that are part of the same enclosing class but
	 * compiled to different class files, to access each other's private members
	 * without the need for compilers to insert synthetic generated
	 * accessibility-broadening bridge methods. This is a Java class bytecode level
	 * change.
	 */
	private static int x = 5;

	public static class NestedTest {
		public static void doSomething() {
			System.out.println(x);
		}
	}
}
