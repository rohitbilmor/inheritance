package com.inheritance;
class Parent2
{
	public Parent2()
	{
		System.out.println("Parent Constructor Non-Param");
	}
	public Parent2(int x)
	{
		System.out.println("Parent Constructor Param");
	}
}
class Child2 extends Parent2
{
	public Child2()
	{
		System.out.println("Child Constructor Non-Param");
	}
	public Child2(int y)
	{
		System.out.println("Child Constructor Param");
	}
}
public class Param_Const_Inherit {

	public static void main(String[] args) {
		Child2 c1=new Child2(12);

	}

}
