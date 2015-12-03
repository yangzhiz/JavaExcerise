/*
正则表达式：符合一定规则的表达式
	作用：用于专门操作字符串。
	特点：用一些特定的符号来表示一些代码操作。这样就简化书写。
		  学习正则表达式就是学习特殊符号的使用。
	好处：可以简化对字符串的复杂操作
	
	弊端：符号定义越多，正则越长，阅读性越差

具体应用：

1、匹配：String matches方法 //stringName.matches(regexName)
   用规则匹配整个字符串，只要有一处不符合，就匹配结束，返回false

2、切割：String split()方法

3、替换：String replaceAll(String reg, String replacement);

4、获取
*/


class RegexDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	/*需求：对QQ号进行校验
		条件：5~15  0不能开头，只能是数字
	
		传统的方式，使用了String类中的方法，进行组合完成了需求。代码过于复杂。
	*/
	public static void checkQQ()
	{
		String qq = "";
		int len = qq.length();

		if(len>=5 && len<=15)
		{
			if(!qq.startsWith("0"))
			{
				try
				{
					long l = Long.parseLong(qq);
					System.out.println("qq:"+1);
				}
				catch (NumberFormatException e)
				{
					System.out.println("出现非法字符");
				}
				
			}
			else
			{
				System.out.println("不能0开头")			
			}
		}
		else
		{
			System.out.println("长度不对");
		}
	}




	/*
	匹配
	手机号段只有 13。。。  15。。。  18。。。
	*/
}





















