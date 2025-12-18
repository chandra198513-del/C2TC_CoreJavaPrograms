package com.tnsif.oops.encapsulation;

public class OopsConceptDemo {
    //	data members
	private int serialNum;
	private String name;
	private int age;

	
	public int getSerialNum() {   //is used to get the variable
		return serialNum;
	}


	public void setSerialNum(int serialNum) {  // used to 
		this.serialNum = serialNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	// Object class method
	@Override
	public String toString() {
		return "Serial Number=" + serialNum + "\nName=" + name + "\nAge=" + age;
	}

}
