package com.corejava.oops.collections;

public class StringReverseExample {
	public static void main(String[] args){
		String string ="chaitu";
		StringBuffer reverse = new StringBuffer(string);
		System.out.println("before reverse: "+reverse);
		reverse.reverse();
		System.out.println("After reverse: "+reverse);
	}

}
