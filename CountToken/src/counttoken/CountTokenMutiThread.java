/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttoken;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ngohoa
 */
public class CountTokenMutiThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        //doc file lay ra mang token
        ArrayList<ThreadCount> a= new ArrayList<ThreadCount>();
        File folder = new File("bai3\\input\\");
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                ThreadCount thread = new ThreadCount(listOfFiles[i].getAbsolutePath());
                a.add(thread);
            }
        }
        //tao cay
        CountingTree tree = new CountingTree("The");
        for(ThreadCount theard : a){
            theard.tree= tree;
        }
        for(ThreadCount theard : a){
            theard.start();
        }
        for(ThreadCount theard : a){
            theard.join();
        }   
        //sap xep cac phan tu theo thu tu tang dan so lan lap lai
        
        ArrayList<Node> sortArray= new ArrayList<Node>();
        tree.toList(sortArray, tree.root);
        Collections.sort(sortArray,(t, t1) -> {
           if(t.numRepeatCount>t1.numRepeatCount) return 1;
           else if(t.numRepeatCount<t1.numRepeatCount) return -1;
           else return 0;
        });
        //in ket qua 
        File file = new File("bai3\\output.txt");
        file.createNewFile();   
        FileWriter writer = new FileWriter(file);
        writer.write("10 tu xuat hien it nhat: \n");
        for(int i=0; i<10;i++){
        writer.write(sortArray.get(i).numRepeatCount+" " +sortArray.get(i).token+" \n");
        }
        writer.write("10 tu xuat hien nhieu nhat: \n");
        for(int i=sortArray.size()-1; i>=sortArray.size()-10;i--){
        writer.write(sortArray.get(i).numRepeatCount+" " +sortArray.get(i).token+" \n");
        }
        writer.flush();
        writer.close();
        System.out.println("done!");
    }    
}
