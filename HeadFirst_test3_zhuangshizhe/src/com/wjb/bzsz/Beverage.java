package com.wjb.bzsz;


/**
 * 各种饮料的超类，调料也继承它 
 * @author hp
 *
 */
public abstract class Beverage {
	protected String description = "Unknown Beverage";
	protected  Size size;
	
	public String getDescription(){
		return description;
	}
	
	public  void setSize(Size s){
		size = s;
	}
	
	public Size getSize(){
		return size;
	}
	
	public abstract double cost();
}
