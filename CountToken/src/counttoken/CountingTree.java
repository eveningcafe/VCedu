/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttoken;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ngohoa
 */
public class CountingTree {
        Node root;
        
        public CountingTree(String token) {
            this.root = new Node(token);
        }  
        //so sanh de tim ra vi tri cua token tren cac nhanh cua cay, tra ve vi tri node tim dc
        public Node findNode(String token,Node currentNode){
            Node temp = currentNode;
            int compare = temp.token.compareTo(token);
            if(compare>0){
                if(temp.rightChild==null){
                    Node newNode = new Node(token);
                    temp.rightChild= newNode;
                    return newNode;
                }
                else{
                    temp= temp.rightChild;
                    return findNode(token, temp);
                }
            }else if(compare<0){
                if(temp.leftChild==null){
                    Node newNode = new Node(token);
                    temp.leftChild= newNode;
                    return newNode;
                }
                else{
                    temp= temp.leftChild;
                    return findNode(token, temp);
                }
            }else {
                return temp;
            }
        }
        public void printResult(Node node){
            if(node!=null){
            printResult(node.leftChild);
            printResult(node.rightChild);
            System.out.println(node.token+" : "+node.numRepeatCount);
            }
        }
        public void printResult(Node node,Writer w) throws IOException{
            if(node!=null){
            printResult(node.leftChild,w);
            printResult(node.rightChild,w);
            w.write(node.token+" : "+node.numRepeatCount+" \n");
            }
        }
        public int size(Node node) { 
        if (node == null) return(0); 
        else { 
        return(size(node.leftChild) + 1 + size(node.rightChild)); 
        }
        }
        public void toList(ArrayList list,Node node){
            if(node!=null){
             toList(list,node.leftChild);
             toList(list,node.rightChild);
            list.add(node);
            }
        }
}
