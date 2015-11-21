
import java.util.*;
import java.text.*;

class CalendarDemo 
{
	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();

		sop(c);
		sop(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");//麻烦

		/*
		查表法
		*/


	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
