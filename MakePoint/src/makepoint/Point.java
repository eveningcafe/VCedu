/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makepoint;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author ngohoa
 */
public class Point {
    private int x;
    private int y;
    //khoi tao Point co toa do xy
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public static double distance(int x1, int y1, int x2, int y2) {
        double kc;
        kc = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return kc;
    }
    
    public static double distance(Point p1, Point p2) {
        double kc;
        kc = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
        return kc;
    }
    
    @Override
    public boolean equals(Object obj) {
        // Nếu đúng thì kiểm tra tiếp, sai thì trả về false
        if (obj instanceof Point) {
            Point p = (Point) obj;
            if (this.x == p.x && this.y == p.y) {
                return true;
            }
        }
        return false;
    }
    
    public HashSet<Point> makeNearPoints(int numberOfPoints,double maxDistance){
        HashSet<Point> set = new HashSet<Point>(numberOfPoints, (float) 0.5);
        Random rng = new Random(); 
        int range= (int)maxDistance*2;
        while(set.size()<numberOfPoints){
            rng = new Random();
            Integer nextX = this.x-(int)maxDistance+(rng.nextInt(range) + 1);
            Integer nextY = this.y-(int)maxDistance+(rng.nextInt(range) + 1);
            Point newPoint = new Point(nextX,nextY);
            if(distance(this, newPoint)<=maxDistance) set.add(newPoint);
        }
        return set;
    }
}
