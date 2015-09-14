/**
 * Project Name:JDK_XXG
 * File Name:ConfigCallback.java
 * Package Name:com.xxg.jdk.executor
 * Date:2015年8月11日下午8:27:12
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.xxg.jdk.executor;

import java.util.Date;

/**
 * ClassName:ConfigCallback <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月11日 下午8:27:12 <br/>
 * @author   xxg
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ConfigCallback implements CallBack {
   
	
	public void execute(CallBack C) throws InterruptedException{
		System.out.println("正在准备数据中....");
		Thread.sleep(4000);
		Event e = new SourceEvent("xxg","wer",new Date());//准备大数据
		C.process(e);//回调函数
	}
	
	 public static void main(String[] args) {
	    System.out.println("<++++++++++业务逻辑操作上文+++++++++>");
	    final ConfigCallback c = new ConfigCallback();
	    new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					c.execute(c);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
				}
  			}
		}).start();;
		 System.out.println("<++++++++++业务逻辑操作下文+++++++++>");
	}
	
	@Override
	public void process(Event e) {
	   System.out.println("数据准备好了就用我的数据啦。。"+e.toString());
	   //执行下面的一些业务逻辑操作
	}

}

