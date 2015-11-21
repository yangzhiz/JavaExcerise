/*
面试
*/
import java.util.*;
class MathDemo 
{
	public static void main(String[] args) 
	{

		for(int x=0;x<10;x++)
		{
			double dd = Math.random();//0到1的随机数
			int di = (int)(Math.random()*6+1);//骰子

			System.out.println("di="+di);
			 
			Random r = new Random();
			int hh = r.nextInt(10)+1;

			
			System.out.println("hh="+hh);
		}


		double d = Math.ceil(12.34);//返回大于等于参数的最小的double 值。
		double d1 = Math.floor(12.34);//返回小于等于参数的最大的double 值。

		long l = Math.round(12.34);//四舍五入

		double d2 = Math.pow(2,3);//2的3次  幂数运算

		System.out.println("d="+d);
		System.out.println("d1="+d1);
		System.out.println("l="+l);
		System.out.println("d2="+d2);
	}

}
