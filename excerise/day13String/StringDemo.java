/*
String类适用于描述字符串事物
那么它就提供了多个方法对字符串进行操作。

常见的操作方法有哪些？需要由对象调用。

1、获取
	1.1 字符串中包含的字符个数，即字符串长度
	   int length()   获取长度。//注意length是方法，而非属性。所以要加括号。
	1.2 根据位置获取位置上的某个字符
	   char charAt(int index)
	1.3 根据字符获取该字符所在位置
	   int indexof(int ch)  返回ch（字符-->字符的ASC码）在字符串中第一次出现的位置。没哟返回-1
	   int indexof(int ch,int fromIndex)  从fromIndex指定位置开始，获取ch在字符串中出现的位置。

	   int indexof(String str)  返回str在字符串中第一次出现的位置（str首字符的角标）
	   int indexof(String str,int fromIndex)  从fromIndex指定位置开始，获取 str在字符串中出现的位置。

	   int lastIndexof()  反向索引:查找的顺序变为从右往左。但是角标依然是从左往右。
2、判断
	2.1 字符串中是否包含某一个子串
		boolean contains(str);
		特殊之处：indexOf(str):可以索引str第一次出现位置，如果返回-1，表示该str不存在。
								所以也可以用于指定判断是否包含。又可以判断出现的位置。
	2.2 字符串中子否有内容
	    boolean isEmpty();//原理即判断长度是否为0
	2.3 字符串是否以指定内容开头/结尾
	    boolean startsWith(str);
		boolean endsWith(str);
	2.4 判断字符串内容是否相同
	    boolean equals(str);
	2.5 判断内容是否相同并且忽略大小写。
	    boolean equalsIgnoreCase();

3、转换
	3.1 将字符数组转成字符串
	    构造函数： String(char[])
				   String(char[],offset,count):将字符数组中的一部分转成字符串。offset偏移量 count数组元素个数
		
		静态方法： static String copyValueOf(char[])
				   static String copyValueOf(char[],offset,count)

				   static String valueOf(char[])

	3.2 将字符串转成字符数组
	    char[] toCharArray()

	3.3 将字节数组转成字符串
        构造函数： String(byte[])
				   String(byte[],offset,count):将字节数组中的一部分转成字符串。offset偏移量 count数组元素个数

	3.4 将字符串转成字节数组
        byte[] getBytes()
	3.5 将基本数据类型转换成字符串。
		static String valueOf(int)    // 3+""  等价于  String.valueOf(3);
		static String valueOf(double)


		特殊：字符串和 字符数组在转换过程中，是可以指定编码表的。

4、替换字符/字符串
	String replace(oldchar,newchar);//如果要替换的字符/字符串不存在，则返回的是原串

5、切割
	String[] split(regex);//返回类型为数组。

6、子串
	获取字符串中的一部分：String substring(beginindex); //到结尾。如果角标不存在，出现角标越界异常。
						  String substring(beginindex,endindex); //包头不包尾。要想全部打印：s.substring(0,s.length());

7、转换、去除空格、比较
	7.1 将字符串转成大写或者小写
		 String toUpperCase();
		 String toLowerCase();
	7.2 将字符串两端的多个空格去除。
	     String trim();
	7.3 对两个字符串进行自然顺序比较。
		 int compareTo(string);
		 //如果参数字符串等于此字符串，则返回值 0；如果此字符串按字典顺序小于字符串参数，则返回一个小于 0 的值（位置相减）；如果此字符串按字典顺序大于字符串参数，则返回一个大于 0 的值（位置相减）。

*/







class StringDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "abc"; //s1是一个类类型变量，“ABC” 是一个对象。 "" 也是一个对象  而 null表示指向空
							//字符串（对象）的最大特点：一旦被初始化就不可以被改变。

	    String s2 = new String("abc");

	    /*
		s1和s2有什么区别？
		s1在内存中有一个对象
		s2有两个对象。new String一个   abc 是一个
		*/

		System.out.println(s1==s2); //false   s2 表示新建的对象。
		System.out.println(s1.equals(s2));//true   String类复写了Object中的equals 方法，该方法用于判断字符串是否相同。
		String s3 = "abc";
		System.out.println(s1==s3); //true     abc已经存在，且不会被改变。  s1 s3指向同一个对象。
		System.out.println(3+"");
	}
}

