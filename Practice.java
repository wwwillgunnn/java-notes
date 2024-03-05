public class Practice { // class
    public static void main(String[] args){  // The main method executes the tasks of the class
        // All data types must be declared before their name
        // Concatenate things with a plus
        String user = "User";
        System.out.println("Hello" + user);

    }
}
// simple variables 
public class walkthrough {
    public static void main(String[] args) {
        int x = 123; //initialization
        double y = 3.14;
        boolean z = true;
        char symbol ='@';
        String name ="jeremy";
        System.out.println("hello " + name);
    }
}
// Swapping 2 variables
public class walkthrough {
    public static void main(String[] args) {
        // decalre variables
        String x = "water";
        String y = "kool-Aid";
        String temp;
        // swap variables 
        temp=x;
        x=y;
        y=temp;
        // print swapped variables
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
//using a scanner for user input
import java.util.Scanner;;
public class walkthrough{
    public static void main(String[] args) {
        // set scanner variables
        Scanner scanner = new Scanner(System.in);
        // print out prompt and scan input 
        System.out.println("What is your name");
        String name = scanner.nextLine();
        // print out prompt and scan input 
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine(); // !! please explain !!
        // print out prompt and scan input 
        System.out.println("what is your fav food");
        String food = scanner.nextLine();
        // print user input
        System.out.println("Hello "+name);
        System.out.println("you are "+age+"year old ");
        System.out.println("You like "+food);
    }
}
// math operations 
public class walkthrough {
    public static void main(String[] args) {
        // expression = opperands and opperators 
        // operands = values, variables, numbers, quantity
        // operators = + - * / & 
        int friends = 10;
        friends = friends / 2;
        System.out.println(friends);
    }
}
//simple gui with java
import javax.swing.JOptionPane;
public class walkthrough {
    public static void main(String[] args) {
        // label and output???
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        //
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"you are "+age+"Years old");
        // 
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"you are "+height+" cm tall");
    }   
}
//max / min 
public class walkthrough{
    public static void main(String[] args) {
        // declare variables 
        double x = 3.14;
        double y = -10;
        // print max 
        double z = Math.max(x, y);
        System.out.println(z);   
    }
}
//find the hypotenous of a triangle using a scanner 
import java.util.Scanner;
public class walkthrough{
    public static void main(String[] args) {
        // declare variables 
        double y  ;
        double x  ;
        double z  ;
        // declare scanner?
        Scanner scanner = new Scanner(System.in);
        // scan user input
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();
        // square root 
        z = Math.sqrt((x*x)+(y*y));
        // print result 
        System.out.println("The hypotenous is: "+z);
    }
}
//pseudo random code to generate random numbers
import java.util.Random;
public class walkthrough {
    public static void main(String[] args) {
        // random variable 
        Random random = new Random(); 
        //int x = random.nextInt(6)+1;
        //double y = random.nextDouble();
        boolean z = random.nextBoolean();
        // print result
        System.out.println(z);
    }
}
//IF statements 
public class walkthrough {
    public static void main(String[] args) {
        // if statement = perfroms a block of code if its condition evaluates to be true 
        int age = 75;
        if(age==75){
            System.out.println("old aaaaah");
        }
        else if(age>=18){
            System.out.println("you are an adult");
        }
        else if(age>=13){
            System.out.println("you are a teenager");
        }
        else {
            System.out.println("you are not an adult");
        }
    }
}
// Switch and case
public class walkthrough{
    public static void main(String[] args) {
        //switch = statement that allows a variable to be tested for equality against a list of values
        String day = "Monday";
        switch(day){
            case "sunday": System.out.println("It is sunday");
            break;
            case "Monday": System.out.println("It is monday");
            break;
            case "Tuesday": System.out.println("It is tuesday");
            break;
            case "Wednesday": System.out.println("It is wednesday");
            break; 
            case "Thursday": System.out.println("It is thursday");
            break; 
            case "Friday": System.out.println("It is friday");
            break; 
            case "Saturday": System.out.println("It is Saturday");
            break;   
            default: System.out.println("There is no match");
            // ^ this is if there is no match
        }
    }
}
//&& operator
        int temp = 15;

        if(temp>30){
            System.out.println("It is hot outside");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("It is warm outside");
        }
        else{
            System.out.println("it is cold outside");
        }
