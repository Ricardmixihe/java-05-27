package com.jizhong.test;

import com.jizhong.pojo.MyThread3;
/**
 * 多线程卖车票案例（继承Thread类创建线程）
 * 		共享ticket火车票资源
 */
public class Demo03_PayTicket {
	public static void main(String[] args) {
		MyThread3 mt1 = new MyThread3();
		MyThread3 mt2 = new MyThread3();
		MyThread3 mt3 = new MyThread3();
		mt1.start();//100张
		mt2.start();//100张
		mt3.start();//100张
		
	}
}
