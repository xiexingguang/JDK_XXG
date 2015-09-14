/**
 * Project Name:JDK_XXG
 * File Name:SyncLOCK.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月2日上午9:43:08
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;
/**
 * ClassName:SyncLOCK <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月2日 上午9:43:08 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class SyncLOCK {
	
	public synchronized void get(){
		System.out.println("获得锁");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println("Get 方法，线程为===》"+Thread.currentThread().getName());
		System.out.println("释放锁");
	}
   
	public synchronized void set(){
		System.out.println("获得锁");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println("set 方法，线程为===》"+Thread.currentThread().getName());
		System.out.println("释放锁");
	}
	
}

