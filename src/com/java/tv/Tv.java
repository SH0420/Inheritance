package com.java.tv;
//import com.java.print.Print;
//import com.java.print.Print3D;
//import com.java.print.*;//�Ѳ����� ���밡�� but �����������ؼ� �� ���°�����   
//ctrl + shift + o  -->�ڵ� import ����Ű

import com.java.print.Print3D;

public class Tv {
   
	//Print print = new Print(10,20); // �ν��Ͻ� �������,���԰���
	Print3D print= new Print3D(10,20,30);	
	boolean power;
    int channel;
    
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
