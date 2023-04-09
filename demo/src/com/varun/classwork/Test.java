package com.varun.classwork;

import java.util.ArrayList;
import java.util.List;

public class Test {
	//public static void main(String[] args) {
		//RegularPolygon regularPolygon = new RegularPolygon(4, 6);
		//System.out.println(regularPolygon.bye());
		//System.out.println(RegularPolygon.);
		
	//}
	public static void main(String[]args) {
		//System.out.println(even(List.of(1,2,3,4,5,6)));
		//System.out.println(noDupes(List.of(1,2,3,4,5,6,1,2,3,4,5,6)));
		Collections a = new Collections();
		List<Integer> bigList = new ArrayList<Integer>();
		for(int i = 1; i < 7; i++) {
			bigList.add(i);
		}
		
		long start = System.currentTimeMillis();
		System.out.println(a.pairs2(bigList, 7));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
