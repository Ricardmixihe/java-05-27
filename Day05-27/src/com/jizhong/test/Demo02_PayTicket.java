package com.jizhong.test;

import com.jizhong.pojo.MyThread2;
/**
 * 多线程卖车票案例（实现Runnable接口创建线程）
 * 		共享ticket火车票资源
 */
public class Demo02_PayTicket {
	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();
		//第一个窗口
		Thread t1 = new Thread(mt2);
		//第二个窗口
		Thread t2 = new Thread(mt2);
		//第三个窗口
		Thread t3 = new Thread(mt2);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
