package com.java.capsule;

public class Time {
    private int hour;
    private int minute;
    private int second;
//    final double PI; // ��� - �����ڸ� ���� �ʱ�ȭ (����� ������ �ʱ�ȭ���Ѽ� ���)
//	
//    public Time(double pi) {
//    	super();
//    	PI = pi;
   
//    }
    public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23 ) {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
		}
		
		public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
		}
			this.minute = minute;
	}
	public int getSecond() {
		
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second >59) {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			this.second = second;
			return;
		}
		this.minute = minute;
	}
	//ĸ��ȭ�� �����ϴ¹��
    //getter / setter �ܺο� �����Ű�������� ���������� �̿��ϰ��Ѵ� /�����ϳ��� setter,getter �ϳ���
    //10/05.1  
 }
