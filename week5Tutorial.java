import java.io.*;
import java.util.Stack;

public class week5Tutorial {
    // Decimal to binary conversion using recursion 
    static int find(int decimal_number){
        if (decimal_number == 0){
            return 0;
        } 
        else{
            return (decimal_number % 2 + 10 * find(decimal_number / 2));
        }
    }
    
    // Java implementation of recursive Binary Search
    class BinarySearch {
        // Returns index of x if it is present in arr[l..r], else return -1
        int binarySearch(int arr[], int l, int r, int x){
            if (r >= l) {
                int mid = l + (r - l) / 2;
                // If the element is present at the middle itself
                if (arr[mid] == x)
                    return mid;
                // If element is smaller than mid, then it can only be present in left subarray
                if (arr[mid] > x)
                    return binarySearch(arr, l, mid - 1,x);
                // Else the element can only be present in right subarray
                return binarySearch(arr, mid + 1, r, x);
        }
        // We reach here when element is not present in array
        return -1;
    }
        
    // Implement a method as transfer (S, T) that transfers all elements from
    // stack S onto stack T, so that the element that starts at the top of S is the
    // first to be inserted onto T, and the element at the bottom of S ends up at the top of T 
    public static <T> void transfer (Stack<T> source, Stack<T> target){
        //transfer elements from source to target 
        while (!source.isEmpty()) {
        target.push(source.pop());
        }
    }

    // Driver code
    public static void main(String[] args) {
        // decimal binary conversion     
        int decimal_number = 10; 
        System.out.println(find(decimal_number));
        
        // Binary search tree recursion algorithm 
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);

        // Create a program example that put three colours: orange, purple and green, on the stack. 
        // Check the stack for emptiness. Then, extract balls from the stack until the stack is empty.
        Stack myStack = new Stack<>();

        System.out.println("Is my stack empty" +  myStack.empty());
        //pushing elements into stack
        myStack.push("Orange ball");
        myStack.push("violet Ball");
        myStack.push("Green Ball");

        //prints elements of the stack
        System.out.println("Elements in Stack: " + myStack);
        System.out.println("Is my stack empty? " + myStack.empty());
        while (!myStack.isEmpty()) {
            myStack.pop();
            System.out.println("Elements in Stack: " + myStack);
            System.out.println("Is my stack empty? " + myStack.empty());
            
        //example usage
        Stack<Integer> source = new Stack<>();
        Stack<Integer> target = new Stack<>();
    
        //push some elements into source stack
        source.push(1);
        source.push(1);
        source.push(1);
    
        System.out.println("Before transfer");
        System.out.println("SOurce stack : " + source);
        System.out.println("Target stack: " + target);
    
        //transfer elements from source to target 
        transfer(source, target);
    
        System.out.println("\nAfter transfer:");
        System.out.println("Source stack: " + source);
        System.out.println("Target stack: " + target);
    }
}
