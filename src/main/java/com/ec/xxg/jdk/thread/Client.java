/**
 * Project Name:JDK_XXG
 * File Name:Client.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年8月3日下午3:33:30
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

/**
 * ClassName:Client <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月3日 下午3:33:30 <br/>
 * @author   xxg
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Client {
	
	 public static void main(String[] args) throws UnknownHostException, IOException {
	       final SyncLOCK ss = new SyncLOCK();
	       Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				  ss.get();  //获得锁
			}
		});
	       
	       Thread t2 = new Thread(new Runnable() {
				@Override
				public void run() {
					  ss.set();  //获得锁
				}
			});
	       
	       t.start();
	       t2.start();
	   
	}

}

