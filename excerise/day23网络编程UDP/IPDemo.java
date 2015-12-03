/*
����ͨ�ţ�
1���ҵ��Է�IP ��IPv4 : 255.255.255.0  IPv6 ������������ĸ��
2������Ҫ���͵��Է�ָ����Ӧ�ó����ϡ�Ϊ�˱�ʶ��ЩӦ�ó������Ը���Щ����Ӧ�ó��������ֽ��б�ʶ��Ϊ�˷���ƺ�������֣������˿ڡ���0~65535��
3������ͨ�Ź������ͨѶ�����ΪЭ�顣
   ������֯����ͨ��Э�� TCP/IP   UDP


-------------------------------------------------
IP: InetAddress

���ػػ���ַ��127.0.0.1    ��������localhost
--------------------------------------------------
�˿ں�

��Ч�˿ڣ�0~65535   ����0~1024ϵͳʹ�û����˿�
----------------------------------------------------
����Э�飺TCP UDP    ��Ҫ������

UDP
	1�������ݼ�Դ��Ŀ�ķ�װ�����ݰ��У�����Ҫ�������ӣ��ٶȿ�
	2��ÿ�����ݰ��Ĵ�С������64k��
	3�����������ӣ����ɿ�Э��

TCP
	1�����뽨�����ӣ��γɴ�������ͨ����Ч���Ե�
	2���������н��д�����������
	3��ͨ����������������ӣ��ǿɿ�Э�顣
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

		InetAddress ia = InetAddress.getByName("YangZhi");//���ַ���Ĭ��Ϊ����  
		System.out.println(ia.getHostName());//YangZhi
		System.out.println(ia.getHostAddress());//172.29.66.146

		InetAddress ia1 = InetAddress.getByName("172.29.66.146");//���ַ���Ĭ��Ϊ����  
		System.out.println(ia1.getHostName());//172.29.66.146 ��IP��ַδ�ܽ����ɹ�ʱ��Name����IP��ַ
		System.out.println(ia1.getHostAddress());//172.29.66.146

		InetAddress ia2 = InetAddress.getByName("www.baidu.com"); 
		System.out.println(ia2.getHostName());//www.baidu.com
		System.out.println(ia2.getHostAddress());//119.75.217.109

	}
}
