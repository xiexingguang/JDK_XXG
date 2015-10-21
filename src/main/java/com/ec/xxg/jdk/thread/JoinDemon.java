/**
 * Project Name:JDK_XXG
 * File Name:JoinDemon.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月1日下午9:02:14
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

/**
 * ClassName:JoinDemon <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月1日 下午9:02:14 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class JoinDemon {
	
	  static class  ThreadA extends Thread{
		   
		  @Override
		  public void run(){
			  for(int i = 0; i  < 100;i++){
				  System.out.println(Thread.currentThread().getName()+"======运行中。。。");
			  }
		  }
	  }
     
	  static class  ThreadB extends Thread{
		   
		  @Override
		  public void run(){
			  for(int i = 0; i  < 100;i++){
				  System.out.println(Thread.currentThread().getName()+"======运行中。。。heihei");
			  }
		  }
	  }
	  
	  
	  public static void main(String[] args) throws InterruptedException {
		   ThreadA a = new ThreadA();
		   a.start();
		   a.join();  //该方法是让主线程阻塞，让a线程执行完成
		   ThreadB b = new ThreadB();
		   b.start();
	}
	  
}

