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
public class MyQuickSort {

    ArrayList<Address> array = new ArrayList();

    private int length;

    public void sort(ArrayList<Address> list) {

        if (list == null || list.size() == 0) {
            return;
        }
        this.array = list;
        length = list.size();
        quicksort1(0, length - 1);
    }

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
//        while (error = false) {
//
//            if (currentIndex >= pivot && lastIndex <= pivot) {
//
//                // check if there is no error then send true
//            } else {
//
//                if (list.get(currentIndex).compareTo(list.get(pivot)) == 1) {
//
//                    Address temp = list.get(currentIndex);
//                    list.set(currentIndex, list.get(lastIndex));
//                    list.set(lastIndex, temp);
//                    errors++;
//
//                } else if (list.get(currentIndex).compareTo(list.get(pivot)) <= 0) {
//                    currentIndex++;
//                }
//                if (currentIndex < pivot) {
//                    if (errors >= 1) {
//                        error = false;
//                    } else {
//                        error = true;
//                    }
//                }
//            }
//        }
//    }

    public void changeSpot(int i, int j) {

        Address temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);

    }

    private void quicksort1(int lower, int higher) {

//        String lowerIndex = low.street;
//        String higherIndex = high.street;
        int i = lower;
        int j = higher;

        int pivot;

        //calculating pivot by array.size, middle number
        if (array.size() % 2 == 0) {
            pivot = array.size() / 2;
        } else {
            pivot = array.size() / 2;
        }

        while (array.get(i).compareTo(array.get(j)) <= 0) {

            while (array.get(i).compareTo(array.get(pivot)) == -1) {
                i++;
            }

            while (array.get(j).compareTo(array.get(pivot)) == 1) {
                j--;
                changeSpot(j, pivot);
            }

            if (array.get(i).compareTo(array.get(j)) <= 0) {
                //exchange metode
                changeSpot(i, j);
                i++;
                j--;

            }

        }            //call method for recursively
        if (lower < j) {
            quicksort1(lower, j);
            if (i < higher) {
                quicksort1(i, higher);
            }

        }

    }

}
