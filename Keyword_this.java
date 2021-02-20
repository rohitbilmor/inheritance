package com.inheritance;
class Triangle
{
	public double base;
	public double height;
	public Triangle()
	{
		base=height=1;
	}
	public Triangle(double base,double height) //the variables are not same as properties
	{
		this.base=base;
		this.height=height; //by using this we can give reference to properties
	}
	public void display()
	{
		System.out.println(this.base);
		System.out.println(this.height);
	}
	public double area()
	{
		return this.base*this.height;
	}
}
public class Keyword_this {

	public static void main(String[] args) {
		Triangle t=new Triangle(4.5,6.8);
		System.out.println(t.area());

	}

}
