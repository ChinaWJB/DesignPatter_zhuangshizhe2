package com.wjb.bzsz;


/**
 * �������ϵĳ��࣬����Ҳ�̳��� 
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
