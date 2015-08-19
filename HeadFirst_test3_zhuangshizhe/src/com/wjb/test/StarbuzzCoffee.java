package com.wjb.test;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import com.wjb.beverages.*;
import com.wjb.bzsz.Beverage;
import com.wjb.bzsz.Size;
import com.wjb.condiment_zsz.*;

/**
 * �Ѿ���clone����eclipse
 * ���Դ���
 * �мǣ�������
 * �������ε�ʱ�򣬵ڶ����Ժ�������߻���֮ǰ�����߶Ը�������ĸ�ֵ�����ַ���;
 * ��1�����������жԣ�Ҫ���õĳ���ķ�����д
 * ��2���������б������ߵ��õķ������ó�static����
 * @author hp
 *
 */
public class StarbuzzCoffee {
	public static void main(String[] args) {
		
		/*#########����double����,����1########*/
		
		NumberFormat nFormat = NumberFormat.getNumberInstance();
		nFormat.setMaximumFractionDigits(2);										//����С������λ��
//		System.out.println(nFormat.format(d));
		
		/*#########����double����,����2########*/
		
		DecimalFormat df = new DecimalFormat("###.00");
//		System.out.println(df.format(d));
		
		//һ��Ũ����ʲô������
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		//һ������ȼ�һ��Ħ����һ�����ݣ�һ�ݶ���
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.VENTI);												//���������DarRoast�����size������ΪVENTI����beverage��sizeû�б�����
		beverage3 = new Mocha(beverage3);
		beverage3 = new Soy(beverage3);												//�ٴ�װ�ε�ʱ��sizeΪʲô�ᱻ�����������
		beverage3 = new Whip(beverage3);
		
		if(beverage3.getSize() == null){
			System.out.println("beverage3: please select size!!!");
		}else{
			System.out.println(beverage3.getDescription() + " $" + df.format(beverage3.cost()));
		}
		
		//һ������ȼ�һ��Ħ����һ�����ݣ�һ�ݶ���,   С��
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
