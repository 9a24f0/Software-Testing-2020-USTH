# Ex 8.2-1

## Question
Use predicates (i) through (iv) to answer the following questions.
i. f = ab(-c) + (-a)b(-c)  
ii. f = (-a)(-b)(-c)(-d) + abcd  
iii. f = ab + a(-b)c + (-a)(-b)c  
iv. f = (-a)(-c)(-d) + (-c)d + bcd  

(a) Draw the Karnaugh maps for f and -f.

(b) Find the nonredundant prime implicant representation for f and -f.

(c) Give a test set that satisfies Implicant Coverage (IC) for f.

(d) Give a test set that satisfies Multiple Unique True Points (MUTP) for f.

(e) Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for f.

(f) Give a test set that satisfies Multiple Near False Points (MNFP) for f.

(g) Give a test set that is guaranteed to detect all faults in Figure 8.2.

## Answer
### a. Draw the Karnaugh maps for f and -f
#### i. f = ab(-c) + (-a)b(-c)

Karnaugh map for f:  

| c \ ab | 00 | 01 | 11 | 10 |
|--------|----|----|----|----|
| **0**  |    | 1  | 1  |    |
| **1**  |    |    |    |    |

Karnaugh map for -f: 

| c \ ab | 00 | 01 | 11 | 10 |
|--------|----|----|----|----|
| **0**  | 1  |    |    | 1  |
| **1**  | 1  | 1  | 1  | 1  |

#### ii. f = (-a)(-b)(-c)(-d) + abcd 

Karnaugh map for f:  

| cd \ ab | 00 | 01 | 11 | 10 |
|---------|----|----|----|----|
| **00**  | 1  |    |    |    |
| **01**  |    |    |    |    |
| **11**  |    |    | 1  |    |
| **10**  |    |    |    |    |

Karnaugh map for -f: 

| cd \ ab | 00 | 01 | 11 | 10 |
|---------|----|----|----|----|
| **00**  |    | 1  | 1  | 1  |
| **01**  | 1  | 1  | 1  | 1  |
| **11**  | 1  | 1  |    | 1  |
| **10**  | 1  | 1  | 1  | 1  |

#### iii. f = ab + a(-b)c + (-a)(-b)c 

- Karnaugh map for f:

| c\ab  | 00 | 01 | 11 | 10 |
|-------|----|----|----|----|
| **0** |    |    | 1  |    |
| **1** | 1  |    | 1  | 1  |

- Karnaugh map for (-f):

| c\ab  | 00 | 01 | 11 | 10 |
|-------|----|----|----|----|
| **0** | 1  | 1  |    | 1  |
| **1** |    | 1  |    |    |

#### iv. f = (-a)(-c)(-d) + (-c)d + bcd  

- Karnaugh map for f:

|    | 00 | 01 | 11 | 10 |
|----|----|----|----|----|
| 00 | 1  | 1  |    |    |
| 01 | 1  | 1  | 1  | 1  |
| 11 |    | 1  | 1  |    |
| 10 |    |    |    |    |

- Karnaugh map for (-f):

|    | 00 | 01 | 11 | 10 |
|----|----|----|----|----|
| 00 |    |    | 1  | 1  |
| 01 |    |    |    |    |
| 11 | 1  |    |    | 1  |
| 10 | 1  | 1  | 1  | 1  |

### b. Find the nonredundant prime implicant representation for f and -f
#### i. f = ab(-c) + (-a)b(-c)
- For f: f = b(-c)  
- For -f: -f = (-b) + c  

#### ii. f = (-a)(-b)(-c)(-d) + abcd 
- For f: f = (-a)(-b)(-c)(-d) + abcd  
- For -f: -f = (-a)d + c(-d) + b(-c) + a(-b)

#### iii. f = ab + a(-b)c + (-a)(-b)c 
- For f : ab + (-b)c
- For (-f): (-a)b + (-b)(-c)

#### iv. f = (-a)(-c)(-d) + (-c)d + bcd 
- For f : (-a)(-c) + bd + (-c)d
- For (-f) : a(-d) + c(-d) + (-b)c 

### c. Give a test set that satisfies Implicant Coverage (IC) for f.
#### i. f = ab(-c) + (-a)b(-c)
Implicants: {(-b), c, b(-c)}  
T = { xTF, xFT }

#### ii. f = (-a)(-b)(-c)(-d) + abcd 
Implicants: {(-a)(-b)(-c)(-d), abcd, (-a)d, c(-d), b(-c), a(-b)}  
T = {FFFF, TTTT, FTFT, TFTF}

#### iii. f = ab + a(-b)c + (-a)(-b)c 
Implicants: (-b)c, (-a)b, (-b)(-c)}  
T = {TT-, -FT, FT-, -FF }

#### iv. f = (-a)(-c)(-d) + (-c)d + bcd 
Implicants: {(-a)(-c), bd, (-c)d, a(-d), c(-d), (-b)c}  
T = {FTFT, TFTF}


### d. Give a test set that satisfies Multiple Unique True Points (MUTP) for f.
#### i. f = ab(-c) + (-a)b(-c)
T = {-TF,-FF,-TT}

#### ii. f = (-a)(-b)(-c)(-d) + abcd  
T = {FFFF, TTTT, FFTT, FTTF, FTFT, TFFT}

#### iii. f = ab + a(-b)c + (-a)(-b)c 
T = {TT-, -FT, FT-, -FF}

#### iv. f = (-a)(-c)(-d) + (-c)d + bcd 
T = {F-FF, -TTT, TFFT, T-FF, FTTF, -FTT}

### e. Give a test set that satisfies Corresponding Unique True Point and Near False Point Pair Coverage (CUTPNFP) for f
#### i. f = ab(-c) + (-a)b(-c)

UTPs: {-TF}  
NFPs: {-TT, -FF}  
Test set {-TF, -TT, -FF} would also satisfy CUTPNFP.

#### ii. f = (-a)(-b)(-c)(-d) + abcd 
UTPs: {FFFF, TTTT, FFTT, FTTF, FTFT, TFFT}

#### iii. f = ab + a(-b)c + (-a)(-b)c 
UTPs: {TTF, FFT}  
NFPs: {FTF,TFF}, {FFF,FTT}   
{TTF, FTF, TFF} and {FFT, FFF, FTT} would satisfy CUTPNFP.  

#### iv. f = (-a)(-c)(-d) + (-c)d + bcd 
UTPs: {FFFF, TTTT, TFFT}  
NFPs: {TFFF,FFTF}, {TFTT,TTTF}, {TFTT,TFFF}  
{FFF,TFFF,FFTF}, {TTTT,TFTT,TTTF} and {TFFT,TFTT,TFFF} would satisfy CUTPNFP  