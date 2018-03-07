/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;

/**
 *
 * @author mohammahomarhariri
 */
class Address implements Comparable<Address> {

    String street;

    Address(String st) {
        street = st;

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return street;
    }

    @Override
    public int compareTo(Address o) {

        int compareString = this.street.compareTo(o.street);

        if (compareString < 0) {
            return -1;
        }
        if (compareString > 0) {
            return 1;
        }
        return 0;
    }
//
//    public void quicksort(ArrayList<Address> list) {
//
//        boolean error = true;
//        int errors = 0;
//        int pivot;
//        int lastIndex = list.size() - 1;
//
//        if (list.size() % 2 == 0) {
//            pivot = list.size() / 2;
//        } else {
//            pivot = list.size() / 2 - 1;
//        }
//        
//        int currentIndex = 0;
//        while(error = false){
//            
//            if(currentIndex <= pivot && lastIndex >= pivot){
//            if(list.get(currentIndex).compareTo(list.get(pivot)) == 1){
//                
//                Address temp = list.get(currentIndex);
//                list.set(currentIndex,list.get(lastIndex));
//                list.set(lastIndex, temp);
//                errors++;
//                
//            }else if(list.get(currentIndex).compareTo(list.get(pivot)) <= 0){
//                currentIndex++;
//            }if(currentIndex < pivot)
//            
//             if(errors >= 1 ){
//                 error = false;
//             } else {
//                 error = true;
//             }
//            }
//        }
//        
//    }

}
