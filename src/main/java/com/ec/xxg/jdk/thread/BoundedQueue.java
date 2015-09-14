/**
 * Project Name:JDK_XXG
 * File Name:BoundedQueue.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月8日下午5:42:31
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName:BoundedQueue <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月8日 下午5:42:31 <br/>
 * @author   XXG
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class BoundedQueue<T> {
	
  private Object[] intems;
  
  private int addIndex,removeIndex,count;
  private Lock lock = new ReentrantLock();
  private Condition notEmpty = lock.newCondition();
  private Condition notFull = lock.newCondition();
	
  public BoundedQueue(int size){
	  intems = new Object[size];
  }
 
  public void add(T t){
	   lock.lock();
	      try{
	    	   while(count == intems.length)
	    	   {
	    		   
	    	   }
	    		    
	      }finally{
	    	  
	      }
  }

}

