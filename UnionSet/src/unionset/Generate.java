/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unionset;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author ngohoa
 */
class Generate extends LinkedHashSet<Integer>{
    //truyen vao kich co, khoi tao mot tap hop khong trung lap
    public Generate(int max, int numbersNeeded) {
        super();
        if (max < numbersNeeded){
            throw new IllegalArgumentException("Can't ask for more numbers than are available");
            }
        Random rng = new Random(); 
        while (this.size() < numbersNeeded){
        Integer next = rng.nextInt(max) + 1;
        this.add(next);
        }
    }
}
