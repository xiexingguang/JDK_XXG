/**
 * Project Name:JDK_XXG
 * File Name:TwinsLock.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月8日下午2:54:11
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * ClassName:TwinsLock <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月8日 下午2:54:11 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class TwinsLock implements Lock{
	
	private final Sync sync = new Sync(2);
	private static final class Sync extends AbstractQueuedSynchronizer{
		  /**
		 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
		 * @since JDK 1.7
		 */
		private static final long serialVersionUID = 1L;

		Sync(int count){
			    if(count  <= 0){
			    	  throw new IllegalArgumentException("count must larger than zero...");
			    }
			    setState(count);
		  }
		  
		  @Override
		  public int tryAcquireShared(int reduceCount){
			  for(;;){  //cas方式获取锁
				   int current = getState();
				   int newCount = current - reduceCount;
				   if(newCount < 0 || compareAndSetState(current, newCount)){
					    return newCount;
				   }
			  }//end for
		  }
		  
		  @Override
		  public boolean tryReleaseShared(int returnCount){
			  for(;;){
				    int current = getState();
				    int newCount = current + returnCount;
				    if(compareAndSetState(current, newCount)){
				    	return true;
				    }
			  }//end for
		  }
	}
	

	@Override
	public void lock() {
		 sync.acquireShared(1);
	}
	
	

	@Override
	public void lockInterruptibly() throws InterruptedException {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean tryLock() {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean tryLock(long time, TimeUnit unit)
			throws InterruptedException {
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void unlock() {
	  sync.releaseShared(1);
	}

	@Override
	public Condition newCondition() {
		
		// TODO Auto-generated method stub
		return null;
	}

}

