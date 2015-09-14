/**
 * Project Name:JDK_XXG
 * File Name:Test.java
 * Package Name:com.ec.xxg.jdk.nio
 * Date:2015年8月3日上午11:39:15
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.nio;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * ClassName:Test <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月3日 上午11:39:15 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Test {
	 
	 public static void main(String[] args) {
		       testBuffer();
	}
	 
	 public static void testBuffer(){
		 ByteBuffer bf = ByteBuffer.allocate(20);
		System.out.println(bf.position());
		System.out.println(bf.capacity());
		System.out.println(bf.mark());
		System.out.println(bf.limit());
		
		System.out.println("==========before put=======");
		bf.put((byte)4);
		bf.put((byte)4);
		bf.put((byte)4);
		
		System.out.println("==========after put=======");
		System.out.println(bf.position());
		System.out.println(bf.capacity());
		System.out.println(bf.mark());
		System.out.println(bf.limit());
		
		ByteBuffer bf1 = ByteBuffer.allocateDirect(20);
		System.out.println("==========================");
		System.out.println(bf1.position());
		System.out.println(bf1.capacity());
		System.out.println(bf1.mark());
		System.out.println(bf1.limit());
			
	 }

}

