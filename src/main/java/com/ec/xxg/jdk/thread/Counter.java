/**
 * Project Name:JDK_XXG
 * File Name:Cas.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月1日下午8:59:17
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ClassName:Cas <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月1日 下午8:59:17 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Counter {
	
	private AtomicInteger atomicI = new AtomicInteger(0);
    private int i = 0;
    public static void main(String[] args) {
    	 
		 final Counter  cas  =new Counter();
		 List<Thread> ts = new ArrayList<Thread>(600);
		 long start = System.currentTimeMillis();
		 for(int j = 0; j < 100;j++){
			  Thread  t =  new Thread(new Runnable() {
				
				@Override
				public void run() {
				           for(int i = 0 ; i <10000 ; i++){
				        	   cas.count();
				        	   cas.safeCount();
				           }
				}
			});
			  ts.add(t);
		 }
		 
		 for(Thread t : ts){
			 t.start();
		 }
		 
		 for(Thread t : ts){
			  try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 System.out.println(cas.i);
		 System.out.println(cas.atomicI.get());
		 System.out.println(System.currentTimeMillis() - start);
	}
    

    	private void safeCount(){
    		 for(;;){
    			 int i = atomicI.get();
    			 boolean suc = atomicI.compareAndSet(i, ++i);
    			 if(suc){
    				 break;
    			 }
    		 }
    	}
    	
    	private void count(){
    		i++;
    	}
    
    
}

