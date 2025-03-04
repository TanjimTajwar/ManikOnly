// প্যাকেজ ঘোষণা করা হচ্ছে, কোডকে 'Queue' নামে গ্রুপের অন্তর্ভুক্ত করা হচ্ছে  
package Queue;

// LinkedList এবং Queue ক্লাস ইমপোর্ট করা হচ্ছে  
import java.util.LinkedList;  
import java.util.Queue;  

// 'EasyQueue' নামে একটি পাবলিক ক্লাস ঘোষণা করা হচ্ছে  
public class EasyQueue {
    // মেইন মেথড যা প্রোগ্রামের এন্ট্রি পয়েন্ট হিসেবে কাজ করবে  
    public static void main(String CSECU[]) {
        // একটি নতুন Queue ডিক্লেয়ার করা হচ্ছে যেখানে Integer মান সংরক্ষণ করা হবে  
        Queue<Integer> myQueue = new LinkedList<>();

        // Queue তে উপাদান যোগ করা হচ্ছে (এনকিউ অপারেশন)  
        myQueue.add(66);  // 66 যোগ করা হলো  
        myQueue.add(68);  // 68 যোগ করা হলো  
        myQueue.add(69);  // 69 যোগ করা হলো  
        myQueue.add(72);  // 72 যোগ করা হলো  
        myQueue.add(76);  // 76 যোগ করা হলো  

        // এনকিউ অপারেশনের পরে Queue প্রিন্ট করা হচ্ছে  
        System.out.println("After Enqueue Operation: " + myQueue);

        // Queue থেকে প্রথম উপাদান সরানো হচ্ছে (ডিকিউ অপারেশন)  
        myQueue.remove(); // প্রথম উপাদান 66 সরানো হলো  

        // ডিকিউ অপারেশনের পরে Queue প্রিন্ট করা হচ্ছে  
        System.out.println("After Dequeue Operation only first element will be removed: " + myQueue);
    }
}
