/**
 * Project Name:JDK_XXG
 * File Name:MyFetcher.java
 * Package Name:com.ec.xxg.jdk.nio
 * Date:2015年8月3日下午4:59:56
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.nio;
/**
 * ClassName:MyFetcher <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月3日 下午4:59:56 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class MyFetcher implements Fetcher{
    
	final Data data;
	
    public MyFetcher(Data data) {
          this.data = data;
	}
	@Override
	public void fetchData(FetcherCallback callback) {
		 try {
			callback.onData(data);
		} catch (Exception e) {
			callback.onError(e);
		}
	}

}

