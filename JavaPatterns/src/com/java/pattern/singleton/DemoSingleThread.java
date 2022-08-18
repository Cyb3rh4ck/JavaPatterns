package com.java.pattern.singleton;

/**
 * @author efren
 *
 */
public class DemoSingleThread {

	public static void main(String[] args) {
		System.out.println("If you see the same value, then singletonwas reused (yay!)" + "\n" +
		"If you see different values, then 2 sigletons were created (booooo!)" + "\n\n" +
		"RESULT: " + "\n");
		
		Singleton singleton = Singleton.getIntance("FOO");
		Singleton anotherSingleton = Singleton.getIntance("BAR");
		
		System.out.println(singleton.value);
		System.out.println(anotherSingleton.value);
		
	}

}
