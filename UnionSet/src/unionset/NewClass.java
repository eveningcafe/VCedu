/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unionset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author ngohoa
 */
//
//    TreeSet<Integer> aSorted = new TreeSet<Integer>();
//        TreeSet<Integer> bSorted = new TreeSet<Integer>();
//        //dua 2 tap hop vao 2 SortedSet
//        Iterator<Integer> ite;
//        ite = a.iterator();
//        while (ite.hasNext()) {
//           aSorted.add(ite.next());
//        }
//        ite = b.iterator();
//        while (ite.hasNext()) {
//           bSorted.add(ite.next());
//        }
//        //dua chung vao 1 set
//        Iterator<Integer> aIte=aSorted.iterator();
//        Iterator<Integer> bIte=bSorted.iterator();
//        ArrayList<Integer> union= new ArrayList<Integer>();
//        ArrayList<Integer> interserct= new ArrayList<Integer>();
//        int temp1 = aIte.next();
//        int temp2 = bIte.next();
//        while (aIte.hasNext()||bIte.hasNext()) {  
//           if(temp1<temp2) {
//                union.add(new Integer(temp1));
//                if(aIte.hasNext()==false) {temp1=Integer.MAX_VALUE; continue;};
//                temp1 = aIte.next();
//           }else if(temp1>temp2){
//                union.add(new Integer(temp2));
//                if(bIte.hasNext()==false) {temp2=Integer.MAX_VALUE; continue;};
//                temp2 = bIte.next();
//           }else{
//               union.add(new Integer(temp1));
//               interserct.add(new Integer(temp1));
//               if(aIte.hasNext()==false) {temp1=Integer.MAX_VALUE; continue;};
//               temp1 = aIte.next();
//               temp2 = aIte.next();
//           }
//        }
//        System.out.println("ket qua:"+union.size()+ " va "+ interserct.size());

