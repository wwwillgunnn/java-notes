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
