/*
final:���ա���Ϊһ�����η���
1�����������࣬�������α�����������
2����final���ε��಻���Ա��̳С�Ϊ�˱��ⱻ����̳У�����д���ܡ�
3����final���εķ��������Ա���д��
4����final���εĳ�����һ��������ֻ�ܸ�ֵһ�Ρ��ȿ������γ�Ա�������ֿ������ξֲ�������
   ������������ʱ��һЩ���ݵĳ��֣�ֵ�ǹ̶��ģ�Ϊ����ǿ�Ķ��ԣ�������Щֵ��һ�����֣��������Ķ���
   �����ֵ����Ҫ�ı䣬���Լ���final����Ϊ��������������д�淶������ĸ����д������ɶ��������ɣ�
   ���ʼ�ͨ��_���ӡ�
5���ڲ��ඨ�������еľֲ�λ����ʱ��ֻ�ܷ��ʸþֲ���final���εľֲ�������
*/


class Demo
{
	final int x =3;
	final double MY_PI = 3.14;
	void show()
	{
		final int y = 4;
		int y = 4; //error
		System.out.println(MY_PI);
	}
}
class SubDemo extends Demo
{	
}
class  FinalDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
