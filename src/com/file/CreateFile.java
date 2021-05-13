package com.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**

* @Description:

* @Author:         Lth

* @CreateDate:     2021/5/13 15:55

* @UpdateUser:     Lth

* @UpdateDate:     2021/5/13 15:55

* @UpdateRemark:

* @Version:        1.8

*/
public class CreateFile {
    public static void main(String[] args) {

    }
    //New File(String pathname)
    @Test
    public void create01() {
        String filepath = "e:\\news1.txt";
        File file = new File(filepath);
        try {
            file.createNewFile();
            System.out.println("Create Successfully！");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //父目录+子路径
    @Test
    public void create02(){
        File parentFile = new File("e:\\");
        String fileName = "news2.txt";
        File file = new File(parentFile,fileName);
        try {
            file.createNewFile();
            System.out.println("Create Successfully！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create03(){
        String parentPath = "e:\\";
        String fileName = "news3.txt";
        File file = new File(parentPath,fileName);

        try {
            file.createNewFile();
            System.out.println("Create Successfully！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
