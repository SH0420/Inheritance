package com.java.print;

public class Print {
    public int x;
    public int y;
    
//    Print(){
//    	super();  //Object 클래스의 생성자 호출
//    }
    
    public Print(int x,int y) {//정보를 제공해주는쪽에서 맞춰줘야하므로 public을 써야한다.
    	this.x = x;
    	this.y = y;
    }
    public String getLocation() {
    	return "x :  "+ x +"y : "+y;
    }
}
