/**
 * Project Name:JDK_XXG
 * File Name:DeadLockDemon.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月1日下午6:51:30
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;
/**
 * ClassName:DeadLockDemon <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月1日 下午6:51:30 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class DeadLockDemon {
	
	private static Object lockA = new Object();
	private static Object lockB = new Object();
	
	
	 public static void main(String[] args) throws InterruptedException {
		    new Thread(new Runnable() {
				@Override
				public void run() {
					f();
				}
			}).start();
	//	    Thread.sleep(4000);
		    new Thread(new Runnable() {
				@Override
				public void run() {
					k();
				}
			}).start();
		 
	}
	 
	 public static void f(){
		 System.out.println("进入f方法了");
		   synchronized (lockA) {
			   System.out.println("获得a的锁。。。");
			    synchronized (lockB) {
				   System.out.println("获得b的锁");	
				}
		}
	 }
	 
	 public static void k(){  
		 System.out.println("进入k的方法了");
		 synchronized (lockB) {
			   System.out.println("获得b的锁。。。");
			    synchronized (lockA) {
				   System.out.println("获得a的锁");	
				}
		}
	 }

}

