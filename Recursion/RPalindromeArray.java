
package Recursion;
import java.util.Scanner; // ইউজার ইনপুট নেওয়ার জন্য Scanner ইমপোর্ট  

public class RPalindromeArray {  
    public static int[] arr; // ইনপুট অ্যারে  
    public static int n; // অ্যারের সাইজ  

    public static void main(String CSECU[]) {  
        Scanner Arnab = new Scanner(System.in);  
        n = Arnab.nextInt(); // অ্যারের সাইজ ইনপুট  

        arr = new int[n]; // অ্যারে ডিক্লেয়ার  

        for (int a = 0; a < n; a++) {  
            arr[a] = Arnab.nextInt(); // ইউজার থেকে অ্যারের এলিমেন্ট ইনপুট  
        }  

        // Recursive function call করে Palindrome চেক করা হচ্ছে  
        if (isPalindrome(0)) {  
            System.out.println("Yes"); // Palindrome হলে "Yes" প্রিন্ট  
        } else {  
            System.out.println("No"); // না হলে "No" প্রিন্ট  
        }  

        Arnab.close(); // Scanner বন্ধ করা হচ্ছে  
    }  

    // Recursive Function: Palindrome চেক করা  
    public static boolean isPalindrome(int a) {  
        if (a >= n / 2) { // Base Case: যদি অর্ধেক পার হয়, তাহলে এটি Palindrome  
            return true;  
        }  

        if (arr[a] != arr[n - a - 1]) { // সামনের এবং পিছনের সংখ্যা মিলছে কিনা চেক  
            return false;  
        }  

        return isPalindrome(a + 1); // সামনের index বাড়িয়ে আবার Recursive Call  
    }  
}


/*
 Problem Link: https://codeforces.com/group/MWSDmqGsZm/contest/223339/problem/R
 */