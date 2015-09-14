/**
 * Project Name:JDK_XXG
 * File Name:SemaphoreTest.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月7日下午8:11:59
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * ClassName:SemaphoreTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月7日 下午8:11:59 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class SemaphoreTest {
	  
	 private static final int THREAD_COUNT = 30;
	 private static ExecutorService  threadPool = Executors.newFixedThreadPool(THREAD_COUNT);
	 
	 
	 private static Semaphore S = new Semaphore(10);
	 
	 public static void main(String[] args) {
		 for(int i = 0; i < THREAD_COUNT ; i++){
			 threadPool.execute(new Runnable() {
				@Override
				public void run() {
					try {
						S.acquire();
						System.out.println(Thread.currentThread().getName()+"===save data");
					//	S.release();
					} catch (InterruptedException e) {
						
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
				}
			});
		 }
		 threadPool.shutdown();
	}
	

}

