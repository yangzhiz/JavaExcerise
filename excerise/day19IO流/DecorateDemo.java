/*
装饰设计模式：
当想要对已有的对象进行功能增强时，可以定义类，将已有对象传入，基于已有的动能，并提供加强功能。
那么自定义的该类称为装饰类。

特点：
装饰类通常会通过构造方法接收被装饰的对象。
并基于被装饰的对象的功能，提供更强的功能。

MyTextReader
MyMediaReader

MyReader//专门用于读取数据的类。
	|--MyTextReader
		|--MyBufferTextReader
    |--MyMediaReader
		|--MyBufferMediaReader
	|--MyDataReader
		|--MyBufferDataReader  //继承的扩展性不好

class MyBufferReader
{
	MyBufferReader(MyTextReader text)
	{}
	MyBufferReader(MyMediaReader media)
	{}
}
上面这个类扩展性很差。
找到其参数的共同类型。通过多态的形式。可以提高扩展性

class MyBufferReader extends MyReader
{
	private MyReader r;
	MyBufferReader(MyReader r)//多态
	{}
}

装饰设计模式：功能提升并提高扩展性
MyReader//专门用于读取数据的类。
	|--MyTextReader
    |--MyMediaReader
	|--MyDataReader
	|--MyBufferReader

	装饰模式比继承要灵活。避免了继承体系臃肿。
	而且降低了类与类之间的关系。

注意：
装饰类因为增强已有对象，具备的功能和已有的是相同的，只不过提供了更强功能。
所以装饰类和被装饰类通常都属于一个体系中。
*/
class Person
{
	public void chifan()
	{
		System.out.println("吃饭");
	}
}

class SuperPerson
{
	private Person p;

	SuperPerson(Person p)
	{
		this.p = p;
	}

	public void superChifan()
	{
		System.out.println("开胃酒");
		p.chifan();
	}
}

class  DecorateDemo
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		//p.chifan();
		SuperPerson sp = new SuperPerson(p);
		sp.superChifan();
	}
}
