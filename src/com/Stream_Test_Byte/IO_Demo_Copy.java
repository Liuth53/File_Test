/**

* @Description:     FileCopy

* @Author:         Lth

* @CreateDate:     2021/5/13 18:31

* @UpdateUser:     Lth

* @UpdateDate:     2021/5/13 18:31

* @UpdateRemark:

* @Version:        1.8

*/
package com.Stream_Test_Byte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_Demo_Copy {
    public static void main(String[] args) throws IOException {

        int readLen = 0;
        byte[] buf = new byte[1024];
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        String filePathIn = "E:\\1.jpg";
        String filePathOut = "E:\\news1\\1\\2\\3\\1.jpg";

        try {

            fileInputStream = new FileInputStream(filePathIn);
            fileOutputStream = new FileOutputStream(filePathOut);
            while ((readLen = fileInputStream.read(buf))!= -1){  //读取完毕返回-1,读取成功返回读取字节数
                fileOutputStream.write(buf,0,readLen);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null){
                fileOutputStream.close();

            }
        }
    }
}
