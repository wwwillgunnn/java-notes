package Tutorials;
import java.io.File;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class tut6 {
    public static void main(String[] args){
        System.out.println("Peep this weeks tutorial!");        
    }

    // read names from a file
    public static void Exercise1(String a[]){
    File file = new File("/home/students/");
    String[] fileList = file.list();
    for(String name:fileList){
        System.out.println(name);
        }   
    }
    // checking the existence of the file directory
    public static void Exercise2(String[] args){
        // Create a File object
        File my_file_dir = new File("/home/students/xyz.txt");
        if (my_file_dir.exists()){
        System.out.println("The directory or file exists.\n");
            }
        else{
        System.out.println("The directory or file does not exist.\n");
            }
    }
    // printing the file size of the inputted file 
    public static void Exercise3(String[] args){
        File file = new File("/home/students/test.txt");
        if(file.exists()){
        System.out.println(filesize_in_Bytes(file));
        System.out.println(filesize_in_kiloBytes(file));
        System.out.println(filesize_in_megaBytes(file));
            }
        else
        System.out.println("File doesn't exist");
        }
        private static String filesize_in_megaBytes(File file) {
            return (double) file.length()/(1024*1024)+" mb";
        }
        private static String filesize_in_kiloBytes(File file) {
            return (double) file.length()/1024+" kb";
        }
        private static String filesize_in_Bytes(File file) {
            return file.length()+" bytes";
        }
    // reading every line of the file
    public static void Exercise4(String a[]){
        BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader( new
            FileReader("/home/students/test.txt"));
            while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
    // store text file content line by line in an array 
    public static void Exercie5(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new
            FileReader("/home/students/test.txt"));
            while (strLine != null){
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine==null)
                    break;
                list.add(strLine);
            }
        System.out.println(Arrays.toString(list.toArray()));
        br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }  
    // Append text to an existing file  
    public static void Exercise6(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try{
            String filename= "/home/students/myfile.txt";
            FileWriter fw = new FileWriter(filename,true);
            //appends the string to the file
            fw.write("Java Exercises\n");
            fw.close();
            BufferedReader br = new BufferedReader(new
            FileReader("/home/students/myfile.txt"));
            //read the file content
            while (strLine != null){
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch(IOException ioe){
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
    // Read the irst 3 lines of the file 
    public static void Exercise7(String a[]){
        BufferedReader br = null;
        String strLine = "";
        try {
            LineNumberReader reader = new LineNumberReader(new
            InputStreamReader(new FileInputStream("/home/students/test.txt"), "UTF-8"));
            while (((strLine = reader.readLine()) != null) &&
            reader.getLineNumber() <= 3){
            System.out.println(strLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
// for this part have it in a different file 
// create a sorting algorithm
public class SelectionSort {
    public static void sort(int[] nums){
        for(int currentPlace = 0;currentPlace<nums.length-1;currentPlace++){
            int smallest = Integer.MAX_VALUE;
            int smallestAt = currentPlace+1;
        for(int check = currentPlace; check<nums.length;check++){
            if(nums[check]<smallest){
                smallestAt = check;
                smallest = nums[check];
            }
        }
        int temp = nums[currentPlace];
        nums[currentPlace] = nums[smallestAt];
        nums[smallestAt] = temp;
        }
    }
    // Method to test above   
    public static void Exercise8(String args[]){
        SelectionSort ob = new SelectionSort();
        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        ob.sort(nums);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(nums));
    }    
}