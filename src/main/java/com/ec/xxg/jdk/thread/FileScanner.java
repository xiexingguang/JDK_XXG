/**
 * Project Name:JDK_XXG
 * File Name:FileScanner.java
 * Package Name:com.ec.xxg.jdk.thread
 * Date:2015年9月7日上午8:47:07
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * ClassName:FileScanner <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年9月7日 上午8:47:07 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class FileScanner {
	
	private static void listFile(File f) throws InterruptedException {
		if(f == null) {
			throw new IllegalArgumentException();
		}
		if(f.isFile()) {
			System.out.println(f);
			return;
		}
		File[] allFiles = f.listFiles();
		if(Thread.interrupted()) {
			throw new InterruptedException("文件扫描任务被中断");
		}
		for(File file : allFiles) {
			//还可以将中断检测放到这里
			listFile(file);
		}
	}
	
	public static String readFromConsole() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			return reader.readLine();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	public static void main(String[] args) throws Exception {
		final Thread fileIteratorThread = new Thread() {
			public void run() {
				try {
					//Thread.sleep(200000);
					listFile(new File("d:\\"));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread() {
			public void run() {
				while(true) {
					if("quit".equalsIgnoreCase(readFromConsole())) {
						if(fileIteratorThread.isAlive()) {
							fileIteratorThread.interrupt();
							return;
						}
					} else {
						System.out.println("输入quit退出文件扫描");
					}
				}
			}
		}.start();
		fileIteratorThread.start();
	}
	
}

