package org.basic.nulltest;

/**
 * 通过Java编程的一些经验和使用简单的技巧来避免空指针异常，你可以使你的代码变得null安全。因为null经常作为空或者未初始化的值，
 * 它是困惑的源头。对于方法而言，记录下null作为参数时方法有什么样的行为也是非常重要的。
 * 总而言之，记住，null是任何一个引用类型变量的默认值，在java中你不能使用null引用来调用任何的instance方法或者instance变量。
 * 
 * 
 * 
 * null既不是对象也不是一种类型，它仅是一种特殊的值，你可以将其赋予任何引用类型，你也可以将null转化成任何类型
 * Java中的任何引用变量都将null作为默认值
 * null可以赋值给引用变量，你不能将null赋给基本类型变量
 * 任何含有null值的包装类在Java拆箱生成基本数据类型时候都会抛出一个空指针异常。一些程序员犯这样的错误，
 * 他们认为自动装箱会将null转换成各自基本类型的默认值，例如对于int转换成0，布尔类型转换成false，但是那是不正确的
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
	 * 如果使用了带有null值的引用类型变量，instanceof操作将会返回false：
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
	 * 你可能知道不能调用非静态方法来使用一个值为null的引用类型变量。它将会抛出空指针异常，但是你可能不知道，
	 * 你可以使用静态方法来使用一个值为null的引用类型变量。因为静态方法使用静态绑定，不会抛出空指针异常
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
	    * 你可以使用==或者!=操作来比较null值，但是不能使用其他算法或者逻辑操作，
	    * 例如小于或者大于。跟SQL不一样，在Java中null==null将返回true
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
