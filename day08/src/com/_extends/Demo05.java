package com._extends;

public class Demo05 {

}

class F {
	protected Animal print() {
		return new Animal();
	}
}

class Z extends F {
	@Override
	public Dog print() {
		return new Dog();
	}
}

class Animal {}
class Dog extends Animal {}