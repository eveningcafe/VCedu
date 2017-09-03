/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unionset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ngohoa
 */
public class UnionSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // tao tap hop a
        Generate a = new Generate(5000, 1900);
        // tao tap hop b
        Generate b = new Generate(5000, 1900);
        // dam bao it nhat 5% la chung giua 2 tap hop
        Random rng = new Random(); 
        while (a.size()!=2000&&b.size()!=2000){
        Integer next = rng.nextInt(5000) + 1;
        if(a.add(next)==true)
             if(b.add(next)==true) continue;
             else {a.remove(next);}
        }
        //
        //giai bai toan: 
        //
        Set union = new HashSet(a);
        union.addAll(b);
        System.out.println("The union size of A and B: "+union.size());
        
        Set intersect = new HashSet(a);
        intersect.retainAll(b);
        System.out.println("The intersection size of A and B: "+intersect.size());
  
    }
    
}
