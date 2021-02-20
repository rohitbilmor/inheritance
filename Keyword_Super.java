package com.inheritance;
class Rhombus
{
	public int side1;
	public int side2;
	public int x=10;
	public Rhombus()
	{
		side1=side2=4;
	}
	public Rhombus(int x,int y)
	{
		side1=x;
		side2=y;
	}
	public int area()
	{
		return side1*side2;
	}
}
class Rhomudiod extends Rhombus
{
	public int side3;
	int x=30;
	public Rhomudiod()
	{
		side3=4;
	}
	public Rhomudiod(int x,int y,int z)
	{
		super(x,y);
		side3=z;
	}
	/*public int volume()
	{
		return side1*side2*side3;
	}*/
	 void display()
	{
		System.out.println("Parent class x: "+super.x);
		System.out.println("child clas x: "+x);
	}
}
public class Keyword_Super {

	public static void main(String[] args) {
	Rhomudiod rr=new Rhomudiod();
	rr.display();
	}

}
