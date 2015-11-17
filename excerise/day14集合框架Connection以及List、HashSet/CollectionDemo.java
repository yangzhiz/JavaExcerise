/*

集合框架：Connection。JDK1.2后增加。

1、add方法的c参数类型是Object。以便于接收任意类型对象。

2、集合中存储的都是对象的引用（地址）。

常见方法：

1、ArrayList
ArrayList al1 = new ArrayList();

al1.add("java01");//添加元素

al1.remove("java01");//删除元素

al1.clear();//清空集合

al1.contains("java01");//判断是否包含某一元素

al1.isEmpty();//判断集合是否为空

al1.size();//返回集合长度

al1.retainAll(al2);//取al1和al2的交集置于al1中

al1.removeAll(al2);//去除al1和al2的交集，剩下的置于al1中

2、Iterator接口

Iterator it =al1.iterator();//调用集合ArrayList的迭代器（取值方法）来取元素

it.hasNext();//如果仍有元素可以迭代，则返回 true。 
it.next();//返回迭代的下一个元素。  

什么是迭代器呢？其实就是集合的取出元素的方式。（夹子）

-----------------电玩城抓娃娃-------------------

把取出方式（夹子）定义在集合（容器）内部，
这样取出方式就可以直接访问集合内容的元素（娃娃）
那么取出方式就定义成了内部类。

而每一个容器/集合的数据结构（娃娃形状构造）不同
所以取出的动作细节也不一样。但是都有共性内容。
判断和取出。则将其共性抽取。

这些内部类的共性抽取形成一个规则，即Iterator。
通过一个对外提供的方法：iterator();来获取集合的取出对象。

这样就统一了集合的取出元素操作。












*/
class CollectionDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
