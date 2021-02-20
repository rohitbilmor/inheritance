package com.inheritance;
class Circle
{
	public double radius;
	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
}
class Cylinder extends Circle
{
	public double height;
	public double volume()
	{
		return area()*height;
	}
}
public class Circle1 {

	public static void main(String[] args) {
		Circle c1=new Circle();
		Cylinder c2=new Cylinder();
		c1.radius=5.4;
		c2.radius=3.6;
		c2.height=3.7;
System.out.println(c1.area());
System.out.println(c1.perimeter());	
System.out.println(c2.area());
System.out.println(c2.perimeter());
System.out.println(c2.volume());

	}

}
