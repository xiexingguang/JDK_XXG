/**
 * Project Name:JDK_XXG
 * File Name:SemaPhoreDemon.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月7日下午9:01:38
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * ClassName:SemaPhoreDemon <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月7日 下午9:01:38 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class SemaPhoreDemon {
	static Semaphore s = new Semaphore(5);
	static  Share share = new Share();
	public static void main(String[] args) {
		
	   for(int i = 0 ;  i <20 ; i++){
		   new Thread(new R(share)).start();
	   }
	   
	//   AbstractQueuedSynchronizer
		  
	}
	  
	
	static class Share {
		 public void f() throws InterruptedException{
			
			 System.out.println("hello world");
			 Thread.sleep(2000);
			
		 }
		
	}
	static class R implements Runnable{
    
		private static Share share;
		public R(Share share){
			this.share = share;
		}
		@Override
		public void run() {
			 try {
				 s.acquire();
				share.f();
				 s.release();
			} catch (InterruptedException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
	}
	
     
}

