package com.java.capsule;

public class TimeTest {

	public static void main(String[] args) {
        Time t = new Time();
        //t.hour = 48;    //0~23
        
        t.setHour(12);
        System.out.println(t.getHour());
	}

}
