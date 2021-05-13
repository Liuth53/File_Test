/**

* @Description:    FileWriter_Test

* @Author:         Lth

* @CreateDate:     2021/5/13 18:55

* @UpdateUser:     Lth

* @UpdateDate:     2021/5/13 18:55

* @UpdateRemark:

* @Version:        1.8

*/
package com.Stream_Test_Flie;

import org.junit.Test;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Test {
    public static void main(String[] args) {

    }
    @Test
    public void w1() throws IOException {
        String filePath = "E:\\news5.txt";
        FileWriter fileWriter = null;
        char[] chars = {'1','2','3'};

        try {

            fileWriter = new FileWriter(filePath,true);//（文件路径名称，是否覆盖）
            //5 Way to Write

            fileWriter.write('W');
            fileWriter.write(chars);
            fileWriter.write("12345".toCharArray(),1,3);
            fileWriter.write("wangT");
            fileWriter.write("Wangtao",2,4);


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileWriter.close();
        }
    }

}
