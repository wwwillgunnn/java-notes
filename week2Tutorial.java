public class week2Tutorial {
    public static void main(String[] args){
        int number = 0;
        double value = 5;
        String word = "Hello World";
        System.out.println(isEven(number));
        System.out.println(squaredSum(value));
        System.out.println(vowels(word));
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
