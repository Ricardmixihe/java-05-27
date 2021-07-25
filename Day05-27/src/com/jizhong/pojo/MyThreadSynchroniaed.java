package com.jizhong.pojo;

/**
 * 多窗口同时出售火车票，可能会遇到线程安全问题
 * 
 * 解决多线程安全问题方案：
 * 		1. 同步代码块：
 * 			格式：synchronized(锁){
 *					可能会出现线程安全问题代码;
 *			 	 }
 *		2. 同步方法：
 *			格式：synchronized void method(){
 *					可能会出现线程安全问题代码;
 *				 }
 */
public class MyThreadSynchroniaed implements Runnable{

	//火车票
	private int ticket = 100;
	
	@Override
	public void run() {
		
		while(true){
			/**
			*  同步代码块：
			*  	synchronized(锁){
			*		可能会出现线程安全问题代码
			*	}
			*/
			synchronized(this){
				if (ticket > 0) {
					try {
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
	
	
	//------------------------------------同步代码块与同步方法分隔符------------------------------------------------
	
	
	/**
	 * 同步方法:
	 * 		格式： synchronized 返回值类型 方法名称(){'
	 * 				可能会出现多线程安全问题代码;
	 * 			  }
	 */
//	@Override
//	public void run() {
//		while(true){
//			sellTicket();
//		}
//	}

//	public synchronized void sellTicket(){
//		if (ticket > 0) {
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName() + "，"
//					+ "正在卖第" + ticket + "门票");
//			ticket--;
//		}else{
//			return;
//		}
//	}
}
