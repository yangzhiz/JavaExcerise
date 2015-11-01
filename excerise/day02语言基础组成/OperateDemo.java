class OperateDemo
{
	public static void main(String[] args)
	{
		int x = 4270;
		x = x/1000 * 1000;
		System.out.println(x); // 4000  println中的ln表示换行，即下一条输出另起一行。
		System.out.println(1%-5); //取模（取余） 1
		System.out.println(-1%5); // -1   有负数的情况下，先提出负号进行运算，最后计算结果的正负与被模数（左边）一致
	
		int a=3,b;
		b = a++; // b = b + 4 × b必须初始化值才能进行进行计算。 此处为赋值。 不管是a++ 还是++a，最后a的值一定会变化。
		System.out.println(b); //3
		System.out.println(a); //4   
		System.out.println("yang"+"zhi"); //yangzhi 
		System.out.println("5+5="+5+5);   // 5+5=55 字符串数据与任何数据使用+ 都是相连接，最后均为字符串。
		System.out.println("5+5="+(5+5)); // 5+5=10
		System.out.println("a="+a+",b="+b);  //a=4,b=3
		/* 转义字符：通过\来转变后面字母或者符号的含义
		   \n ：换行
		*/
		System.out.println("hello\nworld"); //hello
		                                    //world
		//System.out.println(""hello"");      //× 并不会得到"hello" ""标识完整的字符串，hello为无效代码
		System.out.println("\"hello\"");    //转义符写在被转义的符号前面,从而使"变成了单纯的字符
        System.out.println("\\hello\\");    // \hello\
		//System.out.println("\hello\");      // × 非法转义符 转义h并没有意义
		//char ch = "\n";                       // 转义符并不代表字符，应该用单引号
		//System.out.println(ch); 
		char ch1 = '\n';					//转义位换行符 ，有效
		System.out.println(ch1);			//输出空行
		char ch2 = '\'';					//转义使中间的 ' 变成单纯的字符
		System.out.println(ch2);			// '
		char ch3 = '’';
		System.out.println(ch3);			// ‘
		char ch4 = '你';					//一个汉字为两个字节，
		System.out.println(ch4);			// 你
		}
}