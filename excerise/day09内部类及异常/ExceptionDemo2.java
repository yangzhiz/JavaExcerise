/*
�Զ��쳣�Ĵ���

1�������쳣ʱ������������Ϊ������쳣����������Ŀ��Ը����塣
2���Է����������쳣���Ͷ�Ӧ�м���catch�顣��Ҫ��������catch�顣
   ������catch���е��쳣���ּ̳й�ϵ�������쳣catch���������档

������catch����ʱ��catch��һ��Ҫ������崦��ʽ��
��Ҫ�򵥶���һ�� e.printStackTrace();
Ҳ��Ҫ�򵥵ľ���дһ�������䡣
*/
class Demo
{
	int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException //����������Ϊ������쳣����������Ŀ��Ը�����
	{
		int[] arr = new int[a];
		System.out.println(arr[4]);
		return a/b;
	}
}
class ExceptionDemo2
{
	public static void main(String[] args) //throws Exception
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(5,0);
		    System.out.println("x="+x);
		}

		catch (ArithmeticException e)
		{
			System.out.println(e.toString());
			System.out.println("�������");
			System.out.println("�ǲ���ɵ");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			System.out.println("�Ǳ�Խ����");
			System.out.println("�ǲ���ɵ");
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	} 
}
