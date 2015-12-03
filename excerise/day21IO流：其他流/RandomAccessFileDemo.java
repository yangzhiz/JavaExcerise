/*
RandomAccessFile  �����д����

���಻����IO��ϵ�е����࣬����ֱ�Ӽ̳���Object

������IO���еĳ�Ա����Ϊ���߱���д���ܡ�
�ڲ���װ��һ�����飬����ͨ��ָ��������Ԫ�ؽ��в�����
����ͨ��getFilePointer��ȡָ��λ�á�
ͬʱ����ͨ��seek�ı�ָ���λ�á�

��ʵ��ɶ�д��ԭ������ڲ���װ���ֽ����������������

ͨ�����캯�����Կ���������ֻ�ܲ����ļ���File
���Ҳ����ļ�����ģʽ:ֻ��r����д rw �ȡ�


���ģʽΪֻ�� r�� ���ᴴ���ļ�����ȥ��ȡ�Ѿ����ڵ��ļ���������ļ������ڣ��������쳣��
���ģʽΪ rw����������ļ������ڵĻ������Զ���������������򲻻Ḳ�ǡ�
*/

import java.io.*;
class RandomAccessFileDemo 
{
	public static void main(String[] args) 
	{
		writeFile();
		readFile();
		System.out.println(Integer.toBinaryString(258));
	}
	
	public static void readFile() throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("ran.txt","rw");

		//���������е�ָ��
		raf.seek(8*1);

		//����ָ�����ֽ�����ֻ����ǰ�����ܷ���
		raf.skipBytes(8);

		


		byte[] buf = new byte[4];

		raf.read(buf);

		String s = new String(buf);

		int age = raf.readInt();

		System.out.ptintln("age="+age);

		raf.close();
	}

	public static void writeFile() throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("ran.txt","rw");

		raf.write("����".getBytes());
		raf.writeInt(258);
		raf.write("����".getBytes());
		raf.writeInt(97);

		raf.close();
	}

	public static void writeFile2() throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("ran.txt","rw");
		
		raf.seek(8*3);
		raf.write("����".getBytes());
		raf.writeInt(103);

		raf.close();
	
	}
}





















