# Ex 9.2-2

# Question

Answer questions (a) through (d) for the mutant on line 5 in the
method findVal().

```java
public static int findVal(int numbers[], int val)       
   {                                                       
      int findVal = -1;                                    
                                                        
      for (int i=0; i<numbers.length; i++)         // mutant        
      // for (int i=(0+1); i<numbers.length; i++)  
         if (numbers [i] == val)                         
            findVal = i;                                  
         return (findVal);                                    
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
The mutant is always reached.

### (b)
The infection will always happen because i has the wrong value.

### (c)
([3, 0, 1, 2], 1)

### (d)
([3, 0, 1, 2], 3)