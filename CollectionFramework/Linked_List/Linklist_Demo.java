package Linked_List;

import java.util.*;

public class Linklist_Demo {
    public static void main(String[] args) {
        
        //-- Creating an object of LinkedList
        LinkedList<Integer> arr1 = new LinkedList<>();      //-- In Linkedlist we don't require to intitilise the space. 

        LinkedList<Integer> arr2 = new LinkedList<>(List.of(2,6,8,10,12));

        arr1.add(3);
        arr1.add(0, 5);
        arr1.addAll(arr2);

        arr1.addFirst(1);       //-- ( .addFirst() ) add the element in the starting of the List.
        arr1.addLast(14);       //-- ( .addLast() ) add the element in the last  of the List.

        System.out.println(arr1);
        }
    }

