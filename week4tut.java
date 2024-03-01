import java.util.Arrays;
import java.util.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class week4tut { 
    public static void main(String[] args){ 
    // Crate linked list  
    LinkedList<String> linkedlist = new LinkedList<String>(); 
    // things for question 2 //
    LinkedList<String> lowToHigh = new LinkedList<String>(); 
    // Create iterator object with linkedlist as the instance
    Iterator<String> it = linkedlist.iterator();

    // Set scanner variable  
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < 3; i++){
        // input for linked list
        System.out.print("Enter value: "); 
        String item = scanner.nextLine(); 
        // add to linked list 
        linkedlist.add(item);
        }
    // close scanner
    scanner.close();
    // print output 
    System.out.println("Output linked list = " + linkedlist);
    // print size of list 
    System.out.println("Size: " + linkedlist.size());
    int index = 0;
    while(it.hasNext()){
        if(index > 2){
            break;
        }
        // add to reversed list 
        lowToHigh.push(linkedlist.get(index));
        index ++;
    }
    System.out.println("Output changed linked list = " + lowToHigh);
    // print size of list 
    System.out.println("Size: " + lowToHigh.size());
    }
} 

/*
 * In computer science, a linked list is a linear collection of data elements whose order is not given by their 
 * physical placement in memory. Instead, each element points to the next. It is a data structure consisting of a 
 * collection of nodes which together represent a sequence
 */
