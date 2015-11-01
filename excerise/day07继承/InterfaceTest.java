abstract class Student
{
	abstract void study();
	void sleep()
	{
		System.out.println("sleep")
	}
}

interface Smoking
{
	void smoke();
}

class Someone extends Student implements Smoking
{
	void study();
	public void smoke(){}
}
