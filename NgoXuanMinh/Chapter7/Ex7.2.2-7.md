# Ex 7.2.2-7

## Question
Answer questions a–d for the graph defined by the following sets:
- N = {1, 2, 3}
- N<sub>0</sub> = {1}
- N<sub>f</sub> = {3}
- E = {(1, 2), (1, 3), (2, 1), (2, 3), (3, 1)}

Also consider the following (candidate) paths:
- p<sub>1</sub> = [1, 2, 3, 1]
- p<sub>2</sub> = [1, 3, 1, 2, 3]
- p<sub>3</sub> = [1, 2, 3, 1, 2, 1, 3]
- p<sub>4</sub> = [2, 3, 1, 3]
- p<sub>5</sub> = [1, 2, 3, 2, 3]

(a) Which of the listed paths are test paths? For any path that is not a test path, explain why not.

(b) List the eight test requirements for Edge-Pair Coverage (only the length two subpaths).

(c) Does the set of test paths from part (a) above satisfy Edge-Pair Coverage? If not, state what is missing.

(d) Consider the prime path [3, 1, 3] and path p 2 . Does p 2 tour the prime path directly? With a sidetrip?

## Answer

(a) 
- p<sub>1</sub> and p<sub>4</sub> are not test paths because they neither start at 1 nor end at 3
- p<sub>5</sub> is not a path since we have no edge (3,2)
(b)
```
TR = {[1,2,3],
      [1,3,1],
      [1,2,1],
      [2,1,3],
      [2,3,1],
      [2,1,2],
      [3,1,2],
      [3,1,3]}
```

(c) T = {p<sub>2</sub>, p<sub>3</sub>} does not satifies Edge-Pair Coverage since (2,1,2) is not covered

(d) p<sub>2</sub> does not tour prime path [3,1,3] directly. However, it detour as [3,1,2,3]