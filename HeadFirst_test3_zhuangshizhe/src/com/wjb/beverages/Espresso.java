package com.wjb.beverages;
import com.wjb.bzsz.Beverage;
import com.wjb.bzsz.Size;



/**
 * һ������,Ũ����
 * @author hp
 *
 */
public class Espresso extends Beverage{

	
	public Espresso(){
		description = "Espresso Coffee: ";
	}
	
	public double cost(){		//�ǳ����࣬����ʵ�ֳ���ĳ�����
		return 1.99;
	}
}
