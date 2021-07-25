package com.jizhong.pojo;

/**
 * 
 * 实现Runnable接口的方式创建线程
 * 	1. 实现Runnable接口
 * 	2. 重写run方法（线程调用后做什么？）
 * 	3. 创建Runnable接口实现类对象
 * 	4. 创建Thread类，构造方法中传递Runnable实现类对象
 * 	5. 执行线程run方法
 */
//1. 实现Runnable接口
public class MyThread implements Runnable{

	//门票
	private int ticket = 100;
	
	//2. 重写run方法（线程调用后做什么？）
	@Override
	public void run() {
		for(int i = 0;i < 100;i++){
			System.out.println(Thread.currentThread().getName() + i);
		}
	}

}
