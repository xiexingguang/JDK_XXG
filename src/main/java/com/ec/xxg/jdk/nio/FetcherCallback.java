/**
 * Project Name:JDK_XXG
 * File Name:FetcherCallback.java
 * Package Name:com.ec.xxg.jdk.nio
 * Date:2015年8月3日下午4:56:56
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.nio;
/**
 * ClassName:FetcherCallback <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月3日 下午4:56:56 <br/>
 * @author   xxg
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public interface FetcherCallback {
	void onData(Data data) throws Exception;
	void onError(Throwable e);
}

