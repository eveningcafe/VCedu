/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttoken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ngohoa
 */
    public class ReadToken {
        //dau vao: file, dau ra: tokenArray chua cac token .
        static ArrayList<String> readFileToTokenList(String URL){
        FileInputStream fis = null;
        ArrayList<String> tokenArray= new ArrayList<>();
        try {
            // doc file, ghi tu to vao tokenArray
            String input = URL;
            fis = new FileInputStream(new File(input));
            BufferedReader br = new BufferedReader(new InputStreamReader(fis)); 
                String line;
                while ((line = br.readLine()) != null) {
                    line = line.trim();
                    if (line != null && !line.isEmpty()) {
                        String [] lineArray=line.split(" ");
                        for(String token :  lineArray)
                        if(token!=""&&token!=null)tokenArray.add(token);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(CountToken.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(CountToken.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        return tokenArray;
        }    
}
