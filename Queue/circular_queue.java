  import java.util.*;
public class circular_queue{
    static int arr[];
    static int size;
    static int rear;
    static int front;
    circular_queue(int  n){
        arr=new int[n];
        rear=-1;
        front=-1;
        size=n;
    }

    public static boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public static boolean isFull(){
        return (rear+1)%size==front;
    }

    public void add(int value){
        if(isFull()){
            System.out.print("Queue is full");
            return;
        }
        if(front==-1 && rear==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=value;

    }
    public int dequeue(){
        if(isEmpty()){
            System.out.print("The queue is empy");
            return -1;
        }
        int value=arr[front];
        if(front==rear){
            front=rear=-1;
        }else{
            front=(front+1)%size;
        }
        return value;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.print("Quwuw is empty");
            return -1;
        }
        return arr[front];
    }
    public static void main(String[] args){
       circular_queue q=new circular_queue(5);
        q.add(2);
        q.add(3);
        q.add(8);
        while(!q.isEmpty()){
            System.out.print(q.peek());
            q.dequeue();
        }
    }
}