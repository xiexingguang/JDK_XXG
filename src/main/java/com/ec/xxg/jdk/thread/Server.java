/**
 * Project Name:JDK_XXG
 * File Name:Server.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年8月3日下午3:20:27
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName:Server <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月3日 下午3:20:27 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Server {
	
	
	public static void main(String[] args) throws IOException, InterruptedException{
		   Zk z = new Zk();
		  // Zk.ZD
		   ServerSocket server = new ServerSocket(8080);
		   for(;;){
			   System.out.println("wait the client to connect...");
			   Socket ss =  server.accept();
			   System.out.println("the client has been build..");
			   new Thread(new Runnable() {
				@Override
				public void run() {
					     try {
							Thread.sleep(20000);
							//   InputStream in = ss.getInputStream(); //get the inputstream 
							//   ObjectInputStream inObject = new ObjectInputStream(in);
							   //处理业务逻辑、
							   //2返回结果，写回客户端
						
						  } catch (InterruptedException e) {
						
						 }
				   }
			}).start();
			   
			   
			   
			   
			   
			   
			   
			
		   }
		   
	 }

}

