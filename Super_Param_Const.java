package com.inheritance;
class Parent3
{
	public Parent3()
	{
		System.out.println("Parent Constructor Non-Param");
	}
	public Parent3(int x)
	{
		System.out.println("Parent Constructor Param "+x);
	}
}
class Child3 extends Parent3
{
	public Child3()
	{
		System.out.println("Child Constructor Non-Param");
	}
	public Child3(int x,int y)
	{
		super(x); //refers to the parent class
		System.out.println("Child Constructor Param "+y);
	}
}
public class Super_Param_Const {

	public static void main(String[] args) {
		Child3 c1=new Child3(12,21);

	}

}

