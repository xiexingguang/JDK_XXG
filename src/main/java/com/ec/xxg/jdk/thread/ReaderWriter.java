/**
 * Project Name:JDK_XXG
 * File Name:ReaderWriter.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月2日上午9:23:16
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;
/**
 * ClassName:ReaderWriter <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月2日 上午9:23:16 <br/>
 * @author   xxg
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ReaderWriter {
	
	private static int i = 0;
	private static  boolean flag = false;
	
    public static void write(){
    	  i = 1;                           //1
    	  flag = true;                  //2
    	  System.out.println(Thread.currentThread().getName());
    }
    
    public static void read(){
    	  if(flag){              //3
    		  int a = i * i;   //4
    	  }
    	  System.out.println(Thread.currentThread().getName());
    }
    
     public static void main(String[] args) {
		   new Thread(new Runnable() {
			@Override
			public void run() {
				write();
				
 			}
		}).start();
		   
		   System.out.println(Thread.currentThread().getName());
		   read();
	}
}

