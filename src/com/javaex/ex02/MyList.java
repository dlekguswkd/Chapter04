package com.javaex.ex02;

public class MyList {
	
	//필드
	private Object[] oArray;
	private int crtpos;
	
	//생성자
	public MyList() {
		oArray= new Object[3];
		crtpos=0;
	}
	//메소드 일반
	public void add(Object obj) {
		this.oArray[crtpos]=obj;
		crtpos++;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return crtpos;
	}
	

}
