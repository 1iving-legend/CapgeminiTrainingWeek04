package queue_interface.stackusingqueue;

public class Main{
    public static void main(String[] args) {
        StackUsingQueue stack1= new StackUsingQueue();
        stack1.push(10);
        stack1.push(12);
        stack1.push(17);
        stack1.push(82);
        stack1.pop();
        System.out.println(stack1.peek());
        stack1.push(90);
        stack1.push(72);
        stack1.pop();
        System.out.println(stack1.peek());
        stack1.push(16);
        stack1.push(165);
        
    }
}
