package telusko;

import java.util.Arrays;
import java.util.Optional;

public class Queue {

    private int front;
    private int rear;
    private int size;
    private int[] arr;

    public Queue() {
        front = 0;
        rear = -1;
        size = 0;
        arr = new int[4];
    }

    public void enqueue(int data) {
      if(!isFull()) {
          rear = (rear + 1) % arr.length;
          arr[rear] = data;
          size++;
      }
    }

    public int dequeue() {
      if(!isEmpty()) {
          int data = arr[front];
          front = (front + 1) % arr.length;
          size--;
         return data;
      }else {
         throw new IllegalStateException("Queue is empty");
      }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    @Override
    public String toString() {
        StringBuilder bs = new StringBuilder();
        bs.append("[");
        for(int i = front; i < size; i++) {
            bs.append(i != front ? ", ":  "" );
            bs.append(arr[i]);
        }
        bs.append("]");
        return  bs.toString();
    }

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue);

        System.out.println(queue.dequeue());
        queue.enqueue(50);

        System.out.println(queue);

        System.out.println(queue.dequeue());
        queue.enqueue(60);
        System.out.println(queue);
    }
}
