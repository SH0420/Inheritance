package com.java.print;

public class Print {
    public int x;
    public int y;
    
//    Print(){
//    	super();  //Object Ŭ������ ������ ȣ��
//    }
    
    public Print(int x,int y) {//������ �������ִ��ʿ��� ��������ϹǷ� public�� ����Ѵ�.
    	this.x = x;
    	this.y = y;
    }
    public String getLocation() {
    	return "x :  "+ x +"y : "+y;
    }
}
