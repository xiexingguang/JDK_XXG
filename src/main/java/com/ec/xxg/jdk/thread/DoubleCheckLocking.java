package com.ec.xxg.jdk.thread;

/**
 * Created by ecuser on 2015/9/15.
 */
public class DoubleCheckLocking {

     private static Instance instance;        // 可以用volatile解决当前方案

     public static  Instance getInstance() {
          if (instance == null) {
               synchronized (DoubleCheckLocking.class) {  //双重检测
                    if (instance == null) {
                          instance = new Instance();   // 7
                    }
               }
          }
          return instance;
     }

}

//
class Instance {

}


//静态类方案解决双重检测带来的问题
class InstanceFactory{
     private static class InstanceHolder {
          public  static Instance instance = new Instance();
     }

     public static Instance getInstance() {
           return InstanceHolder.instance;
     }
}