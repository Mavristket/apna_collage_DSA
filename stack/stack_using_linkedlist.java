public class stack_using_linkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class stack{
        Node head=null;
        public boolean isempty(){
            if(head==null){
                return true;
            }
            return false;
        }
        public void push(int value){
            Node newNode=new Node(value);
            if(isempty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        public int pop(){
            if(isempty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
    }
    public static void main(String[] args){
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        while(!s.isempty()){
            System.out.println(s.pop());
        }
    }
}