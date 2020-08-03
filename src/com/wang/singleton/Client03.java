package com.wang.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下五种单例模式的运行效率
 * 
 * @author wangQ
 *
 */
public class Client03 {

	public static void main(String[] args) throws Exception {

		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch cdl = new CountDownLatch(threadNum);
		for (int i = 0; i < threadNum; i++) {

			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 100000; i++) {
						Object o = SingletonDemo05.INSTANCE;
					}
					cdl.countDown();
				}
			}).start();

		}
		cdl.await();//等待其他线程运行完
		long end = System.currentTimeMillis();
		System.out.println("总耗时：" + (end - start));
	}
}