//|| operator 
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are plaing a game Pres q or Q to quit");
        String responce = scanner.next();

        if(responce.equals("q") || responce.equals("Q")){
            System.out.println("You quit the game");
        }
        else{
            System.out.println("you are still playing the game");
        }
// ! logical operator
import java.util.Scanner;
public class walkthrough{
    public static void main(String[] args) {
        //logical operators = used to connect two or more expressions 
        //              && = (AND) both conditions must be true
        //              || = (OR) either conditions must be true
        //              ! = (NOT) reverses boolean value of condition

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are plaing a game Pres q or Q to quit");
        String responce = scanner.next();

        if(!responce.equals("q") && !responce.equals("Q")){
            System.out.println("You quit the game");
        }
        else{
            System.out.println("you are still playing the game");
        }
    }
}
//DO and WHILE LOOP
import java.util.Scanner;
public class walkthrough{
    public static void main(String[] args) {
        //while loop = executes a block of cde as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        do{
            System.out.print("Enter our name: ");
            name = scanner.nextLine();
        }while(name.isBlank())

        System.out.println("Hello "+name);
    }
}

        //while loop = executes a block of cde as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.print("Enter our name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello "+name );


//For loop
public class walkthrough{

    public static void main(String[] args) {

        // for loop = executes a block of code a limited amount of time

        for(int i = 10; i>=0; i-=2){
            System.out.println(i);
            // i-=2 can be outside of the brackets
        }

        System.out.println("Happy new year"); 
        
    }
}
//
import java.util.Scanner;
public class walkthrough {
    public static void main(String[] args) {

    // nested loops = a loop inside of a loop 

    Scanner scanner = new Scanner(System.in);
    int rows;
    int columns;
    String symbol = "";

    System.out.println("Enter # of rows: ");
    rows = scanner.nextInt();
    System.out.println("Enter # of columns");
    columns = scanner.nextInt();
    System.out.println("Enter symbol to use: ");
    symbol = scanner.next();

    for(int i=1; i<=rows;i++){
        System.out.println();
        for(int j=1; j<=columns; j++){
            System.out.print(symbol+"");

        }
    }
    }
}

//arrays
public class walkthrough {
    public static void main(String[] args) {
        
        String[] cars = new String[4];

        cars[0] = "Holden";
        cars[1] = "Ford";
        cars[2] = "BMW";
        cars[3] = "Mazda";

        //System.out.println(cars[2]);

        for(int i=0; i<cars.length; i++ ){
            System.out.println(cars[i]);

        }
    }
}
        //array = used to store multiple values in a single variable

        //String[] cars ={"Commodore", "Falcon", "Rs3"};
        
        //cars[0] = "Mustang";
        //System.out.println(cars[1]);

//2D arrays 
public class walkthrough{
    public static void main(String[] args) {
        //2D array = an array f arrays

       String[][] cars = {
        {"camaro", "Corvette", "Silverado"},
        {"Mustang","Ranger","Dodge"},
        {"Ferrari","Lamborghini","Mclarren"}
       };
      //  cars[0][0] = "Camaro";
      //  cars[0][1] = "Corvette";
      //  cars[0][2] = "Silverado";
      //  cars[1][0] = "Mustang";
      //  cars[1][1] = "Ranger";
      //  cars[1][2] = "Dodge";
      //  cars[2][0] = "Lamborghini";
      //  cars[2][1] = "Ferrari";
      //  cars[2][2] = "Mclaren";

        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.println(cars[i] [j]+"");
            }
        }
    }
}

public class walkthrough {

    public static void main(String[] args) {
        //String = a reference data type that can store one or more characters
        //           reference data types have access to useful methods

        String name = "bro";

        //boolean result = name.equalsIgnoreCase("Bro");
        //int result= name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("B")
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        //String result = name.replace('o','a');
        
        System.out.println(result);       
    }
}

// import java.util.Arrays; 
// import java.util.*; 
import java.util.Iterator;
import java.util.LinkedList; 
// import java.util.Iterator; 
// import java.util.Collections; 
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
    System.out.println(" Size: " + lowToHigh.size());
    }
} 

