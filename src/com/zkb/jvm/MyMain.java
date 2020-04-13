package com.zkb.jvm;

import java.util.ArrayList;
import java.util.List;

public class MyMain {
    private  final  byte[] bytes=new byte[1024*10*1024];
    private  String string="1111111111";
    private  String string2="1111111111";
    private  String string3="1111111111";
    private  String string4="1111111111";
    private  static  final  Byte[] bytes2=new Byte[1024*30*1024];

    //配置文件 vm options 中输入一下 配置，打印gc 详细信息
    //-verbose:gc -XX:+PrintGCDetails
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println("test2");
        List<Byte[]> strings=new ArrayList<>();
        strings.add(bytes2);


        while (true){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            strings.add(new Byte[1024*1024]);

        }

    }
}
