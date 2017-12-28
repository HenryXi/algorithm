# Java find nth Fibonacci number example
There are two ways to find nth Fibonacci number: recursion and loop. Recursion is easy to write but is inefficient.
Loop is not easy to write but efficient.

**Recursion(Not recommend)**
```java
public class FibonacciByRecursionClient {
    public static void main(String[] args) {
        System.out.println(getFibonacci(4));
    }

    private static int getFibonacci(int index) {
        if (index <= 0) {
            return -1;
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        return getFibonacci(index - 2) + getFibonacci(index - 1);
    }
}
```
**Loop**
```java
public class FibonacciByLoopClient {
    public static void main(String[] args) {
        System.out.println(getFibonacci(17));
    }

    public static int getFibonacci(int index) {
        if (index <= 0) {
            return -1;
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        //1 1 2 3 5 8 13 21 34 55
        //1 2 3 4 5 6 7  8  9  10
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 2; i < index; i++) {
            c = a + b;
            if (i == index - 1) {
                break;
            }
            a = b;
            b = c;
        }
        return c;
    }
}
```

**Summary**

Get nth Fibonacci number in loop is not very difficult. Define `b` as preview number and `a` as the preview of
`b` and `c` the nth Fibonacci. After every loop moving `a` and `b` to next number.

EOF