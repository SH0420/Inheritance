package com.javacho.book;

import com.package2.B;
import com.package3.E;

public class AccessModify {

	public static void main(String[] args) {
		//����������
		//Private < default < protected < public
		//public :��� ��Ű����ο� ��밡��
		//protected :������Ű�� or ��Ӱ��迡 �ִ� ��Ű������ ��밡��
		//default : ������Ű��
		//private : Ŭ���� �������� ��밡��
		
		//Ŭ���� : public , default
		//���� : public, protected,default,private
		//������ : public, protected,default,private
		//�޼ҵ� : public, protected,default,private
		//�� ���������� ���Ұ�
		//Public �� ��쿡�� ��Ű���� ������� ������ ����� �����ϴ�.
		//�� protected�� ��ӿ� ���� �ٸ���Ű������ ����� �����ϴ�.
		
		
		
		B b = new B(10);
	    //  C c = new C(20);->���� : �����ڰ� default �̱� ������
//		E e = new E(30);    ->���� : �����ڰ� private �̱� ������
//	    F f = new F(50);    ->���� : �����ڰ� Protected �̱� ������
	}

}
