package com.inheritance;
class Tv
{
	public void switchOn()
	{System.out.println("Tv is On");}
	public void changeChannel()
	{System.out.println("Tv channel is changed");}
}
class SmartTv extends Tv
{
	@Override
	public void switchOn()
	{System.out.println("SmartTv is On");}
	@Override
	public void changeChannel()
	{System.out.println("Smart Tv channel is changed");}
	public void browse()
	{System.out.println("Smart Tv browsing");}
}	
public class Tv_Dynamic_method_dispatch {

	public static void main(String[] args) {
		Tv t=new SmartTv();
		t.changeChannel();
		t.switchOn();
		//t.browse(); error bcoz we cannot include sub class methods

	}

}
