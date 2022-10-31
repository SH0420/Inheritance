package com.java.capsule;

public class Time {
    private int hour;
    private int minute;
    private int second;
//    final double PI; // 상수 - 생성자를 통한 초기화 (상수는 무조건 초기화시켜서 사용)
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
			System.out.println("유효하지 않은 값입니다.");
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
		}
		
		public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			System.out.println("유효하지 않은 값입니다.");
			return;
		}
			this.minute = minute;
	}
	public int getSecond() {
		
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second >59) {
			System.out.println("유효하지 않은 값입니다.");
			this.second = second;
			return;
		}
		this.minute = minute;
	}
	//캡슐화를 구현하는방법
    //getter / setter 외부에 노출시키지않지만 간접적으로 이용하게한다 /변수하나에 setter,getter 하나씩
    //10/05.1  
 }
