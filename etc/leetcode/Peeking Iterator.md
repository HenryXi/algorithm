# Peeking Iterator
[Problem Description](https://leetcode.com/problems/peeking-iterator/)

```
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer next;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        this.next = iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer ret = next;
        next = iterator.hasNext() ? iterator.next() : null;
        return ret;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 4 ms | 38.4 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF