/*
编码：看懂---》看不懂

	字符串变成字节数组  String-->byte[];    str.getBytes(String charsetName);

解码：看不懂---》看懂

	字节数组变成字符串  byte[]-->String;    new String(byte[],String charsetName)
*/
import java.util.*;

class EncodeDemo 
{
	public static void main(String[] args) throws Exception
	{
		String s = "你好";

		byte[] b1 = s.getBytes("GBK");//s.getBytes()

		String s1 = new String(b1);

		System.out.println("s1="+s1);
		//System.out.println(Arrays.toString(b1));
	}
}
