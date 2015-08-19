package com.wjb.condiment_zsz;
import com.wjb.bzsz.Beverage;
import com.wjb.bzsz.CondimentDecorator;
import com.wjb.bzsz.Size;

/**
 * 一种调料，Mocha
 * @author hp
 *
 */
public class Mocha extends CondimentDecorator{
	Beverage beverage;
	String name;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	public Size getSize(){							//各种调料必须重载getSize()方法，因为传进来的beverage可能是另外一种材料，
		return beverage.getSize();					//若不重载，cost中的beverage.getSize()调用的是Beverage的方法，
	}												//而父类方法中的size没有值。
	
	public String getDescription(){
		String s1;  
		s1 = beverage.getClass().getName();
        String[] s2 = s1.split("\\.");				//getclass().getname()得到的是连包的名字，需要分离
        String name = s2[s2.length-1];
//        System.out.println(name);
        
		if(name.equals("DarkRoast") || name.equals("Espresso") || name.equals("HouseBlend")){    //字符串的相等必须用equals			
			
			switch (beverage.getSize()){
			case TALL :
				return "A Tall " + beverage.getDescription() + "Mocha ,";
			case GRANDE :
				return "A Grande " + beverage.getDescription() + "Mocha ,";
			case VENTI :
				return "A Venti " + beverage.getDescription() + "Mocha ,";
			default:
				return "Mocha: please select size!!!";
			
			}
		}else{
			return beverage.getDescription() + "Mocha ,";
		}				
	}
	

	
	public double cost(){
		double cost = beverage.cost();
		if(beverage.getSize() == Size.TALL){
			cost += 0.1;
		} else if(beverage.getSize() == Size.GRANDE){
			cost += 0.15;
		} else if(beverage.getSize() == Size.VENTI){
			cost += 0.2;
		} else {
			System.out.println("Mocha: please select size!!!");
		}
		return cost;
	}
}
