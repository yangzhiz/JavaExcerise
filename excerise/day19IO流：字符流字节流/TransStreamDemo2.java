
/*
1������
Դ������¼��
Ŀ�ģ�����̨

2��������Ѽ���¼������ݴ洢��һ���ļ��С�

Դ������
Ŀ�ģ��ļ�

3��������Ҫ��һ���ļ������ݴ�ӡ�ڿ���̨��

Դ���ļ�
Ŀ�ģ�����̨

�ܽ᣺�������Ļ�������

��ʹ��ľ����������кܶ࣬��֪��������һ����


������ȷ��

1����ȷԴ��Ŀ��
	Դ����������	InputStream \ Reader
	Ŀ�ģ��������  OutputStream \ Writer
2�������������Ƿ��Ǵ��ı���
	�ǣ��ַ���
	���ǣ��ֽ���
3������ϵ��ȷ������ȷҪʹ���Ǹ��������
	ͨ���豸���������֣�
	Դ�豸���ڴ棬Ӳ�̣�����
	Ŀ���豸���ڴ棬Ӳ�̣�����̨

��ƣ�

1����һ���ı��ļ������ݴ洢����һ���ļ��С��������ļ���

	Դ�� ��Ϊ��Դ������ʹ�ö�ȡ���� InputStream Reader
		 ���������ı��ļ�������ʹ��Reader

			��������ȷҪʹ�ø���ϵ���ĸ�����
			��ȷ�豸��Ӳ���ϵ��ļ�
			Reader��ϵ�п��Բ����ļ��Ķ�����FileReader

				�Ƿ���Ҫ���Ч�ʣ�����Reader��ϵ�еĻ�����

	FileReader fr = new FileReader("a.txt");

	BufferedReader bufr = new BufferedReader(fr);

	Ŀ�ģ�OutputStream Writer
			   ���������ı��ļ�������ʹ��Writer
			   �豸��Ӳ�̣�һ���ļ���
			   Writer��ϵ�п��Բ����ļ��Ķ�����FileWriter

				�Ƿ���Ҫ���Ч�ʣ�����Reader��ϵ�еĻ�����

	FileWriter fw = new FileWriter("b.txt");

	BufferedWriter bufr = new Bufferedwriter(fw);

��ϰ����һ��ͼƬ�ļ������ݴ洢����һ���ļ��С��������ļ���

2�����󣺽�����¼������ݱ��浽һ���ļ��С�
	Դ�� InputStream Reader
		�Ǵ��ı� Reader

		�豸�����̡���Ӧ�Ķ����� System.in
			  Ȼ��System.in ��Ӧ�����ֽ�����
			  Ϊ�˲������̵��ı����ݷ��㡣��Ҫת���ַ��������ַ����������ӷ���
			  ���Լ�Ȼ��ȷ��Reader���ͽ�System.inת��Reader
			  �õ���Reader��ϵ�е�ת������InputStreamReader

			  InputStreamReader isr = new InputStreamReader(System.in)

			  ��Ҫ���Ч����

			  BufferedReader bufr = new Bufferedreader(isr);

	Ŀ�ģ�OutputStream Writer
			�Ǵ��ı� Writer
		
		�豸��Ӳ�� һ���ļ�  FileWriter

		FileWriter fw = new FileWriter("c.txt");

		��Ҫ���Ч����
		BufferedWriter bufw = new BufferedWriter(fw);

***********************************************************************************
		��չ����Ҫ��¼������ݰ���ָ���ı����utf-8���������ݴ浽�ļ��С�

			
			Ŀ�ģ�OutputStream Writer
					�Ǵ��ı� Writer
				
				�豸��Ӳ�� һ���ļ�  FileWriter
				����FileWriterʹ�õ�Ĭ�ϱ����GBK

				���Ǵ洢ʱ��Ҫ����ָ���ı������ָ���ı������Ҫ�õ�ת����
				����Ҫ�õĶ�����OutputStreamWriter.
				���Ƕ���Ҫ����һ���ֽ�����������һ����Բ����ļ����ֽ������ FileOutputStream

				OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d.txt"),"UTF-8");

				��Ҫ��Чô��
				Bufferedwriter bufw = new BufferedWriter(osw);

				���ԣ���ס��ת����ʲôʱ��ʹ�á��ַ����ֽ�֮���������ͨ�����漰���ַ�����ת��ʱ����Ҫת������





*/

import java.io.*;
class TransStreamDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
