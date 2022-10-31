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
	
	//�Ű����� Car Ÿ������ ����
	// Car -> Car, FireEngine, Ambulance
	
	void dowork(Car c) { //�Ű������� Ȱ���� ��ü�� ������
		//instanceof
		//��ü�� Ÿ���� Ȯ��
		//c.water(); error
		
		if(/*��������*/c instanceof FireEngine/*Ŭ�����̸�(�˰���� Ÿ��)*/) {
			FireEngine fe =(FireEngine)c;
			fe.water();
		}else if( c instanceof Ambulance) {
			Ambulance ab = (Ambulance)c;
			ab.siren();
		}
		
	}

}
