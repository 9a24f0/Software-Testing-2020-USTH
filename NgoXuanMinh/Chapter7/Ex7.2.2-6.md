# Ex 7.2.2-6

## Question
Answer questions a–c for the graph in Figure 7.2.

(a) List the test requirements for Node Coverage, Edge Coverage, and Prime Path Coverage on the graph.

(b) List test paths that achieve Node Coverage but not Edge Coverage on the graph.

(c) List test paths that achieve Edge Coverage but not Prime PathCoverage on the graph

## Answer
(a)
Node Coverage: TR = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

Edge Coverage: TR = {(1, 4), (1, 5), (2, 5), (3, 6), (3, 7), (4, 8), (5, 8), (5, 9), (6, 2), (6, 10), (7, 10), (9, 6)}

Prime Path Coverage: TR = {[1, 4, 8], [1, 5, 8], [1, 5, 9, 6, 2], [1, 5, 9, 6, 10], [2, 5, 9, 6, 2], [2, 5, 9, 6, 10],
[3, 6, 2, 5, 8], [3, 6, 2, 5, 9], [3, 6, 10], [3, 7, 10], [5, 9, 6, 2, 5], [6, 2, 5, 9, 6], [9, 6, 2, 5, 8], [9, 6, 2, 5, 9]
}

(b) p<sub>1</sub> = [1, 4, 8]<br>
p<sub>2</sub> = [1, 5, 8]<br>
p<sub>3</sub> = [2, 5, 9]<br>
p<sub>4</sub> = [3, 6, 10]<br>
p<sub>5</sub> = [3, 7, 10]<br>
T = {p<sub>1</sub>, p<sub>2</sub>, p<sub>3</sub>, p<sub>4</sub>, p<sub>5</sub>} satisfies Node Coverage but not Edge Coverage since (6,2) and (9,6) are not covered

(c) p<sub>6</sub> = [3,6,2,5,9,6,10]
T = {p<sub>1</sub>, p<sub>2</sub>, p<sub>5</sub>, p<sub>6</sub>} satisfies Edge Coverage

