import java.util.ArrayList;
public class operations{
    public static class stack{
        ArrayList<Integer> list=new ArrayList<>();
        public boolean isempty(){
            if(list.size()==0){
                return true;
            }
            return false;
        }
        public int peek(){
            if(isempty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            if(isempty()){
                return -1;
            }
            return list.remove(list.size()-1);
        }
    }
    public static void main(String[] args){
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}