# Ex 9.2-1

## Question
Provide reachability conditions, infection conditions, propagation conditions, and test case values to kill mutants 2, 4, 5, and 6 in Figure 9.1.

## Answer
### Mutant 2
- R: The statement will be reached.  
- I: The test will infect if the predicate gives a different result.  
- P: The infection will force another path, which will propagate.

### Mutant 4
- R: Reached if ( B < A ) is true.  
- I: Bomb() will infect.
- P: True, Bomb() will propagate.

### Mutant 5
- R: Reached if ( B < A ) is true. 
- I: True if A != B.
- P: minVal got another value, then it will propagate.

### Mutant 6
- R: Reached if ( B < A ) is true. 
- I: if B = 0.
- P: fail -> propagate.