/**

* @Description:    FileReader_Test

* @Author:         Lth

* @CreateDate:     2021/5/13 18:58

* @UpdateUser:     Lth

* @UpdateDate:     2021/5/13 18:58

* @UpdateRemark:

* @Version:        1.8

*/
package com.Stream_Test_Flie;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Test {
    public static void main(String[] args) {

    }

    @Test
    public void f1() throws IOException {
        String filePath = "E:\\news4.txt";
        int data = 0;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(filePath);
            while ((data = fileReader.read()) != -1) {
                System.out.print((char)data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader !=null){
                fileReader.close();
            }
        }

    }
    @Test
    public void f2() throws IOException {
        String filePath = "E:\\news4.txt";
        int readLen = 0;
        FileReader fileReader = null;
        char[] buf = new char[1024];

        try {

            fileReader = new FileReader(filePath);
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf,0,readLen));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if (fileReader !=null){
                fileReader.close();

            }
        }
    }
}
