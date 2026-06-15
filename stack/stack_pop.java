import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> reverseStack = new Stack<>();

        // Push elements into original stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Original Stack: " + stack);

        // Reverse the stack
        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }

        System.out.println("Reversed Stack: " + reverseStack);
        System.out.println("Original Stack after reversal: " + stack);
    }
}