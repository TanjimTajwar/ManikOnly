package Recursion;
import java.util.Scanner; // ইউজার ইনপুট নেওয়ার জন্য Scanner ইমপোর্ট  

public class simpleRecursion {  
    public static void main(String CSECU[]) {  
        Scanner Arnab = new Scanner(System.in);  

        // ইউজার ইনপুট নিচ্ছে কতবার "Manik" প্রিন্ট হবে  
        System.out.print("Tell me the number of times you want to print Manik: ");  
        int number = Arnab.nextInt();  
        
        Arnab.close(); // Scanner বন্ধ করা হচ্ছে  

        recursionCall(number); // Recursive function call  
    }  

    // Recursive Function: "Manik" প্রিন্ট করা  
    public static void recursionCall(int number) {  
        if (number == 0) { // Base Case: যদি সংখ্যা ০ হয়, তাহলে রিকারশন বন্ধ  
            return;  
        }  

        System.out.println("Manik"); // "Manik" প্রিন্ট  

        recursionCall(number - 1); // সংখ্যাকে ১ কমিয়ে আবার Recursive Call  
    }  
}
