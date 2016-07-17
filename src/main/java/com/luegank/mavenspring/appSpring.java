package com.luegank.mavenspring;
public class appSpring{
	private String name;
	private int age ;
	
	public void setName(String a){
		name = a;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	
	public void say(){
		System.out.println("I am "+name+",I am "+age+" years old.");
	}
}