package com.annotation;

public @interface MyAnno3 {
	//int aaa();
	//int aaa() default 18;
	int value();
	//String aaa();
	String aaa() default "tom";
}
