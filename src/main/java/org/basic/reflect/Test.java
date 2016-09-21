package org.basic.reflect;
/**
 * 获取class的方法:1, class.forName("");2.类型.class;3.实例.getClass();
 * 创建对象的方法:1,new;2,reflect;3,clone();4,反序列化
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args){
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test() throws Exception{
		try{
			/*Class c = Class.forName("org.basic.reflect.Sub");
			Base b = (Sub)c.newInstance();
			b.f();*/
			String s1 = new String("abc");
			String s2 = new String("abc");
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			System.out.println(s1 == s2);
			System.out.println(s1.equals(s2));

		}catch(Exception e){
			System.out.println(e);
		}finally{
			throw new Exception("xxxxxxx");
		}
	}

}
