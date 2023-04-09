package com.varun.classwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {
	// collections: lists, sets, LinkedList, HasMaps, Tree
	
	
	
	
	
	//return even number in a list
	public static List<Integer> even(List<Integer> a) {
		List<Integer> b = new ArrayList<Integer>();
		
		for(Integer e : a) {
			if(e % 2 == 0) {
				b.add(e);
			}
		}
		return b;
	}
	
	//return a list without duplicates
	public static List<Integer> noDupes(List<Integer> a) {
		Set<Integer> s = new HashSet<Integer>(a);
		return new ArrayList<Integer>(s);
	}
	
	
	//input: list of numbers, n || find the number of pairs in the list that add up to n
	public static Integer pairs(List<Integer> a, int n) {
		int answer = 0;
		for(int i = 0; i < a.size(); i++) {
			for(int j = 0; j < a.size(); j++) {
				if(a.get(i) + a.get(j) == n) {
					answer++;
				}
			}
		}
		return answer/2;
	}
	
	public static Integer pairs2(List<Integer> a, int n) {
		int answer = 0;
		Set<Integer> s = new HashSet<Integer>();
		for(int e : a) {		
			if(s.contains(e)) {
				answer++;
			}
			s.add(n - e);
		}
		return answer;
	}
	
	public static void main(String[]args) {
		//System.out.println(even(List.of(1,2,3,4,5,6)));
		//System.out.println(noDupes(List.of(1,2,3,4,5,6,1,2,3,4,5,6)));
		
		List<Integer> bigList = new ArrayList<Integer>();
		for(int i = 1; i < 7; i++) {
			bigList.add(i);
		}
		
		long start = System.currentTimeMillis();
		System.out.println(Collections.pairs2(bigList, 7));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
}
