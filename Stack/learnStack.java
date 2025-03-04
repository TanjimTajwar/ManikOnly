package Stack;
import java.util.Stack; // Stack ক্লাস ইমপোর্ট

public class learnStack {
    public static void main(String[] args) {
        // একটি নতুন Stack তৈরি করা হলো
        Stack<Integer> myStack = new Stack<>();

        // Stack-এ Elements Push করা হচ্ছে
        myStack.push(66);
        myStack.push(68);
        myStack.push(69);
        myStack.push(72);
        myStack.push(76);

        System.out.println("After Push Operation: " + myStack);

        // Stack থেকে একটি Element Pop করা হচ্ছে (Top Element Remove হবে)
        myStack.pop();
        System.out.println("After Pop Operation (top element removed): " + myStack);
    }
}
