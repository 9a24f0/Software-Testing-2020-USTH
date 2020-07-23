# Ex 7.4-3

## Question

Use the following program fragment for questions a–e below.
```
public static void f1 (int x, int y)
{
if (x < y) { f2 (y); } else { f3 (y); };
}
public static void f2 (int a)
{
if (a % 2 == 0) { f3 (2*a); };
}
public static void f3 (int b)
{
if (b > 0) { f4(); } else { f5(); };
}
public static void f4() {... f6()....}
public static void f5() {... f6()....}
public static void f6() {...}
```
Use the following test inputs:
- t1 = f1 (0, 0)
- t2 = f1 (1, 1)
- t3 = f1 (0, 1)
- t4 = f1 (3, 2)
- t5 = f1 (3, 4)

## Answer

(b)
- t<sub>1</sub> ~ p<sub>1</sub> [f1, f3, f5, f6]
- t<sub>2</sub> ~ p<sub>2</sub> [f1, f3, f4, f6]
- t<sub>3</sub> ~ p<sub>3</sub> [f1, f2]
- t<sub>4</sub> ~ p<sub>4</sub> [f1, f3, f4, f6]
- t<sub>5</sub> ~ p<sub>5</sub> [f1, f2, f3, f4, f6]

(c) Let t<sub>6</sub> = f<sub>5</sub> (42)

Minimal test set: {t<sub>5</sub>, t<sub>6</sub>}

(d) Minimal test set: {t<sub>1</sub>, t<sub>5</sub>}

(e) Prime paths:
- [f1, f2, f3, f4, f6] Covered by t<sub>5</sub>
- [f1, f2, f3, f5, f6]
- [f1, f3, f4, f6] Covered by t<sub>4</sub>
- [f1, f3, f5, f6] Covered by t<sub>1</sub>