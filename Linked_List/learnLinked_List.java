// প্যাকেজ ঘোষণা, কোডকে 'Linked_List' নামে একটি গ্রুপের অন্তর্ভুক্ত করা হচ্ছে  
package Linked_List;

// জাভার কালেকশন ফ্রেমওয়ার্ক থেকে LinkedList ক্লাস ইমপোর্ট করা হচ্ছে  
import java.util.LinkedList;

// 'learnLinked_List' নামে একটি পাবলিক ক্লাস ডিক্লেয়ার করা হচ্ছে  
public class learnLinked_List {
    // মেইন মেথড - এটি প্রোগ্রামের এন্ট্রি পয়েন্ট  
    public static void main(String[] args) {
        // একটি নতুন LinkedList তৈরি করা হচ্ছে যেখানে Integer সংখ্যা সংরক্ষণ করা হবে  
        LinkedList<Integer> myList = new LinkedList<>();

        // LinkedList-এ উপাদান (Element) যোগ করা হচ্ছে, যা স্বাভাবিকভাবেই লিস্টের শেষে যুক্ত হয়  
        myList.add(66);  // 66 সংখ্যা যোগ করা হলো  
        myList.add(68);  // 68 সংখ্যা যোগ করা হলো  
        myList.add(69);  // 69 সংখ্যা যোগ করা হলো  
        myList.add(72);  // 72 সংখ্যা যোগ করা হলো  
        myList.add(76);  // 76 সংখ্যা যোগ করা হলো  

        // উপাদান যোগ হওয়ার পর LinkedList প্রিন্ট করা হচ্ছে  
        System.out.println("After Add Operation: " + myList);

        // লিস্টের শুরুতে (Head) একটি নতুন উপাদান যোগ করা হচ্ছে  
        myList.addFirst(55); // 55 সংখ্যাটি প্রথমে যোগ করা হলো  

        // শুরুতে উপাদান যোগ হওয়ার পর LinkedList প্রিন্ট করা হচ্ছে  
        System.out.println("After Add at Head (First) Operation: " + myList);

        // লিস্টের শেষে (Tail) একটি নতুন উপাদান যোগ করা হচ্ছে  
        myList.addLast(80); // 80 সংখ্যাটি শেষে যোগ করা হলো  

        // শেষে উপাদান যোগ হওয়ার পর LinkedList প্রিন্ট করা হচ্ছে  
        System.out.println("After Add Behind (Last) Operation: " + myList);

        // লিস্টের প্রথম উপাদান (Head) মুছে ফেলা হচ্ছে  
        myList.removeFirst(); // প্রথম উপাদান 55 সরানো হলো  

        // প্রথম উপাদান মুছে ফেলার পর LinkedList প্রিন্ট করা হচ্ছে  
        System.out.println("After Remove from Head Operation: " + myList);

        // লিস্টের শেষ উপাদান (Tail) মুছে ফেলা হচ্ছে  
        myList.removeLast(); // শেষ উপাদান 80 সরানো হলো  

        // শেষ উপাদান মুছে ফেলার পর LinkedList প্রিন্ট করা হচ্ছে  
        System.out.println("After Remove from Behind Operation: " + myList);
    }
}
