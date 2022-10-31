package com.javacho.book;

import com.package2.B;
import com.package3.E;

public class AccessModify {

	public static void main(String[] args) {
		//접근제어자
		//Private < default < protected < public
		//public :모든 패키지경로에 사용가능
		//protected :같은패키지 or 상속관계에 있는 패키지에서 사용가능
		//default : 같은패키지
		//private : 클래스 내에서만 사용가능
		
		//클래스 : public , default
		//변수 : public, protected,default,private
		//생성자 : public, protected,default,private
		//메소드 : public, protected,default,private
		//단 지역변수는 사용불가
		//Public 한 경우에만 패키지와 상관없이 생성과 상속이 가능하다.
		//단 protected는 상속에 의해 다른패키지에서 사용이 가능하다.
		
		
		
		B b = new B(10);
	    //  C c = new C(20);->오류 : 생성자가 default 이기 때문에
//		E e = new E(30);    ->오류 : 생성자가 private 이기 떄문에
//	    F f = new F(50);    ->오류 : 생성자가 Protected 이기 때문에
	}

}
