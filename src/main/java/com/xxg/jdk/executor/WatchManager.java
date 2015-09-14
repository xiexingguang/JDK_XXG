/**
 * Project Name:JDK_XXG
 * File Name:WatchManager.java
 * Package Name:com.xxg.jdk.executor
 * Date:2015年8月7日下午4:26:06
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.xxg.jdk.executor;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:WatchManager <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月7日 下午4:26:06 <br/>
 * @author   xxg
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class WatchManager {
	
	public static List<Watcher> lists = new ArrayList<Watcher>();
	public static void registWatcher(Watcher w){
		lists.add(w);
	}

}

