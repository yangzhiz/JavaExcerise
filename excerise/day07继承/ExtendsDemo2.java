/*
�Ӹ�����ֺ����Ա���ص㣺1������ 2������ 3�����캯��

1������  
   ����Ӹ����г��ַ�˽�е�ͬ����Ա����ʱ����this/super�����ַ��ʱ��໹�Ǹ���ĳ�Ա������this/superʹ�÷���һ�¡�
*/
class Father
{
	int num = 4;
}

class Son extends Father
{
	int num = 5;
	void show()
	{
		System.out.println(num);   // 5 num = this.num  ��ӡ��������á����������δ����num:��˴���ӡΪ4��superʡ��
		System.out.println(this.num); //5 ���������δ����num:���ӡΪ4����Ϊthisָ����new son����son ��ֻ��һ���̳���Father��num 
		System.out.println(super.num);// 4 ��ӡ����/��������ã�����superָ�����Ϊ new son���󣨶�̬����������ָ��������󣩣���Ϊ���ಢ�޶���
	}
}
class  ExtendsDemo2
{
	public static void main(String[] args) 
	{
		Son s = new Son();  //���� son ��class�ļ�����ʱ���ȼ���father ��class�ļ�
		s.show();
	}
}
