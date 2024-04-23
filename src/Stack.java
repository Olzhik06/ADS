import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public void push(int item) {
        this.items.add(item);
    }

    public int pop() {
        if (!isEmpty()) {
            return this.items.remove(this.items.size() - 1);
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public void reverse() {
        if (!isEmpty()) {
            int top = pop();
            reverse();
            insertAtBottom(top);
        }
    }

    public void insertAtBottom(int item) {
        if (isEmpty()) {
            push(item);
        } else {
            int top = pop();
            insertAtBottom(item);
            push(top);
        }
    }

    public static void main(String[] args) {
        // Example usage
        Stack stack = new Stack();
        int[] inputList = {9, 1, 3, 5, 7};
        for (int num : inputList) {
            stack.push(num);
        }

        stack.reverse();

        System.out.print("Reversed Stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}