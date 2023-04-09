package com.varun.classwork;

public class RegularPolygon {
	int sides;
	int sideLength;
	
	//constructor
	public RegularPolygon(int sides, int sideLength) {
		this.sides = sides;
		this.sideLength = sideLength;
	}
	
	public int perimeter() {
		return this.sides * this.sideLength;
	}
	public int hello() {
		return 1;
	}
	public static int bye() {
		return 2;
	}
}
