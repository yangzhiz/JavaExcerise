
import java.util.*;
import java.text.*;

class CalendarDemo 
{
	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();

		sop(c);
		sop(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+c.get(Calendar.DAY_OF_MONTH)+"��");//�鷳

		/*
		���
		*/


	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
