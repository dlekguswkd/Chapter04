package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> iSet=new HashSet<Integer>();

		Integer i01=new Integer(3);
		Integer i02=6; //자동박싱 Integer i02=new Integer(6);
		//int i= new Integer(3);	//자동언박싱
		Integer i03=new Integer(9);
		
		iSet.add(i01);	//set은 방번호 없음 뒤죽박죽 
		iSet.add(i02);	//순서가 상관없음
		iSet.add(i03);
		
		System.out.println(iSet.size());
		System.out.println(iSet.toString());
		
		/*
		for(int i=0; i<iSet.size(); i++) {
			//i를 방번호 (index)로 사용
		}
		*/
		
		//향상된 for문
		for(Integer no: iSet) {	//오른쪽엔 전체를 써넣어주기, 왼쪽엔 한개짜리 이름 만들어주기
			System.out.println(no.toString());	//tostring 생략가능
		}
		
		
	}

}
