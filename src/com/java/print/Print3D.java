package com.java.print;

public class Print3D extends Print {
    int z;
    
    //��ӿ����� �������� Ư¡
    //1.�θ�����ڸ� ȣ���ؾ��Ѵ�.
    //2.ȣ��ÿ� super()�� ����Ѵ�.
    //3.�⺻�������� ��� �θ�������� �⺻�����ڸ� ȣ���Ѵ�.
    //4.�����ڴ� ��ӵ��� �ʴ´�.(��� ������ �޼ҵ常 ��ӵǾ�����.)
    
    
//    Print3D(){
//    	super(); //Print() ������ ȣ��
//    }
    
    Print3D(){
    	super(10,20);//= Print(int x, int y)
    	this.z = 30;//�ڽĻ����ڿ����� �θ�����ڸ� ȣ���ϱ��ؾ��Ѵ�.
    }
//    
    public Print3D(int x,int y,int z){
    	super(x, y); //= Print(int x, int y)
    	this.z = z;
    }
    
    //��ӱ����� ����Ѵ�.
    //�θ� �޼ҵ��� ����ο� �����ؾ� �Ѵ�.(����Ÿ������)
    //�Ű������� �����ؾ� �Ѵ�.
    //���๮�� ������ �Ѵ�.
    //�θ��� �޼ҵ带 ����Ҷ��� super��� Ű���带 ����Ѵ�.
    //super�� ��ӵǴ� �ڽĿ����� ���ȴ�.
    
    public String getLocation() {//�������̵�(������)
    	return super.getLocation() + " z : "+ z;
    }
}
