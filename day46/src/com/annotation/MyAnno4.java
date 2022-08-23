package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@Target(value = {ElementType.TYPE})
//@Target({ElementType.TYPE})
//@Target(ElementType.TYPE)
//@Target(ElementType.FIELD)
//@Target(ElementType.METHOD)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
public @interface MyAnno4 {

}
