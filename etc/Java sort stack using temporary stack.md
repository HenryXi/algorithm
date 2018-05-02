# Java sort stack using temporary stack
In this page I will show you how to sort a stack by using a temporary stack. The key step of sorting is make sure that push
items into temporary stack in order. The code is here.
```java
public class SortStackClient {
    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> originalStack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            originalStack.push(random.nextInt(100));
        }
        System.out.println("original stack:\t" + originalStack);
        Stack<Integer> orderedStack = sortStack(originalStack);
        System.out.println("ordered stack:\t" + orderedStack);
    }

    private static Stack<Integer> sortStack(Stack<Integer> originalStack) {
        Stack<Integer> tempStack = new Stack<>();
        while (true) {
            if (originalStack.isEmpty()) {
                moveAllItemToAnother(tempStack, originalStack);
                return originalStack;
            }
            if (tempStack.isEmpty()) {
                tempStack.push(originalStack.pop());
                continue;
            }
            int current = originalStack.pop();
            int top = tempStack.peek();
            if (current > top) {
                moveAllItemToAnother(tempStack, originalStack);
            }
            tempStack.push(current);
        }
    }

    private static void moveAllItemToAnother(Stack<Integer> fromStack, Stack<Integer> toStack) {
        while (true) {
            if (fromStack.isEmpty()) {
                return;
            }
            toStack.push(fromStack.pop());
        }
    }
}
```
The output
```
original stack:	[64, 0, 56, 31, 39, 20, 4, 62, 96, 78]
ordered stack:	[0, 4, 20, 31, 39, 56, 62, 64, 78, 96]
```

EOF