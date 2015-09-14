/**
 * Project Name:JDK_XXG
 * File Name:InteruptDeomn.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月7日上午8:26:19
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;
/**
 * ClassName:InteruptDeomn <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月7日 上午8:26:19 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class InteruptDeomn {
	 
	  public static void main(String[] args) {
	  Thread   h =	     new  Thread(new Threada());
		       h.start();
		       h.interrupt();
		       
	}
	
	  static class Threada implements Runnable{
		@Override
		public void run() {
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
			     System.out.println("i was interrupted");
			     System.out.println(Thread.currentThread().isInterrupted());
				 System.out.println(Thread.currentThread().interrupted());
			}
			 System.out.println("run..........");
 		}
		  
	  }

}

