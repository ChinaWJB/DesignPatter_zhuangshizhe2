package com.wjb.beverages;
import com.wjb.bzsz.Beverage;
import com.wjb.bzsz.Size;



/**
 * 一种饮料，家庭混合咖啡(综合咖啡)
 * @author hp
 *
 */
public class HouseBlend extends Beverage{

	
	public HouseBlend(){
		description = "HouseBlend Coffee: ";
	}

	public double cost(){		//非抽象类，必须实现超类的抽象类
		return 0.99;
	}
}
