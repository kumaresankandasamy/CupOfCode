package interview.queue;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<Integer> data;
    private  int p_start;
    public Queue(){
        data = new ArrayList<Integer>();
        p_start = 0;
    }
    public boolean enqueue(int x){
        data.add(x);
        return  true;
    }
    public boolean dequeue(){
        if(isEmpty() == true){
            return false;

        }
        p_start++;
        return true;
    }

    private boolean isEmpty() {
        return p_start >= data.size();
    }
    public int peek(){
        return data.get(p_start);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(8);
        if(queue.isEmpty() == false){
            System.out.println(queue.peek());
        }
        queue.enqueue(6);
        if(queue.isEmpty() == false){
            System.out.println(queue.peek());
        }
        queue.enqueue(5);
        if(queue.isEmpty() == false){
            System.out.println(queue.peek());
        }
    }

}
