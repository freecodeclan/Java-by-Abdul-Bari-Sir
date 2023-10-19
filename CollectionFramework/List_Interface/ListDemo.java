package List_Interface;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        //--Object of an ArrayList & ( <Integer> ) is known as wrapper class
        ArrayList<Integer> arr1 = new ArrayList<>(20);

        ArrayList<Integer> arr2 = new ArrayList<>(List.of(50,60,70,80,90));     //-- Here (List.of) is the static method

        arr1.add(10);
        
        arr1.add(0,5);        //-- This .add() method will add value at index 0.
        
        arr1.addAll(arr2);                  //-- This .addAll() adds all the element of ArrayList arr2 into arr1.

        arr1.add(4, 70);      //-- Here we use .add() method to add 70 at 4 index value.

        System.out.println(arr1);
        
        System.out.println(arr1.contains(60));      //-- Here ( .contains() ) is used to check whether element is present or not in List. It gives boolean value.

        System.out.println(arr1.get(5));        //-- Here ( .get() ) is used to check element present on given index value.

        System.out.println(arr1.indexOf(70));       //-- Here ( .indexOf() ) is used to find the index value of an given element.

        System.out.println(arr1.lastIndexOf(70));   //-- ( .lastIndexOf() ) is used to see the last index value of duplicate element.   
      
        //-- For each loop to iterate the List 
        for(var x:arr1){
            System.out.println(x);
        }

        //-- Now using .iterator() to iterate an List
        Iterator<Integer> it = arr1.iterator();
        while(it.hasNext()){ 
            System.out.println(it.next());
        }
    }
}
