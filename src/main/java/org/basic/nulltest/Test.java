package org.basic.nulltest;

/**
 * ͨ��Java��̵�һЩ�����ʹ�ü򵥵ļ����������ָ���쳣�������ʹ��Ĵ�����null��ȫ����Ϊnull������Ϊ�ջ���δ��ʼ����ֵ��
 * ���������Դͷ�����ڷ������ԣ���¼��null��Ϊ����ʱ������ʲô������ΪҲ�Ƿǳ���Ҫ�ġ�
 * �ܶ���֮����ס��null���κ�һ���������ͱ�����Ĭ��ֵ����java���㲻��ʹ��null�����������κε�instance��������instance������
 * 
 * 
 * 
 * null�Ȳ��Ƕ���Ҳ����һ�����ͣ�������һ�������ֵ������Խ��丳���κ��������ͣ���Ҳ���Խ�nullת�����κ�����
 * Java�е��κ����ñ�������null��ΪĬ��ֵ
 * null���Ը�ֵ�����ñ������㲻�ܽ�null�����������ͱ���
 * �κκ���nullֵ�İ�װ����Java�������ɻ�����������ʱ�򶼻��׳�һ����ָ���쳣��һЩ����Ա�������Ĵ���
 * ������Ϊ�Զ�װ��Ὣnullת���ɸ��Ի������͵�Ĭ��ֵ���������intת����0����������ת����false���������ǲ���ȷ��
 * @author Administrator
 *
 */
public class Test {
	private static Object myObj;
	
	String str = null; // null can be assigned to String
	Integer itr = null; // you can assign null to Integer also
	Double dbl = null;  // null can also be assigned to Double
	 
	String myStr = (String) null; // null can be type cast to String
	Integer myItr = (Integer) null; // it can also be type casted to Integer
	Double myDbl = (Double) null; // yes it's possible, no error
	
	public static void main(String args[]){
		
	}
	
	
	/**
	 * ���ʹ���˴���nullֵ���������ͱ�����instanceof�������᷵��false��
	 */
	public static void testA(){
		Integer iAmNull = null;
		if(iAmNull instanceof Integer){
		   System.out.println("iAmNull is instance of Integer");                             
		 
		}else{
		   System.out.println("iAmNull is NOT an instance of Integer");
		}
	}
	
	/**
	 * �����֪�����ܵ��÷Ǿ�̬������ʹ��һ��ֵΪnull���������ͱ������������׳���ָ���쳣����������ܲ�֪����
	 * �����ʹ�þ�̬������ʹ��һ��ֵΪnull���������ͱ�������Ϊ��̬����ʹ�þ�̬�󶨣������׳���ָ���쳣
	 */
	   public static void testB(){
		   Test myObject = null;
	      myObject.iAmStaticMethod();
	      myObject.iAmNonStaticMethod();                             
	   }
	 
	   private static void iAmStaticMethod(){
	        System.out.println("I am static method, can be called by null reference");
	   }
	 
	   private void iAmNonStaticMethod(){
	       System.out.println("I am NON static method, don't date to call me by null");
	   }
	   
	   /**
	    * �����ʹ��==����!=�������Ƚ�nullֵ�����ǲ���ʹ�������㷨�����߼�������
	    * ����С�ڻ��ߴ��ڡ���SQL��һ������Java��null==null������true
	    */
	   public static void testC(){
	       String abc = null;
	       String cde = null;
	 
	       if(abc == cde){
	           System.out.println("null == null is true in Java");
	       }
	 
	       if(null != null){
	           System.out.println("null != null is false in Java"); 
	       }
	 
	       // classical null check
	       if(abc == null){
	           // do something
	       }
	 
	       // not ok, compile time error
	      /* if(abc > null){
	 
	       }*/
	   }

}
