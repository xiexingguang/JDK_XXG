/**
 * Project Name:JDK_XXG
 * File Name:SyncInsertRedis.java
 * Package Name:com.xxg.jdk.executor
 * Date:2015年8月11日下午8:50:48
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.xxg.jdk.executor;
public class SyncInsertRedis  implements RedisCallback{
	public int insertDB() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("插入1000条数据，db中比较耗时。。。。");
		return -1;
	}
	public void insertRedis(){
		System.out.println("插入数据1000条redis");
	}
	public void executeDB(RedisCallback callback) throws InterruptedException{
		  int falg = insertDB();
		  callback.handle(falg);
	}
	public static void main(String[] args) {
		final SyncInsertRedis s = new SyncInsertRedis();
		s.insertRedis();
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					s.executeDB(s);//执行耗时的db操作
				} catch (InterruptedException e) {
				}
 			}
		}).start();
		System.out.println("执行业务过程结果返回....");
	}
	@Override
	public void handle(int flag) {
		 if(flag < 0 ){ //表示插入失败
			 System.out.println("数据库插入失败，。。。同步reids，将已插入的redis的数据移除");
		 }else{
			 System.out.println("数据库插入成功，redis数据无需变化");
		 }
	}

}

