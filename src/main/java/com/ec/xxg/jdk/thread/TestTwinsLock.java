/**
 * Project Name:JDK_XXG
 * File Name:TestTwinsLock.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月8日下午3:23:27
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.concurrent.locks.Lock;

/**
 * ClassName:TestTwinsLock <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月8日 下午3:23:27 <br/>
 * @author   xxg
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class TestTwinsLock {
      private static  Lock twinsLock = new TwinsLock();
	  static class Worker extends Thread{
		   public void run(){
			    while(true){
		                twinsLock.lock();
			    	 try {
						Thread.sleep(1000);
						System.out.println(Thread.currentThread().getName());
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}finally{
						twinsLock.unlock();
					}
			    }
		   }
	  }
	  
	  public static void main(String[] args) throws InterruptedException {
		   for(int i  = 0; i < 10 ; i++){
			   Worker w = new Worker();
			   w.setDaemon(true);
			   w.start();
		   }     
		   //main线程已结束了
		   for(int i = 0 ; i <10 ; i++){
			   Thread.sleep(1000);
			   System.out.println();
		   }
	}
}

