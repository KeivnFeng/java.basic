package org.basic.finallyTest;

public class Test {

	public static int testFinally1(){
		int result = 1;
		
		try{
			result = 2;
			return result;
		}catch(Exception e){
			return 0;
		}finally{
			result = 3;
			System.out.println("execute finally2");
		}
	}
	
	public static StringBuffer testFinally2(){
		StringBuffer s = new StringBuffer("Hello");
		try{
			return s;
		}catch(Exception e){
			return null;
		}finally{
			s.append(" World");
			System.out.println("execute finally2");
		}
	}
	
	
	
	public static void main(String[] args) {
		/*int resultVal = testFinally1();
		System.out.println(resultVal);
		StringBuffer resultRef = testFinally2();
		System.out.println(resultRef);*/
		
		String str = "bca";
		switch(str){
		case "abc":
			System.out.println(str);
			break;
		case "bca":
			System.out.println(str);
			break;
		default:
			System.out.println(str);
		
		}

	}

}
