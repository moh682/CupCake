/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mohammahomarhariri
 */
public class Main {
    
    

    public static void main(String[] args) {
//        
//        ArrayList<Address> array = new ArrayList();
//        
//        array.add(new Address("Georgestreet"));
//        array.add(new Address("Grafficstreet"));
//        array.add(new Address("Bridgestreet"));
//        array.add(new Address("Towerestreet"));
//
//        for (int i = 0; i < array.size(); i++) {
//            System.out.println(array.get(i).street + " ");
//        }
//
//        System.out.println("");
//
//        Collections.sort(array);
//
//        for (int i = 0; i < array.size(); i++) {
//
//            System.out.println(array.get(i).street + " ");
//        }

        MyQuickSort sorter = new MyQuickSort();
        
        ArrayList<Address> list = new ArrayList();
        
        list.add(new Address("G"));
        list.add(new Address("p"));
        list.add(new Address("s"));
        list.add(new Address("a"));
        list.add(new Address("f"));
        
        sorter.sort(list);
        for(Address i:list){
            System.out.print(i);
            System.out.print(" ");
        }

    }

   
}
