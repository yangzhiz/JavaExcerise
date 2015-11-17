/*
stop方法已经过时。

如何停止线程？
只有一种：run方法结束。
开启多线程运行，运行代码通常是循环结构。
只要控制住循环，就可以让run方法结束，也就是线程结束。

特殊情况：
当线程处于了冻结状态，就不会读取到标记，线程就不会结束。

当没有指定的方式让冻结的线程恢复到运行状态时，需要对冻结进行清除。
interrupt();--用于清除线程的冻结状态，强制让线程恢复到运行状态中来。这样就可以操作标记让线程结束。

setDaemon(true); 设置为守护线程，在线程开启（start）前调用。
				 当正在运行的线程均为守护线程（用户线程/后台线程），Java虚拟机会退出。
				 前后台线程共享资源，抢占CPU使用权。但是当前台线程结束后，后台线程会自动结束。

join();
当A线程执行到了B线程的.join()方法时，A就会等待。等B线程都执行完，A才会执行。

join可以用来临时加入线程执行。

优先级：一（MIN_PRIORITY）到十（MAX_PRIORITY）。 默认（NORM_PRIORITY）为5。
使用Thread调用此方法。线程.setPriority(Thread.MAX_PRIORITY);

yield();
暂停当前正在执行的线程。 
*/

class StopThreadDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
