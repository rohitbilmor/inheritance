package com.inheritance;
class Super
{

		public void display()
		{
		System.out.println("Super class:Hello");
		}
}
class Sub extends Super
{
	@Override
	public void display()
	{
		System.out.println("Sub class:Hello Welcome");
	}
}
public class MethodRidding {

	public static void main(String[] args) {
		Sub su=new Sub();
		su.display();
	}

}
