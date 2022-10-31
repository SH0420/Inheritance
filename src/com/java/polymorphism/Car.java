package com.java.polymorphism;

public class Car {
	String color;
	int door;
	
	void driver() {
		System.out.println("drive gogo");
	}
	void stop() {
		System.out.println("stop");
	}
	
	//매개변수 Car 타입으로 정의
	// Car -> Car, FireEngine, Ambulance
	
	void dowork(Car c) { //매개변수를 활용한 객체의 다형성
		//instanceof
		//객체의 타입을 확인
		//c.water(); error
		
		if(/*참조변수*/c instanceof FireEngine/*클래스이름(알고싶은 타입)*/) {
			FireEngine fe =(FireEngine)c;
			fe.water();
		}else if( c instanceof Ambulance) {
			Ambulance ab = (Ambulance)c;
			ab.siren();
		}
		
	}

}
