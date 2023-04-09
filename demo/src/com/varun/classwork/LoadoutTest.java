package com.varun.classwork;

public class LoadoutTest {

	public static void weaponConstructorTest() {
		Weapon smg = new Weapon(1, 1, "smg");
		Weapon ar = new Weapon(1, 2, "ar");
		assert smg.compareTo(ar) < 0;
		System.out.println("success");
	}

	public static void main(String[] args) {
		weaponConstructorTest();
	}
}
