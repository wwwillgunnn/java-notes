// Java Program to Create a Singly Linked List
// of n Nodes and Count the Number of Nodes
import java.io.*;
import java.util.*;
public class LinkedListCreation {
  class Node {
    int data;
    Node next;
    // constructor to create new node
    Node(int data)
    {
      this.data = data;
      this.next = null;
    }
  }
  // Initially both head and tail are not
  // pointing to any other node
  Node head = null;
  Node tail = null;
  // method to add newNode in Linked List
  void addNode(int data) {
    Node newNode = new Node(data);
    // Checks if the list is empty
    if (head == null) {
      // If list is empty, both head and
      // tail will point to new node
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      // storing newnode in tail
      tail = newNode;
    }
  }
  // display linked list
  void displayNodes(){
    Node current = head;
    if (head == null) {
      System.out.println("Empty");
      return;
    }
    System.out.println("Nodes : ");
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }
  // method to count nodes
  int countNodes(){
    // Initially zero
    int count = 0;
    Node currentNode = head;
    // iterate until all the nodes are present
    while (currentNode != null) {
      count++;
      currentNode = currentNode.next;
    }
    // return the count
    return count;
  }
  public static void main(String[] args)
  {
    LinkedListCreation L1 = new LinkedListCreation();
    L1.addNode(1);
    L1.addNode(2);
    L1.addNode(3);
    L1.addNode(4);
    // Displays the nodes present in the list
    L1.displayNodes();
    // Counts the nodes present in the given list
    System.out.println("Total Nodes: "
    + L1.countNodes());
  }
}

// Java program for reversing linked list using additional space
import java.util.*;
public class LinkedListTest1 {
  public static void main(String[] args){
    // Declaring linkedlist without any initial size
    LinkedList<String> linkedli = new LinkedList<String>();
    // Appending elements at the end of the list
    linkedli.add("Cherry");
    linkedli.add("Chennai");
    linkedli.add("Bullet");
    System.out.print("Elements before reversing: " + linkedli);
    linkedli = reverseLinkedList(linkedli);
    System.out.print("\nElements after reversing: " + linkedli);
  }
  // Takes a linkedlist as a parameter and returns a reversed linkedlist
  public static LinkedList<String> reverseLinkedList(LinkedList<String> llist){
    LinkedList<String> revLinkedList = new LinkedList<String>();
    for (int i = llist.size() - 1; i >= 0; i--) {
      // Append the elements in reverse order
      revLinkedList.add(llist.get(i));
    }
    // Return the reversed arraylist
    return revLinkedList;
  }
}
