/*
������ʽ������һ������ı��ʽ
	���ã�����ר�Ų����ַ�����
	�ص㣺��һЩ�ض��ķ�������ʾһЩ��������������ͼ���д��
		  ѧϰ������ʽ����ѧϰ������ŵ�ʹ�á�
	�ô������Լ򻯶��ַ����ĸ��Ӳ���
	
	�׶ˣ����Ŷ���Խ�࣬����Խ�����Ķ���Խ��

����Ӧ�ã�

1��ƥ�䣺String matches���� //stringName.matches(regexName)
   �ù���ƥ�������ַ�����ֻҪ��һ�������ϣ���ƥ�����������false

2���иString split()����

3���滻��String replaceAll(String reg, String replacement);

4����ȡ
*/


class RegexDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	/*���󣺶�QQ�Ž���У��
		������5~15  0���ܿ�ͷ��ֻ��������
	
		��ͳ�ķ�ʽ��ʹ����String���еķ��������������������󡣴�����ڸ��ӡ�
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
					System.out.println("���ַǷ��ַ�");
				}
				
			}
			else
			{
				System.out.println("����0��ͷ")			
			}
		}
		else
		{
			System.out.println("���Ȳ���");
		}
	}




	/*
	ƥ��
	�ֻ��Ŷ�ֻ�� 13������  15������  18������
	*/
}





















