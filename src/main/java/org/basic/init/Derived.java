package org.basic.init;

/**
 * java�ĳ�ʼ��˳�򣺸��ྲ̬���������ྲ̬����顢���ྲ̬���������ྲ̬����顢����Ǿ�̬����������Ǿ�̬����顢���๹�캯��������Ǿ�̬����������Ǿ�̬����顢���๹�캯��
 * @author Administrator
 *
 */
public class Derived extends Base {
	
	static{
		System.out.println("Derived static block");
	}
	
	{
		System.out.println("Derived block");
	}
	
	public Derived(){
		
		System.out.println("Derived constructor");
	}
	
	public static void main(String args[]){
		new Derived();
	}

}
