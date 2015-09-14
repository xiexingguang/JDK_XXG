/**
 * Project Name:JDK_XXG
 * File Name:Data.java
 * Package Name:com.ec.xxg.jdk.nio
 * Date:2015年8月3日下午4:57:11
 * Copyright (c) 2015, 深圳市六度人和 All Rights Reserved.
 *
*/

package com.ec.xxg.jdk.nio;
/**
 * ClassName:Data <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2015年8月3日 下午4:57:11 <br/>
 * @author   ecuser
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Data {
	private int n;
	private int m;
	
	public Data(int m,int n){
		this.n = n;
		this.m = m;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	
	@Override
	public String toString(){
		int r = n/m;
		return n +"/" + m +" = "+r;
	}

}

