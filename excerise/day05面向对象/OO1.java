//1、面向对象的三大特征：封装；继承；多态
//2、开发：找对象，建对象，用对象，维护对象间关系。
/* 找对象
人开门：名词提炼法。
人 
{
	开门()
	{
		门.开();
	}
}
门--门更了解‘开’的具体操作。
{
	开(){操作门轴}
}
*/

/* 
例：
需求：描述汽车  (描述事物其实就是描述事物的属性和行为)
理解：类就是图纸,根据图纸生产汽车；汽车就是对象
*/
class  Car   //该类只是用于描述，也不需要独立运行。所以不需要主函数
{
	//描述颜色---成员变量
	String color = "red";
	//轮胎数---成员变量
	int num = 4;
	//运行行为---成员方法
	void run()
	{
		System.out.println(color+".."+num);
	}
}

class CarDemo
{
	public static void main(String[] args)
	{
		//生产汽车。在java中通过new操作符来完成。
		//就是在堆内存中产生一个实体。
		//new Car() 产生一个汽车对象。
		Car c = new Car(); //命名：Car类型的变量c（类类型）。记住：类类型变量指向对象。
		//将已有车的颜色改成蓝色。即指挥对象做事情。java中格式为：对象.对象成员
		c.color = "blue";
		c.run(); //blue..4
		Car c1 = new Car();//栈中 新建c1 ; 堆中 新建Car对象 对象将地址传递给c1，即c1  引用该对象
		c1.run(); // red..4

		Car c2 = new Car(); //栈中 新建c1 ; 堆中 新建Car对象 对象将地址传递给c2，即c2 引用该对象
		c2.num = 5;
		Car c3 = c2; //是在栈中将c2的地址传递给c3，从而使c3也指向 new Car. 多个引用指向同一个对象
		c3.color = "green";
		c2.run();// green..4

        /*
		匿名对象
		*/
		//第一种使用方式
		new Car().num = 5;//匿名对象  等价于Car c4 = new Car(); c4.num = 5; 执行完没有被调用（地址指向），变成“垃圾”
		new Car().color= "blue";//执行完没有被调用（地址指向），变成“垃圾”
		new Car().run(); //red..4

		Car c4 = new Car();//非匿名对象
		c4.color = "yellow";//第一次调用
		c4.run();//yellow..4  第二次调用

		new Car().color= "yellow"; //匿名对象  第一次调用有效
		new Car().run();   //red..4            第二次调用无效
		//第二种使用方式
		//需求：汽车修配厂。对汽车进行改装，将来的车都改成黑色，三个轮胎。

		//Car q = new Car();
		//show(q); // black..3 该语句将会把栈中主函数的q变量的地址值赋给 栈中show函数的c,从而使show也指向 堆内存中的new Car();
	    show(new Car());// black..3 将匿名对象作为实际参数传递。 堆里边也会产生 new Car()对象（red/4）。并直接将地址赋给 show方法。从而使show 指向了此对象。
	}
		
	public static void show(Car c)
	{
		c.num = 3;
		c.color = "black";
		c.run();
	}
}