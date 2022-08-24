package com.functionalinterface;

import java.util.function.Consumer;

public class Demo05 {
	public static void main(String[] args) {
		/*Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};*/
		
		//Consumer<String> consumer = (String t) -> {System.out.println(t);};
		
		//Consumer<String> consumer = t -> System.out.println(t);
		
		Consumer<String> consumer = System.out::println;
		consumer.accept("约吗");
	}
}

/*
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
*/