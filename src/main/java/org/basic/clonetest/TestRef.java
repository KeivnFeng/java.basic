package org.basic.clonetest;

public class TestRef {
	private Obj aObj = new Obj();
	private int aInt = 0;
	public Obj getaObj() {
		return aObj;
	}
	public void setaObj(Obj aObj) {
		this.aObj = aObj;
	}
	public int getaInt() {
		return aInt;
	}
	public void setaInt(int aInt) {
		this.aInt = aInt;
	}
	
	public void changeObj(Obj inObj){
		inObj.setStr("changed value");
	}
	
	public void changeInt(int inInt){
		inInt = 1;
	}
	
	public static void main(String[] args){
		Obj a = new Obj();
		Obj b = (Obj)a.clone();
		//b.changeDate();
		System.out.println("a=" + a.getBirth());
		System.out.println("b=" + b.getBirth());
		
		System.out.println("a=" + a.getStr());
		System.out.println("b=" + b.getStr());
	}
}
