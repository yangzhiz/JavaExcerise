class ArrayTest5
{
	public static void main(String[] args)
	{
		toBin(6);
		toHex(60);
	}
	/*
	十进制->二进制
	*/
	public static void toBin(int num)
	{
		StringBuffer sb = new StringBuffer();//一个装数据的容器，此处使用是为了调用其的反转功能。

		while(num>0)
		{
			//System.out.println(num%2);
			sb.append(num%2); //sb容器的添加(append)数据方法,将计算得到的值放入sb中
			num = num / 2;
		}
		 System.out.println(sb.reverse());//调用sb的反转功能。使存储的数据反向输出，即我们想要的二进制数
	}
	/*
	十六进制->二进制
	*/
	public static void toHex(int num)
	{
		StringBuffer sb = new StringBuffer();
		for (int x = 0;x<8 ;x++ )
		{
			int temp = num & 15;
			if(temp>9)			
				//System.out.println((char)(temp-10+'A'));	
				sb.append((char)(temp-10+'A'));	
			else
				//System.out.println(temp);
				sb.append(temp);
			num = num >>>4;
		}
		System.out.println(sb.reverse());
	}
}