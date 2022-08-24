package com.functionalinterface;

import java.util.function.Function;

public class Demo07 {
	public static void main(String[] args) {
		/*Function<String, Integer> function = new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return Integer.parseInt(s);
			}
		};*/
		
		//Function<String, Integer> function = (String s) -> {return Integer.parseInt(s);};
		
		//Function<String, Integer> function = s -> Integer.parseInt(s);
		
		Function<String, Integer> function = Integer::parseInt;
		
		System.out.println(function.apply("12"));
	}
}

/*
@FunctionalInterface
public interface Function<T, R> {
	R apply(T t);
}
*/