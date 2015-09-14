/**
 * Project Name:JDK_XXG
 * File Name:FairAndUnfairTest.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月8日下午4:14:17
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:FairAndUnfairTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月8日 下午4:14:17 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class FairAndUnfairTest {
	
	//  private static Lock fairLock = new 
	

	private static class ReentrantLock2 extends ReentrantLock{
		  public ReentrantLock2( boolean fair){
			   super(fair);
		  }
		  @Override
		  public Collection<Thread> getQueuedThreads(){
			  List<Thread> arrayList = new ArrayList<Thread>(super.getQueuedThreads());
			  Collections.reverse(arrayList);
			  return arrayList;
		  }
	}
	
	private static class Job extends Thread{
		 private Lock lock;
		 public Job(Lock lock){
			 this.lock = lock;
		 }
		 public void run(){
			 ReentrantLock2 ll = (ReentrantLock2)lock;
			 ll.lock();
			 List<Thread> threads = (List<Thread>) ll.getQueuedThreads();
			 System.out.println("locked BY==="+Thread.currentThread().getName());
			 System.out.println("waiting by"+threads);
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			 ll.unlock();
		 }
	}
	
   private static Lock fairLock = new ReentrantLock2(true);
   private static Lock unfairLock = new ReentrantLock2(false);
 	
   public static void main(String[] args) {
	    for(int i = 0 ; i<10 ; i++){
	    	Job j = new Job(fairLock);
	    	j.start();
	    }
}
}

