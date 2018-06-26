package org.test;

public class Reverse {
public static void main(String[] args) {
	String s ="India Is My Country";
	String[] value=s.split(" ");
	for(int i=value.length-1; i>=0;i--) {
		System.out.println(value[i]);
	}
}
}
