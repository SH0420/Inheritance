package com.java.polymorphism;

public class CarTest {

	public static void main(String[] args) {
//		FireEngine fe = new FireEngine();
//		Ambulance ab = new Ambulance();
		
        //�������� ������ ��ü����
		//�������� ����ȯ (*�����Ҽ��ִ� ����� ������ ���Ѵ�)
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water(); 
//		car = fe;   //CarŸ������ ��ȯ��  // �ڵ�����ȯCar = FireEngine (����ȯ�� ��ӱ����� ����), �������� ����ȯ, 
//		//car.water(); error
//		car.stop();
//		fe2 = (FireEngine)car;//������ ��ȯ    /����Ÿ���� ūŸ������ ��ȯ �Ұ�
//		fe2.water(); 
		
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		
		Car car = new Car();
		car.dowork(fe);
		car.dowork(ab);
	}

}
