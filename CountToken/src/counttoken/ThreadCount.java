/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttoken;

import java.util.ArrayList;

/**
 *
 * @author ngohoa
 */
public class ThreadCount extends Thread{
    private String URL;
    public CountingTree tree;
    ArrayList<String>tokenArray;
    public ThreadCount( String URL) {
        this.URL= URL;
    }
    @Override
    public void run() {
        this.tokenArray=ReadToken.readFileToTokenList(URL);
        for(String token : tokenArray){
        synchronized(tree){
        Node node =tree.findNode(token,tree.root);
        node.numRepeatCount++;
        }
        }
         System.out.println("Thread "+ URL+" done.");
    }
}
