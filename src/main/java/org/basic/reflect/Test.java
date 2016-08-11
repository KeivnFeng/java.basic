package org.basic.reflect;
/**
 * 获取class的方法:1, class.forName("");2.类型.class;3.实例.getClass();
 * 创建对象的方法:1,new;2,reflect;3,clone();4,反序列化
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
