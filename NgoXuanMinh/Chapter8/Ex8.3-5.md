# Ex8.3-5

# Exercise 5 - Section 3 - Chapter 8

## Question
Answer the following questions for the method checkIt() below:
```java
   public static void checkIt (boolean a, boolean b, boolean c)
   {  
      if (a && (b || c))
      {
         System.out.println ("P is true");
      }
      else
      {
         System.out.println ("P isn't true");
      }
   }
```

(a) Transform checkIt() to checkItExpand(), a method
where each if statement tests exactly one boolean variable.
Instrument checkItExpand() to record which edges are
traversed. (“print” statements are fine for this.)

(b) Derive a GACC test set T1 for checkIt(). Derive an EdgeCoverage test set T2 for checkItExpand(). Build T2 so
that it does not satisfy GACC on the predicate in
checkIt().

(c) Run both T1 and T2 on both checkIt() and checkItExpand().

## Answer 

### (a)
```java
public static void checkItExpand (boolean a, boolean b, boolean c){
	if(a){
		if(b){
			System.out.println ("1: P is true");
		}
		else if(c){
			System.out.println ("2: P is true");
		}
		else{
			System.out.println ("3: P is not true");
		}
	}
	else{
		System.out.println ("4: P is not true");
	}
}
```

### (b)

#### T1 for *CheckIt.java*
Test set:  
- t1: {true, true, true} x
- t2: {true, true, false}  x
- t3: {true, false, true} x
- t4: {false, true, true} x
- t5: {false, true, false}x
- t6: {false, false, true} x


#### T2 for *CheckItExpand.java*
Test set:  
- t1: {Fxx}
- t2: {TTx}
- t3: {TFT}
- t4: {TFF}

