# Ex 9.2-3

## Question
Answer questions (a) through (d) for the mutant on line 6 in the method *sum()*.

```java
public static int sum(int[] x)
   {
      int s = 0;
      for (int i=0; i < x.length; i++)
      {
         s = s + x[i];
         // s = s - x[i];
      }
      return s;
   }
```
(a) If possible, find test inputs that do not reach the mutant.

(b) If possible, find test inputs that satisfy reachability but not
infection for the mutant.

(c) If possible, find test inputs that satisfy infection, but not
propagation for the mutant.

(d) If possible, find test inputs that strongly kill the mutants.

## Answer

### (a)
x = []

### (b)
x = [0]

### (c)
x = [2, -7, 1, 4]

### (d)
x = [2, 7, 0, 4]