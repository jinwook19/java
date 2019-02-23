package test;

import practice.PersonClass;

public class CarMain {

	public static void main(String[] args) {
		//1. 선언,생성,초기화
		// 선언
		CarClass car1;
		// 생성
		car1 = new CarClass();
		// 초기화
		car1.color="파란색";
		car1.modelname="그랜저";
		car1.size="대형";
		car1.weight=2000;
		
		System.out.println(car1.color + car1.modelname + car1.size + car1.weight);
		//2. 선언과 생성, 초기화
		//선언과 생성
		CarClass car2 = new CarClass();
		//초기화
		car2.color="파란색";
		car2.modelname="그랜저";
		car2.weight=3000;
		
		System.out.println(car2.color);
		//3. 선언과 생성과 초기화
		CarClass car3 = new CarClass("빨간색","대형","그랜저",2000);
		System.out.println(car3.color);
	}


}
