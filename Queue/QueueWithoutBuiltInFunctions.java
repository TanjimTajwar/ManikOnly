// প্যাকেজ ঘোষণা করা হচ্ছে, কোডকে 'Queue' নামে একটি গ্রুপের অন্তর্ভুক্ত করা হচ্ছে  
package Queue;

// বিল্ট-ইন ফাংশন ব্যবহার না করে নিজস্ব Queue ইমপ্লিমেন্ট করা হচ্ছে  
class QueueWithoutBuiltInFunctions {

    // Node ক্লাস তৈরি করা হয়েছে, যা Queue-এর প্রতিটি উপাদানকে প্রতিনিধিত্ব করবে  
    static class Node {
        int data;  // উপাদান সংরক্ষণের জন্য ভেরিয়েবল  
        Node next; // পরবর্তী নোডের রেফারেন্স রাখবে  

        // কনস্ট্রাক্টর: নতুন নোড তৈরি করার সময় ডাটা সেট করা হচ্ছে  
        Node(int data) {
            this.data = data;
            this.next = null;  // শুরুতে পরবর্তী নোড থাকবে না  
        }
    }

    // Queue-এর ফ্রন্ট (সামনের) এবং রিয়ার (শেষের) পয়েন্টার  
    private Node front;
    private Node rear;

    // কনস্ট্রাক্টর: Queue ইনিশিয়ালাইজ করা হচ্ছে, শুরুতে ফ্রন্ট এবং রিয়ার ফাঁকা থাকবে  
    public QueueWithoutBuiltInFunctions() {
        front = rear = null;
    }

    // মেথড: Queue-তে নতুন উপাদান যোগ করা (Enqueue অপারেশন)  
    public void enqueue(int data) {
        Node newNode = new Node(data); // নতুন নোড তৈরি করা হলো  
        if (rear == null) {  // যদি Queue ফাঁকা থাকে  
            front = rear = newNode; // নতুন নোডই ফ্রন্ট ও রিয়ার হবে  
        } else {
            rear.next = newNode;  // আগের রিয়ারের পর নতুন নোড যোগ করা হচ্ছে  
            rear = newNode;       // নতুন নোডকে রিয়ার হিসেবে সেট করা হচ্ছে  
        }
    }

    // মেথড: Queue থেকে প্রথম উপাদান সরানো (Dequeue অপারেশন)  
    public void dequeue() {
        if (front == null) { // যদি Queue ফাঁকা হয়  
            System.out.println("Queue is empty."); // মেসেজ প্রিন্ট  
            return;
        }
        front = front.next; // ফ্রন্টকে এক ধাপ সামনে সরানো হচ্ছে  
        if (front == null) { // যদি Queue ফাঁকা হয়ে যায়  
            rear = null;  // রিয়ারকেও null করে দেওয়া হচ্ছে  
        }
    }

    // মেথড: Queue-এর প্রথম উপাদান (ফ্রন্ট) দেখা  
    public void peek() {
        if (front != null) { // যদি Queue ফাঁকা না হয়  
            System.out.println("Front element is: " + front.data); // ফ্রন্ট উপাদান দেখানো হচ্ছে  
        } else {
            System.out.println("Queue is empty."); // Queue ফাঁকা হলে মেসেজ প্রিন্ট  
        }
    }

    // মেথড: Queue-এর সকল উপাদান প্রিন্ট করা  
    public void printQueue() {
        if (front == null) { // যদি Queue ফাঁকা হয়  
            System.out.println("Queue is empty."); // মেসেজ প্রিন্ট  
            return;
        }
        Node current = front; // সাময়িক নোড ভেরিয়েবল নিয়ে লুপ চালানো হবে  
        System.out.print("Queue: ");
        while (current != null) { // যতক্ষণ Queue-তে উপাদান আছে  
            System.out.print(current.data + " "); // প্রতিটি উপাদান প্রিন্ট করা হচ্ছে  
            current = current.next; // পরবর্তী নোডে যাওয়া হচ্ছে  
        }
        System.out.println(); // নতুন লাইন  
    }

    // মেইন মেথড: Queue অপারেশনগুলো টেস্ট করার জন্য  
    public static void main(String[] args) {
        QueueWithoutBuiltInFunctions queue = new QueueWithoutBuiltInFunctions(); // Queue অবজেক্ট তৈরি  

        // Queue-তে কিছু উপাদান যোগ করা হচ্ছে  
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue(); // Queue প্রিন্ট করা হচ্ছে  

        // Queue-এর প্রথম উপাদান দেখা (peek)  
        queue.peek();

        // Queue থেকে একটি উপাদান সরানো (dequeue)  
        queue.dequeue();
        queue.printQueue(); // Queue আবার প্রিন্ট করা হচ্ছে  

        // Queue-এর নতুন প্রথম উপাদান দেখা (peek)  
        queue.peek();
    }
}
