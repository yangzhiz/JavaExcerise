/*
5����̬��Ӧ��
*/

/*
�������ݿ�Ĳ���
�����ǣ��û���Ϣ��

1���������ݿ�  JDBC  Hibernate
2���������ݿ�
   c create
   r read 
   u update
   d delete
3���ر����ݿ����ӡ�
*/

interface UserInfoDao
{
	public void add(User user);
	public void delete(User user);
}

class UserInfoByJDBC implements UserInfoDao
{
	public void add(User User)
	{
		1���������ݿ�
		2��ʹ��SQL�������������
		3���ر����ӡ�
	}
		public void delete(User User)
	{
		1���������ݿ�
		2��ʹ��SQL������ɾ������
		3���ر����ӡ�
	}
}

class UserInfoByHibernate implements UserInfoDao
{
	public void add(User User)
	{
		1���������ݿ�
		2��ʹ��SQL�������������
		3���ر����ӡ�
	}
	public void delete(User User)
	{
		1���������ݿ�
		2��ʹ��SQL������ɾ������
		3���ر����ӡ�
	}
}



class DBOperate 
{
	public static void main(String[] args) 
	{
		//UserInfoByJDBC ui = new UserInfoByJDBC;
		//UserInfoByHibernate ui = new UserInfoByHibernate;
		UserInfoDao ui = new UserInfoByHibernate();//��̬
		ui.add(user);
		ui.delete(user);
	}
}
