/**
 * Project Name:JDK_XXG
 * File Name:ConcurrentDataStruct.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月6日下午5:22:10
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName:ConcurrentDataStruct <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月6日 下午5:22:10 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ConcurrentDataStruct {
	
	 public static void main(String[] args) {
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		String s = map.putIfAbsent("xxg", "zst");
		String ss = map.putIfAbsent("xxg", "ll");
	//	System.out.println(ss==null);
		System.out.println("s"+s+"==="+ss);
		System.out.println(map.get("xxg"));
	}

}

