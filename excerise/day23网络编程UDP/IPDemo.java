/*
网络通信：
1、找到对方IP （IPv4 : 255.255.255.0  IPv6 ：包含数字字母）
2、数据要发送到对方指定的应用程序上。为了标识这些应用程序，所以给这些网络应用程序都用数字进行标识。为了方便称呼这个数字，叫做端口。（0~65535）
3、定义通信规则。这个通讯规则称为协议。
   国际组织定义通用协议 TCP/IP   UDP


-------------------------------------------------
IP: InetAddress

本地回环地址：127.0.0.1    主机名：localhost
--------------------------------------------------
端口号

有效端口：0~65535   其中0~1024系统使用或保留端口
----------------------------------------------------
传输协议：TCP UDP    重要！！！

UDP
	1、将数据及源和目的封装成数据包中，不需要建立连接，速度快
	2、每个数据包的大小限制在64k内
	3、面向无连接，不可靠协议

TCP
	1、必须建立连接，形成传输数据通道，效率稍低
	2、在连接中进行大数据量传输
	3、通过三次握手完成连接，是可靠协议。
*/

import java.net.*;
class IPDemo 
{
	public static void main(String[] args) throws Exception
	{
		InetAddress i = InetAddress.getLocalHost();
		System.out.println(i.toString());//YangZhi/172.29.66.146
		System.out.println(i.getHostName());//YangZhi
		System.out.println(i.getHostAddress());//172.29.66.146

		InetAddress ia = InetAddress.getByName("YangZhi");//空字符串默认为本机  
		System.out.println(ia.getHostName());//YangZhi
		System.out.println(ia.getHostAddress());//172.29.66.146

		InetAddress ia1 = InetAddress.getByName("172.29.66.146");//空字符串默认为本机  
		System.out.println(ia1.getHostName());//172.29.66.146 当IP地址未能解析成功时，Name还是IP地址
		System.out.println(ia1.getHostAddress());//172.29.66.146

		InetAddress ia2 = InetAddress.getByName("www.baidu.com"); 
		System.out.println(ia2.getHostName());//www.baidu.com
		System.out.println(ia2.getHostAddress());//119.75.217.109

	}
}
