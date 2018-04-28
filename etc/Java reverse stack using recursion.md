# Java reverse stack using recursion
The key step of reversing stack by using recursion is implementing the method `popBottom`. If we can pop an item from bottom
of stack, then we can reverse a stack with two items.
```
        |    2   |                      |         |                    |    1    |
        |    1   |  pop from bottom ->  |    2    |  push at head ->   |    2    |
```
If we can reverse a stack with two items, then we can reverse any stacks no matter how many items it contains. The code 
is here. Enjoy~
```java
public class ReverseStackClient {
    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(random.nextInt(10));
        }
        System.out.println("current stack:" + stack);
        System.out.println("reverse");
        reverse(stack);
        System.out.println("current stack:" + stack);
    }

    private static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int last = popBottom(stack);
        reverse(stack);
        stack.push(last);
    }

    private static int popBottom(Stack<Integer> stack) {
        Integer top = stack.pop();
        if (stack.isEmpty()) {
            return top;
        } else {
            int last = popBottom(stack);
            stack.push(top);
            return last;
        }
    }
}
```

EOF