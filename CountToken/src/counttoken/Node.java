/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttoken;

import java.util.Comparator;

/**
 *
 * @author ngohoa
 */
public class Node implements Comparator<Node>{
    String token;
    int numRepeatCount;
    Node leftChild;
    Node rightChild;
    public Node(String token) {
        numRepeatCount=0;
        this.token=token;
    }          

    @Override
    public int compare(Node t, Node t1) {
        if(t.numRepeatCount>t.numRepeatCount) return 1;
        else if(t.numRepeatCount<t.numRepeatCount) return -1;
        else return 0;
    }
}
