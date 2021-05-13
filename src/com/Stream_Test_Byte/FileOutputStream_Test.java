/**

* @Description:    字节

* @Author:         Lth

* @CreateDate:     2021/5/13 18:52

* @UpdateUser:     Lth

* @UpdateDate:     2021/5/13 18:52

* @UpdateRemark:

* @Version:        1.8

*/
package com.Stream_Test_Byte;

import org.junit.Test;

import java.io.*;

public class FileOutputStream_Test {
    public static void main(String[] args) {


    }
    //
    @Test
    public void writeFile() throws IOException {
        String filePath = "E:\\news3.txt";
        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream1 = null;
        String str = "Hello,Word.";
        try {
            fileOutputStream = new FileOutputStream(filePath);  //覆盖原有字符
//            fileOutputStream = new FileOutputStream(filePath,true);//追加，不会覆盖原有内容

            fileOutputStream.write(str.getBytes());//把字符串转成字符数组
            fileOutputStream.write(str.getBytes(),0,5);
//            fileOutputStream.write((str.getBytes()),0,5);//追加，不会覆盖原有内容
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            fileOutputStream.close();

        }
    }
}
