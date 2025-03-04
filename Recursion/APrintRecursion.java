// প্যাকেজ ঘোষণা করা হচ্ছে, কোডকে 'Recursion' নামে একটি গ্রুপের অন্তর্ভুক্ত করা হচ্ছে  
package Recursion;

import java.util.Scanner; // ইউজার ইনপুট নেওয়ার জন্য Scanner ইমপোর্ট করা হচ্ছে  

public class APrintRecursion { // ক্লাস ডিক্লারেশন  
    public static void main(String CSECU[]) { // মেইন মেথড শুরু  
        Scanner Arnab = new Scanner(System.in); // ইনপুট নেওয়ার জন্য Scanner অবজেক্ট তৈরি  
        int n = Arnab.nextInt(); // ইউজার থেকে একটি সংখ্যা ইনপুট নেওয়া হচ্ছে  
        printIloveRecursion(n); // Recursive ফাংশন কল করা হচ্ছে  
        Arnab.close(); // Scanner বন্ধ করা হচ্ছে  
    }

    // Recursive ফাংশন, যা 'I love Recursion' n বার প্রিন্ট করবে  
    public static void printIloveRecursion(int a) {
        if (a == 0) { // Base case: যদি a == 0 হয়, তাহলে ফাংশন শেষ হবে  
            return;
        }
        System.out.println("I love Recursion"); // "I love Recursion" প্রিন্ট করা হচ্ছে  
        printIloveRecursion(a - 1); // Recursive কল, a এক ধাপ কমিয়ে আবার ফাংশন কল করা হচ্ছে  
    }
}
