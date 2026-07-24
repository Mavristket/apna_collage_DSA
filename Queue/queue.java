import java.util.*;
public class queue{
    static int arr[];
    static int size;
    static int rear;
    queue(int  n){
        arr=new int[n];
        rear=-1;
        size=n;
    }

    public static boolean isEmpty(){
        return rear==-1;
    }

    public void add(int value){
        if(rear==size-1){
            System.out.print("Queue is full");
            return;
        }
        rear+=1;
        arr[rear]=value;

    }
    public int dequeue(){
        if(isEmpty()){
            System.out.print("The queue is empy");
            return -1;
        }
        int value=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return value;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.print("Quwuw is empty");
            return -1;
        }
        return arr[0];
    }
    public static void main(String[] args){
       queue q=new queue(5);
        q.add(2);
        q.add(3);
        q.add(8);
        while(!q.isEmpty()){
            System.out.print(q.peek());
            q.dequeue();
        }
    }
}