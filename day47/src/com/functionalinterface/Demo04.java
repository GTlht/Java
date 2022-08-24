package com.functionalinterface;

import java.util.function.Supplier;

public class Demo04 {
	public static void main(String[] args) {
		/*Supplier<String> supplier = new Supplier<String>() {
			@Override
			public String get() {
				return "约吗";
			}
		};*/
		
		//Supplier<String> supplier = () -> {return "约吗";};
		
		Supplier<String> supplier = () -> "约吗";
		System.out.println(supplier.get());
	}
}

/*
@FunctionalInterface
public interface Supplier<T> {
   public abstract T get();
}

*/