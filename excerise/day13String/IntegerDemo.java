/*
基本数据类型对象包装类.

byte		Byte
short		Short
int			Integer
long		Long
boolean		Boolean
float		Float
double		Double
char		Character

基本数据类型对象包装类的最常见作用
就是用于基本数据类型和字符串类型之间做转换

基本数据类型--->字符串

    1、 基本数据类型+"" ;

	2、 基本数据类型包装类.toString(基本数据类型值); //Integer.toString(34);

字符串---->基本数据类型（静态调用方式）

	基本数据类型包装类.parse基本数据类型(字符串)；//Integer.parseInt("34"); 字符串必须传入数字格式的字符串。传a34会报错，除非指定数据为十六进制。
		特殊：Character并不需要此功能。


十进制转成其他进制：

   toBinaryString();
   toHexString();
   toOctalString();

其他进制转为十进制：

	Integer.parseInt(String s, int radix); //Integer.parseInt("110",2) 传入字符串以及当前字符串的进制表现形式。输出十进制。  




JDK1.5 版本新特性：

	Integer x = 4;//自动装箱 等同于 new Integer(4);  目的是简化书写
				  // Integer x = null;  √    int x = null;  x
	x = x + 2;    // x+2中的x表示对象。它首先进行自动拆箱（intValue()），变成int，然后和2相加                    最后再装箱赋给x。  

另外     Integer m = 128;
		 Integer n = 128;

		 Integer a = 127;
		 Integer b = 127;

		 System.out.println(m==n);//false

		 System.out.println(a==b);//true a,b指向同一个Integer对象127。

		 分析：当数值在byte范围内时（-128~127）。对于新特性，如果该数值已经存在，则不会开辟新的空间。
		       因此a,b指向了同一个127。 而m,n则不同。



*/








class IntegerDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
