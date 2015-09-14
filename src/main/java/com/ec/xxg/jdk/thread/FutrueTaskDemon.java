/**
 * Project Name:JDK_XXG
 * File Name:FutrueTaskDemon.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月6日下午5:48:22
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * ClassName:FutrueTaskDemon <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月6日 下午5:48:22 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class FutrueTaskDemon {
	
	 
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 FutureTask<String> futureTask = new FutureTask<String>(new CallA());
		 ExecutorService service = Executors.newCachedThreadPool();
		 service.execute(futureTask);
		 System.out.println(futureTask.get());
		 System.out.println("waitin.....");
	}
   
	static class CallA implements Callable<String>{
		@Override
		public String call() throws Exception {
			 Thread.sleep(4000);
			 return "hello world!!";
		}
	}
}

