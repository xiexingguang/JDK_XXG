/**
 * Project Name:JDK_XXG
 * File Name:CallableAndFuture.java
 * Package Name:com.xxg.jdk.executor
 * Date:2015年8月7日上午10:39:36
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.xxg.jdk.executor;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ClassName:CallableAndFuture <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月7日 上午10:39:36 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class CallableAndFuture {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		Future<Integer> future = threadPool.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
			   Thread.sleep(10000);
			   return new Random().nextInt(100);
			}
		});
		
	    if(future.isDone())
			System.out.println(future.get());
			System.out.println("not get the date");
	}

}

