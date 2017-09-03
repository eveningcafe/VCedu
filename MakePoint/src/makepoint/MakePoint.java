/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makepoint;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

/**
 *
 * @author ngohoa
 */
public class MakePoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // tao cac diem gan 
        Point a = new Point(800, 800);
        Point b = new Point(4000, 800);
        Point c = new Point(2400, 2400);
        HashSet<Point> aNear = a.makeNearPoints(8000, 400);
        HashSet<Point> bNear = b.makeNearPoints(10000, 500);
        HashSet<Point> cNear = c.makeNearPoints(12000 , 600);
        //tao set ket qua
        HashSet<Point> reuslt= aNear;
        reuslt.addAll(bNear);
        reuslt.addAll(cNear);
        File file = new File("output.txt");
        file.createNewFile();   
        FileWriter writer = new FileWriter(file);
        for(Point p : reuslt ){
        writer.write(" ["+p.getX()+":"+p.getY()+"] ");
        }
        writer.flush();
        writer.close();
    }
    
}
