package com.jizhong.test;

import com.jizhong.pojo.MyThreadSynchroniaed;
/**
 * 使用同步代码块后的测试卖火车票
 */
public class Demo05_PayTicketErorr {
	public static void main(String[] args) {
		MyThreadSynchroniaed mt2 = new MyThreadSynchroniaed();
		//第一个窗口
		Thread t1 = new Thread(mt2,"线程1");
		//第二个窗口
		Thread t2 = new Thread(mt2,"线程2");
		//第三个窗口
		Thread t3 = new Thread(mt2,"线程3");
		t1.start();
		t2.start();
		t3.start();
	}
}
