/**
 * Project Name:JDK_XXG
 * File Name:CoutDownLatchTest.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月7日下午8:31:28
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.concurrent.CountDownLatch;

/**
 * ClassName:CoutDownLatchTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月7日 下午8:31:28 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class CoutDownLatchTest {
	private static CountDownLatch c = new CountDownLatch(1);
	
	public static void main(String[] args) {
		  for(int i = 0 ; i <20 ; i++){
			  new Thread(new R()).start();
		  }
		  System.out.println("hello world");
		  c.countDown();
	}
   
	 static class  R implements Runnable{
		@Override
		public void run() {
			  try {
				c.await();
			} catch (InterruptedException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			 System.out.println("is running....");
		}
		 
	 }
}

