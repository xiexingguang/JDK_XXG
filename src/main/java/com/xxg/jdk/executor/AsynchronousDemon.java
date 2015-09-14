/**
 * Project Name:JDK_XXG
 * File Name:AsynchronousDemon.java
 * Package Name:com.xxg.jdk.executor
 * Date:2015年8月7日下午1:45:00
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.xxg.jdk.executor;
/**
 * ClassName:AsynchronousDemon <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月7日 下午1:45:00 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class AsynchronousDemon {
	
	  boolean _isSuccess = false;
	  
	  public void executeWastTimeMethod(final AsynchronousDemon f){
		  System.out.println("开始排队去买饭了。。。。。。。。。。。");
		  new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
				}
				f._isSuccess = true;
				f.executeMethodB(); //他去通知你。。
			}
		}).start();; 
		 System.out.println(",轮到我点单了：已经点好单了给服务员了，我干其他事情去了，有饭了就通知爸爸一下，爸爸来拿。。。。 (*^__^*) 嘻嘻……，doing somethind........"); //异步
	  }
	
	  
	  public void executeMethodB(){
		  if(_isSuccess){
			  System.out.println("服务员：爸爸，饭 好了吃饭呀。。。\n Me: 好的，于是放下手中的活去吃饭了。。。。");
		  }else{
			  System.out.println("Me:没到饭吃的时候，继续在看小说，做自己喜欢的事。。。。。。。。");
		  }
		  
	  }
	  public static void main(String[] args) {
		  AsynchronousDemon s =  new AsynchronousDemon();
		  s.executeWastTimeMethod(s);
		  s.executeMethodB();
	}

}

