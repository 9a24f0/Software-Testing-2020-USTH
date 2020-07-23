# Ex 7.5-2

## Question
For the following questions a–c, consider the FSM that models a (simplified) programmable
thermostat. Suppose the variables that define the state and the methods that transition
between states are:
```
partOfDay : {Wake, Sleep}
temp : {Low, High}
// Initially "Wake" at "Low" temperature
// Effects: Advance to next part of day
public void advance();
// Effects: Make current temp higher, if possible
public void up();
// Effects: Make current temp lower, if possible
public void down();
```
(a) How many states are there?

(b) Draw and label the states (with variable values) and transitions (with method names).

Notice that all of the methods are total.

(c) A test case is simply a sequence of method calls. Provide a test set that satisfies Node Coverage on your graph.

## Answer

(a) There are 4 possible states
- (wake, low)
- (wake, high)
- (sleep, low)
- (sleep, high)

(b)
```
    (wake, low)     -> advance()    -> (sleep, low)
    (wake, low)     -> up()         -> (wake, high)
    (wake, high)    ->  advance()   -> (sleep, high)
    (wake, high)    ->  down()      -> (wake, low)
    (sleep, low)    -> advance()    -> (wake, low)
    (sleep, low)    -> up           -> (sleep, high)
    (sleep, high)   -> advance()    -> (wake, high)
    (sleep, high)   -> down()       -> (sleep, low)
```

(c) test set: {advance(), up(), advance()}