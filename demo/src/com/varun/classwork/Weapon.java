package com.varun.classwork;

public class Weapon implements Comparable{
	public String name;
	public int damage;
	private int rate;

	public Weapon(int damage, int rate, String name) {
		this.damage = damage;
		this.rate = rate;
		this.name = name;
	}
	
	public int getRate() {
		return this.rate;
	}
	
	public void setRate(int rate) {
		if (rate > 0 && rate < 100) {
			this.rate = rate;
		}
	}

	@Override
	public int compareTo(Object o) {
		Weapon other = (Weapon) o;
		return this.damage * this.rate - other.damage * other.rate;

	}

}
