/*
���룺����---��������

	�ַ�������ֽ�����  String-->byte[];    str.getBytes(String charsetName);

���룺������---������

	�ֽ��������ַ���  byte[]-->String;    new String(byte[],String charsetName)
*/
import java.util.*;

class EncodeDemo 
{
	public static void main(String[] args) throws Exception
	{
		String s = "���";

		byte[] b1 = s.getBytes("GBK");//s.getBytes()

		String s1 = new String(b1);

		System.out.println("s1="+s1);
		//System.out.println(Arrays.toString(b1));
	}
}
