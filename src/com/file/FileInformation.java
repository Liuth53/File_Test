/**

* @Description:    File Function Demo

* @Author:         Lth

* @CreateDate:     2021/5/13 16:14

* @UpdateUser:     Lth

* @UpdateDate:     2021/5/13 16:14

* @UpdateRemark:

* @Version:        1.8

*/
package com.file;

import org.junit.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
    }

    //Get Information
    @Test
    public void Info01(){
        File file = new File("e:\\news1.txt");
        System.out.println("file name:"+file.getName());
        System.out.println("file path:"+file.getPath());
        System.out.println("file parentPath:"+file.getParent());
        System.out.println("file size:"+file.length());
        System.out.println("Is exist?:"+file.exists());
        System.out.println("Is File?:"+file.isFile());
        System.out.println("Is Directory?:"+file.isDirectory());
        System.out.println("Hash code:"+file.hashCode());

    }
}
