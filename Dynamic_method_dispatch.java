package com.inheritance;
class Super1
	{

			public void display()
			{
			System.out.println("Super class:Hello");
			}
	}
	class Sub1 extends Super1
	{
		@Override
		public void display()
		{
			System.out.println("Sub class:Hello Welcome");
		}
	}
	public class Dynamic_method_dispatch {

		public static void main(String[] args) {
			Super1 sr=new Sub1();
			sr.display();
		}

}
