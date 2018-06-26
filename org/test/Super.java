package org.test;

public class Super extends Parent{
	int id=100;
	public void dure() {
		int id=10;
	System.out.println(super.id);
	}
	public static void main(String[] args) {
		Super s = new Super();
		s.dure();
	}

}
