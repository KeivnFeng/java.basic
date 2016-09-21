package org.basic.clonetest;

import java.util.Date;

/**
 * 浅度复制对于基本数据类型，对于引用类型，还是引用的原对象地址，
 * 深度复制对于引用类型，复制了新对象
 * @author Administrator
 *
 */

public class Obj implements Cloneable{
	
	private Date birth = new Date();

	private String str = "default value";
	
	public void setStr(String str){
		this.str = str;
	}
	
	
	
	public String toString(){
		return str;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getStr() {
		return str;
	}
	
	public void changeDate(){
		this.birth.setMonth(4);
	}		
	
	public Object clone(){
		Obj o = null;
		try {
			o = (Obj)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		o.birth = (Date)this.getBirth().clone();
		return o;
	}
	
	
}
