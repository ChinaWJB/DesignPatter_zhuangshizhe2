package com.wjb.condiment_zsz;
import com.wjb.bzsz.Beverage;
import com.wjb.bzsz.CondimentDecorator;
import com.wjb.bzsz.Size;

/**
 * һ�ֵ��ϣ�Whip����
 * @author hp
 *
 */
public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	public Size getSize(){							//���ֵ��ϱ�������getSize()��������Ϊ��������beverage����������һ�ֲ��ϣ�
		return beverage.getSize();					//�������أ�cost�е�beverage.getSize()���õ���Beverage�ķ�����
	}												//�����෽���е�sizeû��ֵ��
	
	public String getDescription(){
		String s1;  
		s1 = beverage.getClass().getName();
        String[] s2 = s1.split("\\.");				//getclass().getname()�õ��������������֣���Ҫ����
        String name = s2[s2.length-1];
//        System.out.println(name);
        
		if(name.equals("DarkRoast") || name.equals("Espresso") || name.equals("HouseBlend")){	//�ַ�������ȱ�����equals			
			
			switch (beverage.getSize()){
			case TALL :
				return "A Tall " + beverage.getDescription() + "Whip ,";
			case GRANDE :
				return "A Grande " + beverage.getDescription() + "Whip ,";
			case VENTI :
				return "A Venti " + beverage.getDescription() + "Whip ,";
			default:
				return "Whip: please select size!!!";
			
			}
		}else{
			return beverage.getDescription() + "Whip ,";
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
			System.out.println("Whip: please select size!!!");
		}
		return cost;
	}
}