/*
 * In computer science, a linked list is a linear collection of data elements whose order is not given by their 
 * physical placement in memory. Instead, each element points to the next. It is a data structure consisting of a 
 * collection of nodes which together represent a sequence
 */

public class Practice {
    public static void main(String[] args){
        int number = 0;
        double value = 5;
        String word = "Hello World";
        System.out.println(isEven(number));
        System.out.println(squaredSum(value));
        System.out.println(vowels(word));

        // Employee object methods and cool stuff :^)
        Employee employee1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
        Employee employee2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);
        System.out.println("\nEmployee Details:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();
        employee1.raiseSalary(8);
        employee2.raiseSalary(12);
        System.out.println("\nAfter raising salary:");
        System.out.println("\n8% for 'Franziska Waltraud':");
        employee1.printEmployeeDetails();
        System.out.println("\n12% for 'Hubertus Andrea':");
        employee2.printEmployeeDetails();
    }
    // Prove that a number is even (check the end of the bit, if it ends in 1 its off and 0 its even)
    public static boolean isEven(int value) {
        return (value & 1) == 0;
    }
    // Squared number of everything lower than the inputted number
    public static double squaredSum(double value){
        // even numbers = new ArrayList [while true do {i = 0; i++ };]
        double result = 0;
        for(double i = 0; i <= value; i++){
            double square = Math.pow(i, 2);
            result += square;
        }
        // return outside the loop dummy
        return result;
    }
    // Count the number of vowels in a character
    public static int vowels(String word){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' 
            || word.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}

//2D aray list
import java.util.*;
public class JavaCourse {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> GroceryList = new ArrayList<>();
        
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Pasta");
        bakeryList.add("bread");
        bakeryList.add("donut");

        ArrayList<String> MeatList = new ArrayList();
        MeatList.add("Steak");
        MeatList.add("Lamb");
        MeatList.add("donut");

        ArrayList<String> DrinkList = new ArrayList();
        DrinkList.add("Soda");
        DrinkList.add("Cola");
        DrinkList.add("Sprite");

        GroceryList.add(MeatList);
        GroceryList.add(bakeryList);
        GroceryList.add(DrinkList);

        System.out.println(GroceryList);
    }
}

//arrayList
import java.util.ArrayList;
public class JavaCourse {
    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Pizza1");
        food.add("Pizza2");

        food.set(0, "Pizza4");
        food.remove(2);

        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }

    }
    
}

//For each
import java.util.ArrayList;

public class JavaCourse {
    public static void main(String[] args) {

        //for-each = traversing technique to iterate through the elements in an array/collection
        // less steps , more readable 
        //less flexible 

        //String[] animals = {"cat", "dog", "rat"};

        ArrayList<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");

        for(String i : animals) {
            System.out.println(i);
        }
        
    }
}


//method 
public class JavaCourse {
    public static void main(String[] args) {

        //method = a block of code that is executed whenever t is called upon
        //modifier defines the access type of the method
        //public: accessible in all classes in the application 
        //protected: it is accessible within the class in which it is defined 
        //private: it is accessible only within the class in which it is defined 
        //default: it is declared/defined without using any modifier

        //return type: the data type of the value returned by the method or void if does not return a value 
        //Method name: the rules for field names apply to method names as well, but the convention is a little different, mandatory in syntax
        //parameter list: comma-separated list of the input parameters is defined, preceeded by their data type, within the enclosed parethesis
        //Exception List: The exceptions you expect by the method can throw, ou can specify these exception(s) optional in syntax 
        //Method body: it is enclosed between braces. the code you need to be executed to perform our intended operations

        //<access_modifier> <return_type> <method_name>( list_of_parameters)
        //body
        
    }

    //inside the method you can declare the data type if you call the method in the from of a String or Integer
    static void hello() {
        System.out.println("Hello");
    }
}


// overloaded methods
public class JavaCourse {

    public static void main(String[] args) {
        
        // overloaded methods = methods that share the same name but have different parameters
        //                      method name + parameters = method signature  
        
        int x = add(1,2, 3, 4);
        System.out.println(x);
    }
    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
}
}
