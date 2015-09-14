/**
 * Project Name:JDK_XXG
 * File Name:AddWatcher.java
 * Package Name:com.xxg.jdk.executor
 * Date:2015年8月7日下午4:34:02
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.xxg.jdk.executor;
/**
 * ClassName:AddWatcher <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月7日 下午4:34:02 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class AddWatcher implements Watcher {

	@Override
	public void processer(SourceEvent e) {
		   System.out.println("执行的操作为"+e.getOptime()+"==执行时间为"+e.date.toString());
		   System.out.println("处理加事件的业务逻辑。。。。。");
	}

}

