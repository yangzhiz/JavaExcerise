class OperateDemo3
{
	public static void main(String[] args)
	{
		int x = 4;
		System.out.println(x>3&x<6);//true �߼������ ��������boolean���͵ı��ʽ��
		/*
		int a = 2;
		a>3 & a<6;   ������棬���Ϊ��
		a>3 && a<6;  ��Ϊ�٣��������� 
		*/

		System.out.println(3<<2);//12 ������λ��ĩβ����λ00
		System.out.println(6>>2);//1  ������λ���׶˲���λ00
		System.out.println(6 & 3);//2  ��ת��Ϊ�����ƣ�0��Ϊ�٣�1��Ϊ��
		System.out.println(6 | 5);//7  ��ת��Ϊ�����ƣ�0��Ϊ�٣�1��Ϊ��
		System.out.println(6 ^ 5);//������� 3  ��ת��Ϊ�����ƣ�0��Ϊ�٣�1��Ϊ��
		System.out.println(~6);   //ȡ����  -7 ��ת��Ϊ�����ƣ�Ȼ��ȡ�����õ�һ������������ת��Ϊʮ���ƣ��ȼ�һ����ȡ��������мǼ��ϸ���
		int m =2,n =6;
		System.out.println(m+","+n);
		System.out.println("m="+m+",n="+n);
		n=n^m;
		m=n^m;
		n=n^m;
		System.out.println("m="+m+",n="+n);

        /*
		ʵ�ֻ�ȡһ��������ʮ�����������˽��ơ�������ͬ��, 60Ϊ��
		*/
		 int a,b,num = 60;
         a = num & 15  ;    // 12
         int temp = 60 >> 4; 
         b = temp & 15 ;    // 3 
		 //System.out.println((char)(a-10+'A'));         //C
		 //System.out.println(b+(char)(a-10+'A'));       //70 ASCII: C-67   3+67=70 
		 System.out.println(b+""+(char)(a-10+'A'));    //3C
		 System.out.println(a>9?(char)(a-10+'A'):a);     //67 (char)(a-10+'A')ǿת��ɣ�������a��������������(C:a)   
		 System.out.println(b>9?(char)(b-10+'A'):b);     //3         
		 //System.out.println((b>9?(char)(b-10+'A'):b)+""+(a>9?((char)(a-10+'A')):a)); //367
		
		int yang = 26,age;
		 age = (yang>20)?System.out.println("oldman"):a; // �� ��Ԫ���������������������ӡ��䲢û��������
		}
}