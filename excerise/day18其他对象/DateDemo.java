
import java.util.*;
import java.text.*;


class DateDemo
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d);//Thu Nov 19 10:43:58 CST 2015

		//��ģʽ��װ��SimpleDateformat�����С�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��E hh:mm:ss");

		//����format������ģʽ��ʽ��ָ��Date����

		String time = sdf.format(d);
		System.out.println("time="+time);

	}
}
