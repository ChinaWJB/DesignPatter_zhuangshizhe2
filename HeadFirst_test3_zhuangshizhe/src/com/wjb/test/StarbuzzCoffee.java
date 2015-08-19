package com.wjb.test;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import com.wjb.beverages.*;
import com.wjb.bzsz.Beverage;
import com.wjb.bzsz.Size;
import com.wjb.condiment_zsz.*;

/**
 * 已经被clone到了eclipse
 * 测试代码
 * 切记！！！！
 * 多重修饰的时候，第二次以后的修饰者会冲掉之前修饰者对父类变量的赋值，两种方法;
 * （1）在修饰者中对，要调用的超类的方法重写
 * （2）将超类中被修饰者调用的方法设置成static类型
 * @author hp
 *
 */
public class StarbuzzCoffee {
	public static void main(String[] args) {
		
		/*#########设置double精度,方法1########*/
		
		NumberFormat nFormat = NumberFormat.getNumberInstance();
		nFormat.setMaximumFractionDigits(2);										//设置小数点后的位数
//		System.out.println(nFormat.format(d));
		
		/*#########设置double精度,方法2########*/
		
		DecimalFormat df = new DecimalFormat("###.00");
//		System.out.println(df.format(d));
		
		//一杯浓咖啡什么都不加
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		//一杯深焙咖啡加一份摩卡，一份奶泡，一份豆浆
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.VENTI);												//具体的饮料DarRoast对象的size被设置为VENTI，而beverage的size没有被设置
		beverage3 = new Mocha(beverage3);
		beverage3 = new Soy(beverage3);												//再次装饰的时候size为什么会被冲掉？？？？
		beverage3 = new Whip(beverage3);
		
		if(beverage3.getSize() == null){
			System.out.println("beverage3: please select size!!!");
		}else{
			System.out.println(beverage3.getDescription() + " $" + df.format(beverage3.cost()));
		}
		
		//一杯深焙咖啡加一份摩卡，一份奶泡，一份豆浆,   小杯
		Beverage beverage4 = new DarkRoast();
		beverage4.setSize(Size.TALL);

		beverage4 = new Soy(beverage4);
		beverage4 = new Whip(beverage4);
		beverage4 = new Mocha(beverage4);
		if(beverage4.getSize() == null){
			System.out.println("beverage4: please select size!!!");
		}else{
			System.out.println(beverage4.getDescription() + " $" +nFormat.format(beverage4.cost()));
		}					
	}
}
