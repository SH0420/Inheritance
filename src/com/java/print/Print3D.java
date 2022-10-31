package com.java.print;

public class Print3D extends Print {
    int z;
    
    //상속에서의 생성자의 특징
    //1.부모생성자를 호출해야한다.
    //2.호출시에 super()를 사용한다.
    //3.기본생성자인 경우 부모생성자의 기본생성자를 호출한다.
    //4.생성자는 상속되지 않는다.(멤버 변수와 메소드만 상속되어진다.)
    
    
//    Print3D(){
//    	super(); //Print() 생성자 호출
//    }
    
    Print3D(){
    	super(10,20);//= Print(int x, int y)
    	this.z = 30;//자식생성자에서는 부모생성자를 호출하긴해야한다.
    }
//    
    public Print3D(int x,int y,int z){
    	super(x, y); //= Print(int x, int y)
    	this.z = z;
    }
    
    //상속구조에 사용한다.
    //부모 메소드의 선언부와 동일해야 한다.(리턴타입포함)
    //매개변수도 동일해야 한다.
    //실행문은 재정의 한다.
    //부모의 메소드를 사용할때는 super라는 키워드를 사용한다.
    //super는 상속되는 자식에서만 사용된다.
    
    public String getLocation() {//오버라이딩(재정의)
    	return super.getLocation() + " z : "+ z;
    }
}
