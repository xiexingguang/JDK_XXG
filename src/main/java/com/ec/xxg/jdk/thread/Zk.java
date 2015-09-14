/**
 * Project Name:JDK_XXG
 * File Name:Zk.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年8月7日下午5:36:26
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * ClassName:Zk <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月7日 下午5:36:26 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Zk {
	
	public static void main(String[] args) {
		 ExecutorService service = Executors.newCachedThreadPool();
	
	}
	
	static class ZD{
		public   void ta(){
			System.out.println("ta");
		}
	}

}

