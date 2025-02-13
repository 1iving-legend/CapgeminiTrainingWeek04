package queue_interface.circularbuffer;

import java.util.ArrayList;
import java.util.List;

public class CircularBuffer {

    int [] array;
    int head=0;
    int tail=0;
    int size=0;
    int capacity;
    CircularBuffer(int capacity)
    {
        this.capacity=capacity;
        array= new int[capacity];
    }

    void add(int value)
    {
        array[tail]=value;
        tail= (tail+1)%capacity;

        if(size==capacity)
        {
            head= (head+1)%capacity;
        }
        else{
            size++;
        }
    }
    public List<Integer> getElements() {
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            elements.add(array[(head + i) % capacity]);
        }
        return elements;
    }

}


