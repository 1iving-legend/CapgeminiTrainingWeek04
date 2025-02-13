package queue_interface.stackusingqueue;

import java.util.*;

 class StackUsingQueue {

    Queue<Integer> queue1= new LinkedList<>();
    Queue<Integer> queue2= new LinkedList<>();

    public void push(int x)
    {
        queue1.add(x);
        while(!queue2.isEmpty())
        {
            queue1.add(queue2.remove());
        }

        Queue<Integer> temp=queue2;
        queue2=queue1;
        queue1=temp;
    }

    public int pop()
    {
        if(queue2.isEmpty())
        {
            System.out.println("buffer underflow");
        }

            return queue2.poll();

    }

    public int peek()
    {
        if(queue2.isEmpty())
        {
            System.out.println("buffer underflow");
        }

        return queue2.peek();
    }

}

