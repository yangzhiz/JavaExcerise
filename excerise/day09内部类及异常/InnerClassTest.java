interface Inter
{
	void method();
}

class Test
{
	//������롣ͨ�������ڲ��ࡣ
	/*
	static class Inner implements Inter
	{
		public void method()
		{
			System.out.println("method run");
		}
	}
	*/

	static Inter function()
	{
		 return new Inter()
		{
			 public void method()
			{
				System.out.println("method run");
			}
		};//ע����
	}
}
class  InnerClassTest
{
	public static void main(String[] args) 
	{
		Test.function().method();//��ֱ�ӵ��÷�����˵��functionΪ��̬

		//Test.function(): Test������һ����̬�ķ���function;
		//.method():function������������Ľ����һ����������Inter���͵Ķ���
		//��Ϊֻ����Inter���͵Ķ��󣬲ſ��Ե���method������

	}
}
