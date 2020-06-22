package com;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {

//        File file = new File("E:\\JAVA_TEST_APP\\output8");
//
//        if(file.exists()){
//            file.delete();
//        }

        File file2 = new File("E:\\JAVA_TEST_APP\\testDir");

        if(file2.exists()){
            System.out.println(file2.delete());
        }
    }
}
