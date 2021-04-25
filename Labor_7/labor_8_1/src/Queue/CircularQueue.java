package Queue;

import java.util.ArrayList;

public class CircularQueue implements Queue {
    private int CAPACITY;
    private int front, rear;
    private Object items[];

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[CAPACITY];
    }

    @Override
    public boolean isEmpty() {
        return this.items.length == this.CAPACITY;
    }

    @Override
    public boolean isFull() {
        return this.items.length == 0;
    }

    @Override
    public void enQueue(Object obj) {

    }

    @Override
    public Object dequeue() {

        Object tmp = null;
        if (!isEmpty()) {
            tmp = this.items[this.front];

            for (int i = 0; i < this.CAPACITY - 1; i++)
                this.items[i] = this.items[i + 1];

            rear--;
        }
        return tmp;
    }

    @Override
    public void printQueue() {
        for (int i = 0; i < this.items.length; i++)
            System.out.println(this.items[i] + " ");
        System.out.println();
    }
}