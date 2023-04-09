package com.varun.classwork;

public class InheritenceTest {
	public static void main(String[] args) {
		Derived d1 = new Derived();
	}
}

class Base {
	public Base() {
		System.out.print("Base" + " ");
	}
	public Base(String x) {
		System.out.print(x + " ");
	}
}

class Derived extends Base{
	public Derived() {
		super("hi");
		System.out.print("Derived" + " ");
	}
}