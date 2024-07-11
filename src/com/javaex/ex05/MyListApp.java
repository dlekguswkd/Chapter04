package com.javaex.ex05;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {
		//제네릭은 기본자료형응ㄹ 쓸수 없다
		//ArrayList<int> intList = new ArrayList<int>();
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(3);
		intList.add(6);
		intList.add(9);
		
		System.out.println(intList.toString());
		System.out.println(intList.size());
		
		intList.remove(0);
		System.out.println(intList.toString());
		
		System.out.println(intList.get(1));

		
		
	}

}
