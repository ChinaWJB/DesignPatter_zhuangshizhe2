package com.wjb.bzsz;


/**
 * 调料的超类，继承饮料的超类Beverage
 * @author hp
 *
 */
public abstract class CondimentDecorator extends Beverage{	//抽象类，可以不用必须实现超类的任何方法

	
	public abstract String getDescription();				//所有的调料装饰者都必须重新实现getDescription()方法！！！

}
