package Queue;

public interface Queue {

    boolean isEmpty();
    boolean isFull();

    void enQueue(Object obj);
    Object dequeue();

    void printQueue();


}
