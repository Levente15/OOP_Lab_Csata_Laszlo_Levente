package Queue;

import java.util.ArrayList;

public class ArrayListQueue implements  Queue {

    private ArrayList<Object> items;
    private final int CAPACITY;


    public ArrayListQueue(int capacity) {
        this.CAPACITY = capacity;
        this.items = new ArrayList<>(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return this.items.size() == 0;
    }

    @Override
    public boolean isFull() {
        return this.items.size() == this.CAPACITY;
    }

    @Override
    public void enQueue(Object obj) {
        if (!isFull())
            this.items.add(obj);
    }

    @Override
    public Object dequeue() {
        if (!this.isEmpty()) {
            Object o = this.items.get(0);
            this.items.remove(0);
            return o;
        }
        return null;
    }

    @Override
    public void printQueue() {
        for (int i = 0; i < this.items.size(); i++)
            System.out.println(this.items.get(i) + " ");
        System.out.println();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ArrayListQueue))
            return false;

        ArrayListQueue that = (ArrayListQueue) obj;

        if (this.items.size() != this.items.size())
            return false;

        for (int i = 0; i < this.items.size(); i++)
            if (this.items.get(i) != that.items.get(i))
                return false;

        return true;

    }
}
