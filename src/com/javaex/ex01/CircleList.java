package com.javaex.ex01;

public class CircleList {
	
	//필드
		private Circle[] cArray;
		private int crtpos;

		//생성자
		public CircleList() {
			cArray=new Circle[3];
			crtpos=0;
		}

		public CircleList(Circle[] cArray) {
			super();
			this.cArray = cArray;
		}

		
		//메소드 gs

		//메소드 일반
		public void add(Circle circle) {
			this.cArray[crtpos]=circle;
			crtpos++;
		}
		
		public Circle get(int index) {	//방의주소
			return cArray[index];
		}
		
		public int size() {
			return crtpos;
		}
		

}
