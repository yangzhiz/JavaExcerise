/*
File��ĳ���������
1��������
	boolean createNewFile(); //��ָ��λ�ô����ļ���������ļ��Ѿ����ڣ��򲻴���������false��
							���������һ�������������һ�����ͻᴴ���ļ��������ļ��Ѿ����ڣ��Ḳ�ǡ�
	boolean mkdir();	//�����ļ��С�
	boolean mkdirs();	//�����༶�ļ���

2��ɾ����
	boolean delete();  //ɾ��ʧ�ܣ�����false
	deleteOnExit();   //�ڳ����˳�ʱ��ɾ��ָ���ļ���

3���жϡ�
	boolean canExecute();
	boolean exists();  //�ļ��Ƿ����

	isDirectory();
	isFile();		//���ж��ļ������Ƿ�Ϊ�ļ�����Ŀ¼ʱ������Ҫ���жϸ��ļ������װ�������Ƿ���ڡ����� exists();��
	
	isHidden();		//�Ƿ�Ϊ�����ļ�
	isAbsolute();	//�Ƿ�Ϊ����·��
4����ȡ��Ϣ��

	String getName();	//
	String getPath();	//���·��
	String getParent(); //�÷������ص��Ǿ���·���еĸ�Ŀ¼�������ȡ�������·��������null
						//������·��������һ��Ŀ¼����ô��Ŀ¼��Ϊ���ؽ����
	File   getParentFile();	//
	String getAbsolutePath();	//����·��

	long  lastModified(); //�����ļ����һ�α��޸ĵ�ʱ�䡣
	long  length();		//�����ļ���С





*/
class FileDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

	public static void consMethod()
	{
		Files f = new File("a.txt");
	}

	public static void method_1()
	{

	}
}
