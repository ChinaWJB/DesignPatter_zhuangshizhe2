package com.wjb.beverages;
import com.wjb.bzsz.*;

/**
 * 一种饮料，深焙咖啡
 * @author hp
 *
 */
public class DarkRoast extends Beverage{
	
	
	public DarkRoast(){
		description = "DarkRoast Coffee: ";
	}	
	
	public double cost(){		//非抽象类，必须实现超类的抽象类
		return 0.99;
	}
}
