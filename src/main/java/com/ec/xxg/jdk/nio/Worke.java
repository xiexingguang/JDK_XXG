/**
 * Project Name:JDK_XXG
 * File Name:Worke.java
 * Package Name:com.ec.xxg.jdk.nio
 * Date:2015年8月3日下午5:10:37
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.nio;
/**
 * ClassName:Worke <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月3日 下午5:10:37 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Worke {
	
	 public static void main(String[] args) {
		 Fetcher f = new MyFetcher(new Data(1,3));
		 f.fetchData(new FetcherCallback() {
			
			@Override
			public void onError(Throwable e) {
			  System.out.println("the error is.///"+e);
			}
			
			@Override
			public void onData(Data data) throws Exception {
			 System.out.println("the data is ...."+data);
			}
		});
	}

}

