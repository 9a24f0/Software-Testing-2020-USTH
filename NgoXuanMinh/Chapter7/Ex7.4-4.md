# Ex 7.4-4

## Question

Use the following methods trash() and takeOut() to answer questions a–c.
```java
/* 1 */ public void trash (int x) 
/* 2 */ {
/* 3 */ int m, n; 
/* 4 */
/* 5 */     m = 0;
/* 6 */     if (x > 0)
/* 7 */     m = 4;
/* 8 */     if (x > 5)
/* 9 */         n = 3*m;
/* 10 */    else 
/* 11 */        n = 4*m; 
/* 13 */    int o = takeOut (m, n10
/* 14 */    System.out.println ("o is: " + o);
/* 15 */}
/* 16 */public int takeOut (int a, int b)
/* 17*/{
/* 18 */    int d, e;
/* 19 */
/* 20 */    d = 42*a;
/* 21*/    if (a > 0)
/* 22 */        e = 2*b+d;
/* 23 */    else
/* 24 */        e = b+d;
/* 25 */    return (e);
/* 26 */}
```
(a) Give all call sites using the line numbers given.

(b) Give all pairs of last-defs and first-uses.

(c) Provide test inputs that satisfy all-coupling-uses (note that trash() only has one input).

## Answer
(a) Following Wiki's definition of call site
> In programming, a call site of a function or subroutine is the location (line of code) where the function is called (or may be called, through dynamic dispatch). A call site is where zero or more arguments are passed to the function, and zero or more return values are received.

Thus, the call site is in line 12

(b)
1. (trash(), m, 5) ~ (takeOut(), a, 19) 
2. (trash(), m, 7) ~ (takeOut(), a, 19) 
3. (trash(), n, 9) ~ (takeOut(), b, 21)
4. (trash(), n, 9) ~ (takeOut(), b, 23) 
5. (trash(), n, 11) ~ (takeOut(), b, 21) 
6. (trash(), n, 11) ~ (takeOut(), b, 23) 
7. (takeOut(), e, 21) ~ (trash(), o, 13) 
8. (takeOut(), e, 23) ~ (trash(), o, 13) 

(c)
- x = 0 -> 1, 6, 8
- x = 42 -> 1, 4, 8

since we can't test for n diff 0, we can not provide test inputs that satisfy all-coupling-uses