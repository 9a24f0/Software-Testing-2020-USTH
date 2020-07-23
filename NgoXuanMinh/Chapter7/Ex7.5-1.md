# Ex 7.5-1

## Question

(a) We do not care which specific objects are in the queue. Consequently, there are really just four useful values for the variable elements. What are they?

(b) How many states are there?

(c) How many of these states are reachable ?

(d) Show the reachable states in a drawing.

(e) Add edges for the enQueue() and deQueue() methods. (For this assignment, ignore the exceptional returns, although you should observe that when exceptional returns are taken, none of the instance variables are modified.)

(f) Define a small test set that achieves Edge Coverage. Implement and execute this test set. You might find it helps to write a method that shows the internal variables at each call. 


Answer

(a)
The values for elements are 
- [null, null]
- [object, null]
- [null, object]
- [object, object]

(b)
There are:
- 4 possible values of `elements`
- 3 possible values of `size`
- 2 possible values of `front` (null and object)
- 2 possible values of `back` (null and object)

There must be total of 48 possible states

(c) There are 4 states reachable, following the values for `elements`

(d) 4 reachable states:
- {[null, null], 0, null, null}
- {[object, null], 1, object, null}
- {[null, object], 1, null, object}
- {[object, object], 2, object, object}

(f)
```java
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BoundedQueue2Test {
    BoundedQueue2 bqueue = new BoundedQueue2();
    Object first = "mad";
    Object second = "crazy";

    /*
        s1: elements = [null, null]
        s2: elements = [obj, null]
        s3: elements = [null, obj]
        s4: elements = [obj, obj]
    */
    @Test
    public void s1tos2() {
        bqueue.enQueue(first);
    }

    @Test
    public void s2tos4() {
        bqueue.enQueue(first); //s2
        bqueue.enQueue(second);
    }
    @Test
    public void s4tos3() {
        bqueue.enQueue(first);
        bqueue.enQueue(second); //s4
        bqueue.deQueue();
    }

    @Test
    public void s2tos1() {
        bqueue.enQueue(first); //s2
        bqueue.deQueue();
    }
}

```