package org.basic.reflect;
/**
 * ��ȡclass�ķ���:1, class.forName("");2.����.class;3.ʵ��.getClass();
 * ��������ķ���:1,new;2,reflect;3,clone();4,�����л�
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		try{
			Class c = Class.forName("org.basic.reflect.Sub");
			Base b = (Sub)c.newInstance();
			b.f();
		}catch(Exception e){
			
		}
	}

}
