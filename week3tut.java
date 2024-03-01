public class week3tut {
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
