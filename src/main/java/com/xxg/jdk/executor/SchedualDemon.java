/**
 * Project Name:JDK_XXG
 * File Name:SchedualDemon.java
 * Package Name:com.xxg.jdk.executor
 * Date:2015年9月6日下午1:51:24
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.xxg.jdk.executor;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ClassName:SchedualDemon <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月6日 下午1:51:24 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class SchedualDemon {
	
	 public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
	 /*   ExecutorService se = Executors.newFixedThreadPool(2);
	    ThreadPoolExecutor*/
	/*	service.scheduleWithFixedDelay(new Task(),
				2,
         4, TimeUnit.SECONDS);
		*/
		service.scheduleAtFixedRate(new Task(), 
				2, 
				4, 
				TimeUnit.SECONDS);
		
		service.scheduleAtFixedRate(new TaskB(), 
				2, 
				4, 
				TimeUnit.SECONDS);
		
	  }
	 
	  
	 public void kk(){
		 
	 }
	 
       static class Task implements Runnable{
		@Override
		public void run() {
			System.out.println(new Date().toLocaleString());
			System.out.println("i just is a tasker");
 		}
		 
	 }
       
       static class TaskB implements Runnable{

		@Override
		public void run() {
			  System.out.println("task b is running....");
		}
    	   
       }

}

