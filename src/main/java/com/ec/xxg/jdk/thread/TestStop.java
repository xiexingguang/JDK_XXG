/**
 * Project Name:JDK_XXG
 * File Name:TestStop.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月7日上午8:40:12
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * ClassName:TestStop <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月7日 上午8:40:12 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class TestStop {
	
	 private static final int[] array = new int[80000];
	 
	 static {
			Random random = new Random();
			for(int i = 0; i < array.length; i++) {
				array[i] = random.nextInt(i + 1);
			}
		}
	 private static final Thread t = new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				System.out.println(sort(array));
			} catch (Error err) {
				err.printStackTrace();
			}
			System.out.println("in thread t");
		}
	});
	 
	 private static int sort(int[] array) {
			for (int i = 0; i < array.length-1; i++){
				for(int j = 0 ;j < array.length - i - 1; j++){
					if(array[j] < array[j + 1]){
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			return array[0];
		}
  
	 public static void main(String[] args) throws Exception {
			t.start();
			TimeUnit.SECONDS.sleep(1);
			System.out.println("go to stop thread t");
			t.stop();
			System.out.println("finish main");
		}
}

