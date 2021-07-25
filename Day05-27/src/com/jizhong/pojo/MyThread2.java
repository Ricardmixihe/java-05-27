package com.jizhong.pojo;

/**
 * 多线程卖车票案例（实现Runnable接口创建线程）
 * 		共享ticket火车票资源
 */
public class MyThread2 implements Runnable{

	//火车票
	private int ticket = 100;
	
	@Override
	public void run() {
		while(true){
			if (ticket > 0) {
				try {
					//线程休眠
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "，"
						+ "正在卖第" + ticket + "门票");
				ticket--;
			}else{
				break;
			}
		}
	}

}
