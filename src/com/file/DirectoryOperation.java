/**

* @Description:    DirectoryOperations

* @Author:         Lth

* @CreateDate:     2021/5/13 16:28

* @UpdateUser:     Lth

* @UpdateDate:     2021/5/13 16:28

* @UpdateRemark:

* @Version:        1.8

*/
package com.file;

import org.junit.Test;

import java.io.File;

public class DirectoryOperation {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("Delete Successfully！");
            }
            else
                System.out.println("Delete fail.");
        }
        else System.out.println("It is not exists");
    }

    @Test
    public void m2(){
        String filePath = "e:\\news1";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("Delete Successfully！");
            }
            else
                System.out.println("Delete fail.");
        }
        else System.out.println("Direction is not exists");
    }

    @Test
    public void m3(){
        String directoryPath = "e:\\news1\\1\\2\\3";
        File file = new File(directoryPath);
        if(file.exists()){
            System.out.println(directoryPath+" exists");
        }
        else {
            System.out.println("Direction is not exists");
            if (file.mkdirs()){
                System.out.println("Create Successfully!");
            }
            else {
                System.out.println("Create fail.");
            }
        }
    }

}
