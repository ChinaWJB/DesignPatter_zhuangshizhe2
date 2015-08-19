package com.wjb.beverages;
import com.wjb.bzsz.Beverage;
import com.wjb.bzsz.Size;



/**
 * 一种饮料,浓咖啡
 * @author hp
 *
 */
public class Espresso extends Beverage{

	
	public Espresso(){
		description = "Espresso Coffee: ";
	}
	
	public double cost(){		//非抽象类，必须实现超类的抽象类
		return 1.99;
	}
}
