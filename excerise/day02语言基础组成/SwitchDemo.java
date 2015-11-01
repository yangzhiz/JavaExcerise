class SwitchDemo
{
	public static void main(String[] args)
	{
		int x = 3;
		switch(x)                                 
        {						  
         default: 
			 System.out.println("d");
	     case 4:
	         System.out.println("a");
	     case 6:
			 System.out.println("b");
		 case 2:
			 System.out.println("c");   
		     break;
        }   //最终输出结果为 d a b 先执行case，然后default，最后case，知道遇到break或者大括号。
	    /*
		 根据月份，输出季节
		*/
		int s = 4;
		switch(s)                                 
        {						  
	     case 3:
		 case 4:
		 case 5:
	         System.out.println(s+"春季");
		     break;
		 case 6:
		 case 7:
		 case 8:
	         System.out.println(s+"夏季");
		     break;
		 case 9:
		 case 10:
		 case 11:
	         System.out.println(s+"秋季");
		     break;
         case 12:
		 case 1:
		 case 2:
	         System.out.println(s+"冬季");
		     break;
	     default：
			 System.out.println("无效输入");
	}
}