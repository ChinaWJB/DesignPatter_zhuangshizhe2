package com.wjb.beverages;
import com.wjb.bzsz.Beverage;
import com.wjb.bzsz.Size;



/**
 * һ�����ϣ���ͥ��Ͽ���(�ۺϿ���)
 * @author hp
 *
 */
public class HouseBlend extends Beverage{

	
	public HouseBlend(){
		description = "HouseBlend Coffee: ";
	}

	public double cost(){		//�ǳ����࣬����ʵ�ֳ���ĳ�����
		return 0.99;
	}
}
