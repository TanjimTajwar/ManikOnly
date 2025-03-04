package Recursion;
import java.util.Scanner; // ইউজার ইনপুট নেওয়ার জন্য Scanner ইমপোর্ট  

public class FPrintEvenIndices {  
    public static int n; // ইনপুট অ্যারের সাইজ  
    public static int[] arr; // ইনপুট অ্যারে  

    public static void main(String[] CSECU) {  
        Scanner Arnab = new Scanner(System.in);  
        n = Arnab.nextInt(); // ইউজার থেকে অ্যারের সাইজ ইনপুট  

        arr = new int[n]; // অ্যারে ডিক্লেয়ার  

        for (int a = 0; a < n; a++) {  
            arr[a] = Arnab.nextInt(); // ইউজার থেকে অ্যারের এলিমেন্ট ইনপুট  
        }  

        // শেষ জোড় ইনডেক্স নির্ধারণ (n-1 যদি বিজোড় হয়, না হলে n-2)  
        if (n % 2 != 0) {  
            printEvenElements(n - 1);  
        } else {  
            printEvenElements(n - 2);  
        }  
        
        Arnab.close(); // Scanner বন্ধ করা হচ্ছে  
    }  

    // Recursive Method: শুধুমাত্র Even Index-এ থাকা এলিমেন্ট প্রিন্ট করবে  
    public static void printEvenElements(int a) {  
        if (a < 0) { // Base Case: যদি ইনডেক্স 0-এর নিচে চলে যায়, তাহলে রিকার্শন থেমে যাবে  
            return;  
        }  
        
        System.out.print(arr[a] + " "); // বর্তমান Even Index-এর এলিমেন্ট প্রিন্ট  
        printEvenElements(a - 2); // দুই ধাপ পেছনে গিয়ে আবার কল  
    }  
}
