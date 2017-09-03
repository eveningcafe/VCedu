/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttoken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import counttoken.ReadToken;
/**
 *
 * @author ngohoa
 */
public class CountToken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //doc file lay ra mang token
        ArrayList<String>tokenArray= ReadToken.readFileToTokenList("bai2\\01.txt");
        //tao cay
        CountingTree tree = new CountingTree(tokenArray.get(0));
        //duyet tim vi tri cua tu tren cay. ++ numRepeat khi tim ra.
        for(String token : tokenArray){
            Node node =tree.findNode(token,tree.root);
            node.numRepeatCount++;
        }
        Writer w = new FileWriter("bai2\\output.txt");
        tree.printResult(tree.root,w);
        System.out.println("done!");
    }
}
