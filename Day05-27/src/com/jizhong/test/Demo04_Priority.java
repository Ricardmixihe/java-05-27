package com.jizhong.test;

import com.jizhong.pojo.MyThread2;
/**
 * 线程优先级设置：
 *  有关优先级的方法有两个：
 *		final void setPriority(int newp) : 修改线程的当前优先级
 *		final int getPriority() : 返回线程的优先级
 *		优先级越高分配cpu资源次数越频繁
 *
 *	注意：
 *		优先级只能在1-10之间，超出范围会报非法参数异常
 *
 */
public class Demo04_Priority {
	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();
		//第一个窗口
		Thread t1 = new Thread(mt2);
		//第二个窗口
		Thread t2 = new Thread(mt2);
		//第三个窗口
		Thread t3 = new Thread(mt2);
		//设置优先级为9
		t3.setPriority(100);
		System.out.println("t1线程优先级：" + t1.getPriority());
		System.out.println("t2线程优先级：" + t2.getPriority());
		System.out.println("t3线程优先级：" + t3.getPriority());
		t1.start();
		t2.start();
		t3.start();
		
	}
}
