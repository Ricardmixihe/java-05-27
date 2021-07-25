package com.jizhong.test;

import com.jizhong.pojo.MyThread;

/**
 * 实现Runnable接口创建多线程
 *
 */
public class Demo01_Runnable {
	public static void main(String[] args) {
		//3. 创建Runnable接口实现类对象
		MyThread mt = new MyThread();
		//4. 创建Thread类，构造方法中传递Runnable实现类对象
		Thread t = new Thread(mt);
		//5. 执行线程run方法
		//创建一个新的线程，并且执行线程中run方法
		t.start();
		for(int i = 0;i < 100;i++){
			System.out.println(Thread.currentThread().getName() + i);
		}
		
		
		
		
	}
}
