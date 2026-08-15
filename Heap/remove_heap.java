import java.util.*;
public class remove_heap{
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;
            while(arr.get(x)<arr.get(par)){
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par=(x-1)/2;    
            }
        }
        public void peek(){
            System.out.println(arr.get(0));
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;

            if(left<arr.size() && arr.get(minidx)>arr.get(left)){
                minidx=left;
            }
            if(right<arr.size() && arr.get(minidx)>arr.get(right)){
                minidx=right;
            }
            if(minidx!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);
                heapify(minidx);
            }
        }
        public int remove(){
            int data=arr.get(0);
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            arr.remove(arr.size()-1);
            heapify(0);
            return data;
        }


    }
    public static void main(String args[]){
        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        h.add(2);
        while(h.arr.size()>0){
            System.out.println(h.remove());
        }
    }
}