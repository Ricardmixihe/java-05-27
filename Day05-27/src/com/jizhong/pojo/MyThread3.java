package com.jizhong.pojo;
/**
 * 多线程卖车票案例（继承Thread类创建线程）
 * 		共享ticket火车票资源
 */
public class MyThread3 extends Thread{

	private static int ticket = 100;//火车票
	
	@Override
	public void run() {
		while(true){
			if (ticket > 0) {
				System.out.println(Thread.currentThread().getName() + "，"
						+ "正在卖第" + ticket + "门票");
				ticket--;
			}else{
				break;
			}
		}
	}

}
