package Stack;

import java.util.ArrayList;

public class Stackinheritance extends ArrayList<Object> {

    private int capacity=10;

    public void push(Object obj){

        if(super.size()!=capacity){
            super.add(obj);
        }else
            {
            System.out.println("A verem tele van");
        }
    }
}
