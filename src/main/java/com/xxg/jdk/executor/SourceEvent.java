/**
 * Project Name:JDK_XXG
 * File Name:SourceEvent.java
 * Package Name:com.xxg.jdk.executor
 * Date:2015年8月7日下午4:11:44
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.xxg.jdk.executor;

import java.util.Date;

/**
 * ClassName:SourceEvent <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月7日 下午4:11:44 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class SourceEvent implements Event{
	
	public String name;
	public String optime;
	public Date date;
	
	public SourceEvent(String name, String optime,Date date) {
		super();
		this.name = name;
		this.optime = optime;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOptime() {
		return optime;
	}
	public void setOptime(String optime) {
		this.optime = optime;
	}
	

}

