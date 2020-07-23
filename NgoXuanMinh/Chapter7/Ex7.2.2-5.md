# Ex 7.2.2-5

## Answer
(a)

(b)
```
TR = {[1,2,3]
      [1,2,4]
      [2,3,2]
      [3,2,4]
      [2,4,5]
      [2,4,6]
      [4,5,6]
      [4,6,1]
      [5,6,1]
      [6,1,7]
      [6,1,2]}
```
(c)

p<sub>1</sub> = [1, 2, 4, 5, 6, 1, 7]

miss (2,3,2), (3,2,4), (2,4,6) and (4,6,1)

p<sub>2</sub> = [1, 2, 3, 2, 4, 6, 1, 7]

miss (2, 4,5) and (4, 5,6)

p<sub>3</sub> = [1, 2, 3, 2, 4, 5, 6, 1, 7]

miss (4,6,1) and (2,4,6)

(d) The test path does not tour the simple path directly. However, it tour the simple path with a sidetrip.

The side trip is [4,6,1,2,4]

(e)
- Node coverage: TR = {1,2,3,4,5,6,7}
- Edge coverage: TR = {(1,2), (1,7), (2,3), (2,4), (3,2), (4,5), (4,6), (5,6), (6,1)}

(f)
- Test paths that achived Node coverage: p<sub>3</sub> (p<sub>1</sub> missed 3, p<sub>2</sub> missed 5)
- p<sub>3</sub> still not achived Edge coverage is (4,6) is missed

(g) There no such given path achived Edge coverage


