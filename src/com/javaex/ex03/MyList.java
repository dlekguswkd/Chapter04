package com.javaex.ex03;

public class MyList<T> {
	
	//필드
	private T[] oArray;
	private int crtpos;
	
	//생성자
	public MyList() {
		oArray= (T[])new Object[3];
		crtpos=0;
	}
	//메소드 일반
	public void add(T obj) {
		this.oArray[crtpos]=obj;
		crtpos++;
	}
	
	public T get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return crtpos;
	}
	

}
