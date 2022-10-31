package com.java.tv;
//import com.java.print.Print;
//import com.java.print.Print3D;
//import com.java.print.*;//한꺼번에 적용가능 but 가독성을위해서 다 쓰는게좋음   
//ctrl + shift + o  -->자동 import 단축키

import com.java.print.Print3D;

public class Tv {
   
	//Print print = new Print(10,20); // 인스턴스 멤버변수,포함관계
	Print3D print= new Print3D(10,20,30);	
	boolean power;
    int channel;
    
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
