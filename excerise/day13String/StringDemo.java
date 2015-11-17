/*
String�������������ַ�������
��ô�����ṩ�˶���������ַ������в�����

�����Ĳ�����������Щ����Ҫ�ɶ�����á�

1����ȡ
	1.1 �ַ����а������ַ����������ַ�������
	   int length()   ��ȡ���ȡ�//ע��length�Ƿ������������ԡ�����Ҫ�����š�
	1.2 ����λ�û�ȡλ���ϵ�ĳ���ַ�
	   char charAt(int index)
	1.3 �����ַ���ȡ���ַ�����λ��
	   int indexof(int ch)  ����ch���ַ�-->�ַ���ASC�룩���ַ����е�һ�γ��ֵ�λ�á�ûӴ����-1
	   int indexof(int ch,int fromIndex)  ��fromIndexָ��λ�ÿ�ʼ����ȡch���ַ����г��ֵ�λ�á�

	   int indexof(String str)  ����str���ַ����е�һ�γ��ֵ�λ�ã�str���ַ��ĽǱ꣩
	   int indexof(String str,int fromIndex)  ��fromIndexָ��λ�ÿ�ʼ����ȡ str���ַ����г��ֵ�λ�á�

	   int lastIndexof()  ��������:���ҵ�˳���Ϊ�������󡣵��ǽǱ���Ȼ�Ǵ������ҡ�
2���ж�
	2.1 �ַ������Ƿ����ĳһ���Ӵ�
		boolean contains(str);
		����֮����indexOf(str):��������str��һ�γ���λ�ã��������-1����ʾ��str�����ڡ�
								����Ҳ��������ָ���ж��Ƿ�������ֿ����жϳ��ֵ�λ�á�
	2.2 �ַ������ӷ�������
	    boolean isEmpty();//ԭ���жϳ����Ƿ�Ϊ0
	2.3 �ַ����Ƿ���ָ�����ݿ�ͷ/��β
	    boolean startsWith(str);
		boolean endsWith(str);
	2.4 �ж��ַ��������Ƿ���ͬ
	    boolean equals(str);
	2.5 �ж������Ƿ���ͬ���Һ��Դ�Сд��
	    boolean equalsIgnoreCase();

3��ת��
	3.1 ���ַ�����ת���ַ���
	    ���캯���� String(char[])
				   String(char[],offset,count):���ַ������е�һ����ת���ַ�����offsetƫ���� count����Ԫ�ظ���
		
		��̬������ static String copyValueOf(char[])
				   static String copyValueOf(char[],offset,count)

				   static String valueOf(char[])

	3.2 ���ַ���ת���ַ�����
	    char[] toCharArray()

	3.3 ���ֽ�����ת���ַ���
        ���캯���� String(byte[])
				   String(byte[],offset,count):���ֽ������е�һ����ת���ַ�����offsetƫ���� count����Ԫ�ظ���

	3.4 ���ַ���ת���ֽ�����
        byte[] getBytes()
	3.5 ��������������ת�����ַ�����
		static String valueOf(int)    // 3+""  �ȼ���  String.valueOf(3);
		static String valueOf(double)


		���⣺�ַ����� �ַ�������ת�������У��ǿ���ָ�������ġ�

4���滻�ַ�/�ַ���
	String replace(oldchar,newchar);//���Ҫ�滻���ַ�/�ַ��������ڣ��򷵻ص���ԭ��

5���и�
	String[] split(regex);//��������Ϊ���顣

6���Ӵ�
	��ȡ�ַ����е�һ���֣�String substring(beginindex); //����β������Ǳ겻���ڣ����ֽǱ�Խ���쳣��
						  String substring(beginindex,endindex); //��ͷ����β��Ҫ��ȫ����ӡ��s.substring(0,s.length());

7��ת����ȥ���ո񡢱Ƚ�
	7.1 ���ַ���ת�ɴ�д����Сд
		 String toUpperCase();
		 String toLowerCase();
	7.2 ���ַ������˵Ķ���ո�ȥ����
	     String trim();
	7.3 �������ַ���������Ȼ˳��Ƚϡ�
		 int compareTo(string);
		 //��������ַ������ڴ��ַ������򷵻�ֵ 0��������ַ������ֵ�˳��С���ַ����������򷵻�һ��С�� 0 ��ֵ��λ���������������ַ������ֵ�˳������ַ����������򷵻�һ������ 0 ��ֵ��λ���������

*/







class StringDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "abc"; //s1��һ�������ͱ�������ABC�� ��һ������ "" Ҳ��һ������  �� null��ʾָ���
							//�ַ��������󣩵�����ص㣺һ������ʼ���Ͳ����Ա��ı䡣

	    String s2 = new String("abc");

	    /*
		s1��s2��ʲô����
		s1���ڴ�����һ������
		s2����������new Stringһ��   abc ��һ��
		*/

		System.out.println(s1==s2); //false   s2 ��ʾ�½��Ķ���
		System.out.println(s1.equals(s2));//true   String�ิд��Object�е�equals �������÷��������ж��ַ����Ƿ���ͬ��
		String s3 = "abc";
		System.out.println(s1==s3); //true     abc�Ѿ����ڣ��Ҳ��ᱻ�ı䡣  s1 s3ָ��ͬһ������
		System.out.println(3+"");
	}
}

