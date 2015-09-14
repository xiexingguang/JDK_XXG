/**
 * Project Name:JDK_XXG
 * File Name:Source.java
 * Package Name:com.xxg.jdk.executor
 * Date:2015年8月7日下午4:04:36
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.xxg.jdk.executor;

import java.util.Date;



/**
 * ClassName:Source <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月7日 下午4:04:36 <br/>
 * @author   xxg
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Source {
	
	public  int sum = 100;
	
	/**
	 * 
	  source 类
	 */
	public Event delete(){
		Event event = new SourceEvent("source事件源","sum总数减1操作",new Date());
		sum--;
		return event;
	}
	public Event add(){
		Event event = new SourceEvent("source事件源","sum总数1操作",new Date());
		sum++;
		return event;
	}
	

}

