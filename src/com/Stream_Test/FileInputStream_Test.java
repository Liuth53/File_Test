/**

* @Description:    InputStream_Test

* @Author:         Lth

* @CreateDate:     2021/5/13 16:56

* @UpdateUser:     Lth

* @UpdateDate:     2021/5/13 16:56

* @UpdateRemark:

* @Version:        1.8

*/
package com.Stream_Test;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_Test {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01() throws IOException {
        FileInputStream fileInputStream = null;
        String filePath = "E:\\news2.txt";
        int readData = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read())!= -1){                //读取完毕返回-1
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流
            fileInputStream.close();
        }
    }

    //使用read(byte[] b)读取文件
    @Test
    public void readFile02() throws IOException {
        FileInputStream fileInputStream = null;
        String filePath = "E:\\news2.txt";
        byte[] buf = new byte[8];
        int readLen = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readLen = fileInputStream.read(buf))!= -1){                //读取完毕返回-1,读取成功返回读取字节数
                System.out.print(new String(buf,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流
            fileInputStream.close();
        }
    }
}
