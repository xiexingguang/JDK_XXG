/**
 * Project Name:JDK_XXG
 * File Name:Client.java
 * Package Name:com.xxg.jdk.executor
 * Date:2015年8月7日下午4:16:38
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.xxg.jdk.executor;
/**
 * ClassName:Client <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月7日 下午4:16:38 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Client {
	
	 public static void main(String[] args) {
		  Source s = new Source();
		  Event t = s.delete(); //产生一个Event　事件
		  WatchManager.registWatcher(new DeleteWatcher());
		 
	}

}

