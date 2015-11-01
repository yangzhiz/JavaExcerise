class VarDemo1
{
	public static void main(String[] args)
	{
	//定义变量的格式；
	//数据类型 变量名 = 初始化值；
	//定义一个int 类型变量，取值为4；
          int x=4; 
          System.out.println(x);
              x=10;//x已经分配内存，可重用。
          System.out.println(x);
  	  
 	  byte b = 2;	  //-128~127
          //byte b1 = 128;  //可能损失精度，wrong

          //float f = 2.3;   //损失精度，小数（2.3）在java中默认为double类型
          float f = 2.3f;  //√

          char ch = '4';
          char ch1 = '+';
	      char ch2 = ' ';
	      char ch3 = 'a';
    
          boolean bo = true;  // true √ ture ×
          boolean bo1 = false;

          /*何时定义变量：当数据不确定的时候，需要对数据进行存储时，就定义一个变量来完成存储动作。*/
          
          int a = 5;
          a = a + 6;

          //类型的转换
          byte b2 = 3;
          //b2=b2+2;   // × b2为byte类型，占一个8位，而2为整型，占4个8位，不同数据类型不能相加。需要用到自动类型提升
          b2=(byte)(b2+2);//√ 强制转换
          System.out.println(b2); // 5

	  System.out.println('a'+1);//98 ASCII表中：	1 49 ...... A 65 ...... a 97 b 98
	  System.out.println((char)('a'+1));//b
	  System.out.println('1'+0);//49

	}
}