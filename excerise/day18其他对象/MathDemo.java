/*
����
*/
import java.util.*;
class MathDemo 
{
	public static void main(String[] args) 
	{

		for(int x=0;x<10;x++)
		{
			double dd = Math.random();//0��1�������
			int di = (int)(Math.random()*6+1);//����

			System.out.println("di="+di);
			 
			Random r = new Random();
			int hh = r.nextInt(10)+1;

			
			System.out.println("hh="+hh);
		}


		double d = Math.ceil(12.34);//���ش��ڵ��ڲ�������С��double ֵ��
		double d1 = Math.floor(12.34);//����С�ڵ��ڲ���������double ֵ��

		long l = Math.round(12.34);//��������

		double d2 = Math.pow(2,3);//2��3��  ��������

		System.out.println("d="+d);
		System.out.println("d1="+d1);
		System.out.println("l="+l);
		System.out.println("d2="+d2);
	}

}
