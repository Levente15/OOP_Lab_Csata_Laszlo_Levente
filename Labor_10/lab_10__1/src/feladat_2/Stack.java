package feladat_2;

import java.util.ArrayList;

public class Stack {

    private final ArrayList<Object> items;
    private final int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(this.capacity);
    }

    public boolean isFull() {
        return this.getSize() == this.capacity;
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public void push(Object o) throws StackException {
        if (!this.isFull())
            this.items.add(o);
        else
        throw new StackException("A verem tele van");
    }

    public Object pop() throws StackException {
        if (!this.isEmpty()) {
            Object o = this.items.get(this.getSize() - 1);
            this.items.remove(this.getSize() - 1);
            return o;
        }
       throw new StackException("A verem ures");
    }

    public Object top() throws StackException {
        if (!this.isEmpty())
            return this.items.get(this.getSize() - 1);
        throw new StackException("A verem ures");
    }

    public int getSize() {
        return this.items.size();
    }

}
