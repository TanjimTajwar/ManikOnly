// প্যাকেজ ঘোষণা, কোডকে 'Linked_List' নামে একটি গ্রুপের অন্তর্ভুক্ত করা হচ্ছে  
package Linked_List;

// 'Linked_List_Without_build_in_Function' নামে একটি ক্লাস ডিক্লেয়ার করা হচ্ছে  
class Linked_List_Without_build_in_Function {

    // নোড ক্লাস তৈরি করা হচ্ছে যা প্রতিটি উপাদানকে উপস্থাপন করবে  
    static class Node {
        int data; // উপাদানের মান সংরক্ষণ করবে  
        Node next; // পরবর্তী নোডের রেফারেন্স সংরক্ষণ করবে  

        // কনস্ট্রাক্টর: নতুন নোড তৈরি করার সময় উপাদান সেট করবে  
        Node(int data) {
            this.data = data;
            this.next = null; // নতুন নোডের পরবর্তী রেফারেন্স শুরুতে null থাকবে  
        }
    }

    // লিংকড লিস্টের জন্য 'head' এবং 'tail' পয়েন্টার ঘোষণা করা হলো  
    private Node head;
    private Node tail;

    // কনস্ট্রাক্টর: লিংকড লিস্ট ইনিশিয়ালাইজ করা হচ্ছে  
    public Linked_List_Without_build_in_Function() {  
        head = null; // লিস্ট শুরুতে খালি  
        tail = null; // লিস্ট শুরুতে খালি  
    }

    // লিস্টের শেষে একটি নতুন উপাদান যোগ করার মেথড (add এর মতো কাজ করবে)  
    public void add(int data) {
        Node newNode = new Node(data); // নতুন নোড তৈরি  
        if (tail == null) { // যদি লিস্ট খালি থাকে  
            head = tail = newNode; // head এবং tail একই নোড পয়েন্ট করবে  
        } else {
            tail.next = newNode; // পুরনো টেইল নোডের পরবর্তী নোড সেট করা হচ্ছে  
            tail = newNode; // নতুন নোডকে tail হিসেবে সেট করা হচ্ছে  
        }
    }

    // লিস্টের শুরুতে (head) একটি উপাদান যোগ করার মেথড  
    public void addFirst(int data) {
        Node newNode = new Node(data); // নতুন নোড তৈরি  
        if (head == null) { // যদি লিস্ট খালি থাকে  
            head = tail = newNode; // head এবং tail একই হবে  
        } else {
            newNode.next = head; // নতুন নোডের পরবর্তী রেফারেন্সকে বর্তমান head বানানো হচ্ছে  
            head = newNode; // নতুন নোডকে head হিসেবে সেট করা হচ্ছে  
        }
    }

    // লিস্টের শেষে (শেষ উপাদানের পরে) নতুন উপাদান যোগ করার মেথড  
    public void addLast(int data) {
        add(data); // বিদ্যমান add মেথড ব্যবহার করে নতুন উপাদান যোগ করা হচ্ছে  
    }

    // লিস্টের প্রথম উপাদান (head) সরানোর মেথড  
    public void removeFirst() {
        if (head != null) { // যদি লিস্ট খালি না হয়  
            head = head.next; // বর্তমান head-কে পরবর্তী নোডে সরিয়ে নেয়া হচ্ছে  
            if (head == null) { // যদি লিস্ট খালি হয়ে যায়  
                tail = null; // tail-কে null সেট করা হচ্ছে  
            }
        } else {
            System.out.println("List is empty."); // যদি লিস্ট খালি থাকে  
        }
    }

    // লিস্টের শেষ উপাদান (tail) সরানোর মেথড  
    public void removeLast() {
        if (head == null) { // যদি লিস্ট খালি থাকে  
            System.out.println("List is empty.");
            return;
        }
        
        if (head == tail) { // যদি লিস্টে মাত্র একটি উপাদান থাকে  
            head = tail = null; // পুরো লিস্ট খালি করে দেওয়া হচ্ছে  
            return;
        }

        // শেষের আগের নোড খুঁজতে পুরো লিস্ট ট্রাভার্স করা হচ্ছে  
        Node current = head;
        while (current.next != tail) { // শেষের আগের নোড পর্যন্ত যাওয়া  
            current = current.next;
        }
        current.next = null; // শেষ উপাদান সরিয়ে দেওয়া হচ্ছে  
        tail = current; // নতুন টেইল সেট করা হচ্ছে  
    }

    // লিস্টের সমস্ত উপাদান প্রিন্ট করার মেথড  
    public void printList() {
        if (head == null) { // যদি লিস্ট খালি থাকে  
            System.out.println("List is empty.");
            return;
        }

        Node current = head; // লিস্ট ট্রাভার্স করার জন্য বর্তমান নোড সেট করা  
        System.out.print("Linked List: ");
        while (current != null) { // যতক্ষণ পর্যন্ত নোড থাকে  
            System.out.print(current.data + " "); // উপাদান প্রিন্ট করা  
            current = current.next; // পরবর্তী নোডে যাওয়া  
        }
        System.out.println(); // নতুন লাইন  
    }

    // মেইন মেথড - লিংকড লিস্ট অপারেশনগুলি চালানোর জন্য  
    public static void main(String[] args) {
        // Linked_List_Without_build_in_Function ক্লাসের একটি অবজেক্ট তৈরি  
        Linked_List_Without_build_in_Function list = new Linked_List_Without_build_in_Function();

        // উপাদান যোগ করা হচ্ছে  
        list.add(66);
        list.add(68);
        list.add(69);
        list.add(72);
        list.add(76);
        list.printList(); // লিস্ট প্রিন্ট  

        // লিস্টের শুরুতে উপাদান যোগ করা হচ্ছে  
        list.addFirst(55);
        list.printList(); // লিস্ট প্রিন্ট  

        // লিস্টের শেষে উপাদান যোগ করা হচ্ছে  
        list.addLast(80);
        list.printList(); // লিস্ট প্রিন্ট  

        // লিস্টের প্রথম উপাদান সরানো হচ্ছে  
        list.removeFirst();
        list.printList(); // লিস্ট প্রিন্ট  

        // লিস্টের শেষ উপাদান সরানো হচ্ছে  
        list.removeLast();
        list.printList(); // লিস্ট প্রিন্ট  
    }
}
