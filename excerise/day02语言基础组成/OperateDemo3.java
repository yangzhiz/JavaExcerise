class OperateDemo3
{
	public static void main(String[] args)
	{
		int x = 4;
		System.out.println(x>3&x<6);//true 逻辑与算符 用于连接boolean类型的表达式。
		/*
		int a = 2;
		a>3 & a<6;   左假右真，结果为假
		a>3 && a<6;  左为假，不再运算 
		*/

		System.out.println(3<<2);//12 左移两位，末尾补两位00
		System.out.println(6>>2);//1  右移两位，首端补两位00
		System.out.println(6 & 3);//2  先转化为二进制，0视为假，1视为真
		System.out.println(6 | 5);//7  先转化为二进制，0视为假，1视为真
		System.out.println(6 ^ 5);//异或运算 3  先转化为二进制，0视为假，1视为真
		System.out.println(~6);   //取反码  -7 先转化为二进制，然后取反，得到一个负数。负数转化为十进制：先减一，再取反。最后切记加上负号
		int m =2,n =6;
		System.out.println(m+","+n);
		System.out.println("m="+m+",n="+n);
		n=n^m;
		m=n^m;
		n=n^m;
		System.out.println("m="+m+",n="+n);

        /*
		实现获取一个整数的十六进制数（八进制、二进制同理）, 60为例
		*/
		 int a,b,num = 60;
         a = num & 15  ;    // 12
         int temp = 60 >> 4; 
         b = temp & 15 ;    // 3 
		 //System.out.println((char)(a-10+'A'));         //C
		 //System.out.println(b+(char)(a-10+'A'));       //70 ASCII: C-67   3+67=70 
		 System.out.println(b+""+(char)(a-10+'A'));    //3C
		 System.out.println(a>9?(char)(a-10+'A'):a);     //67 (char)(a-10+'A')强转完成，但是与a做运算又提升了(C:a)   
		 System.out.println(b>9?(char)(b-10+'A'):b);     //3         
		 //System.out.println((b>9?(char)(b-10+'A'):b)+""+(a>9?((char)(a-10+'A')):a)); //367
		
		int yang = 26,age;
		 age = (yang>20)?System.out.println("oldman"):a; // × 三元运算符必须有运算结果，打印语句并没有运算结果
		}
}