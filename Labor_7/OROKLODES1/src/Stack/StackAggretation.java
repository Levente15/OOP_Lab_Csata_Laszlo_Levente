package Stack;

import java.util.ArrayList;

public class StackAggretation {

    private ArrayList<Object> item;
    private final int capacity;

    public StackAggretation( int capacity) {
        this.capacity = capacity;
        item=new ArrayList<>(capacity);
    }

    public boolean isEmpty(){
        if(item.size()==0){
            return true;
        }
        return false;
    }
    public int getSize(){
        return this.item.size();
    }
    public boolean isFull(){
        return item.size()==capacity;
    }
    public void push(Object obj){

        if(!(isFull())){
            item.add(obj);
        }else {
            System.out.println("A verem tele van");
        }
    }
    public Object top(){
        if(!isEmpty()) {
            return item.get(getSize()-1);
        }
        return 0;
    }
    public void pop(){
        if(!isEmpty()) {
            item.remove(getSize()-1);
        }
        return ;
    }
}
