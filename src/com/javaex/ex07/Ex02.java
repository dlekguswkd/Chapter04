package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		//예전 로또번호 출력
		int no= (int)(Math.random()*45)+1;
		System.out.println(no);
		*/
		
		Set<Integer> iSet= new HashSet<Integer>();
		
		while(true) {
			
			if(iSet.size()==6) {
				break;
			}
			int no= (int)(Math.random()*45)+1;

			iSet.add(no);	//no는 박싱되서 Integer no
							//박싱 -> 주머니에 주소가 들어감
			System.out.println(no);	//넣은 순서대로 나옴
		}
		
		System.out.println("----------");
		for(int no : iSet) {	//나오는 순서는 완전 뒤죽박죽 되어버림 set의 특징
			System.out.println(no);
		}
		
	}

}
