/**
 * Project Name:JDK_XXG
 * File Name:Cache.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月8日下午4:50:48
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ClassName:Cache <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月8日 下午4:50:48 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */

//利用读写锁，维护一个cache..
public class Cache {
	
	 static Map<String, Object> map = new HashMap<String, Object>();
	 static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	 static Lock r = rwl.readLock();
	 static Lock w = rwl.writeLock();
	 
	 public static final Object get(String key){
		 r.lock();
		 try{
			  return map.get(key);
		 }finally{
			   r.unlock();
		 }
	 }
	 
	 public static final Object put(String key,Object value){
		 w.lock();
		 try{
			   return map.put(key, value);
		 }finally{
	     w.unlock();
		 }
	 }
  
	 public static final void clear(){
		 w.lock();
		 try{
			 map.clear();
		 }finally{
			 w.unlock();
		 }
	 }
}

