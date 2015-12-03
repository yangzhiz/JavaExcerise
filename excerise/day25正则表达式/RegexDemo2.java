/*
正则表达式的第四个功能。


4、获取
	将字符串中符合规则的子串取出。

操作步骤：
1、将正则表达式封装成对象。                 
2、让正则对象和要操作的字符串相关联
3、关联后，获取正则匹配引擎。
4、通过引擎对符合规则的子串进行操作。比如取出。

Pattern p = Pattern.compile(reg);

Matcher m = p.matcher(str);

m.find()

m.group()
*/

import java.util.regex.*;

class RegexDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
