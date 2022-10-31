package com.java.polymorphism;

public class CarTest {

	public static void main(String[] args) {
//		FireEngine fe = new FireEngine();
//		Ambulance ab = new Ambulance();
		
        //다형성을 적용한 객체생성
		//참조형의 형변환 (*참조할수있는 멤버의 갯수가 변한다)
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water(); 
//		car = fe;   //Car타입으로 변환됨  // 자동형변환Car = FireEngine (형변환은 상속구조면 가능), 참조형의 형변환, 
//		//car.water(); error
//		car.stop();
//		fe2 = (FireEngine)car;//강제형 변환    /작은타입은 큰타입으로 변환 불가
//		fe2.water(); 
		
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		
		Car car = new Car();
		car.dowork(fe);
		car.dowork(ab);
	}

}
