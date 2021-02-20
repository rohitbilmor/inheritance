package com.inheritance;
class Rectangle3
{
	public int length;
	public int breadth;
	public Rectangle3()
	{
		length=breadth=1;
	}
	public Rectangle3(int x,int y)
	{
		length=x;
		breadth=y;
	}
}
class Cubiod3 extends Rectangle3
{
	public int height;
	public Cubiod3()
	{
		height=1;
	}
	public Cubiod3(int x,int y,int z)
	{
	super(x,y);
	height=z;
	}
	public int volume()
	{
		return length*breadth*height;
	}
	
}
public class Rectangle_Param_Const {

	public static void main(String[] args) {
		Cubiod3 c3=new Cubiod3(2,3,6);
		System.out.println(c3.volume());

	}

}
