import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int position = 3; // Delete element at position 3 (from top)

        Stack<Integer> temp = new Stack<>();

        // Move elements above the position to temp stack
        for (int i = 1; i < position; i++) {
            temp.push(stack.pop());
        }

        // Delete the element
        System.out.println("Deleted Element: " + stack.pop());

        // Put elements back
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        System.out.println("Stack after deletion: " + stack);
        System.out.println("Complexity is O(n) because we are using stack and each element is pushed and popped at most once");
    }
}