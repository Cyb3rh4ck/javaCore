package javacore8.predicate;

import java.util.function.Function;
import java.util.function.Predicate;

public class LengthOfString {
	
	public static void main(String[] args) {
		Predicate<String> p = s -> (s.length() > 5);
		
		System.out.println(p.test("xyz"));
		System.out.println(p.test("cyb3rh4ck"));
		
		Function<String, Integer> f = s ->s.length();
		System.out.println(f.apply("Evan"));
		System.out.println(f.apply("Cyb3rh4ck"));
		
	}

}
