/*
5、多态的应用
*/

/*
需求：数据库的操作
数据是：用户信息。

1、连接数据库  JDBC  Hibernate
2、操作数据库
   c create
   r read 
   u update
   d delete
3、关闭数据库连接。
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
		1、连接数据库
		2、使用SQL添加语句添加数据
		3、关闭连接。
	}
		public void delete(User User)
	{
		1、连接数据库
		2、使用SQL添加语句删除数据
		3、关闭连接。
	}
}

class UserInfoByHibernate implements UserInfoDao
{
	public void add(User User)
	{
		1、连接数据库
		2、使用SQL添加语句添加数据
		3、关闭连接。
	}
	public void delete(User User)
	{
		1、连接数据库
		2、使用SQL添加语句删除数据
		3、关闭连接。
	}
}



class DBOperate 
{
	public static void main(String[] args) 
	{
		//UserInfoByJDBC ui = new UserInfoByJDBC;
		//UserInfoByHibernate ui = new UserInfoByHibernate;
		UserInfoDao ui = new UserInfoByHibernate();//多态
		ui.add(user);
		ui.delete(user);
	}
}
