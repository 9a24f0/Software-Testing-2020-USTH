# Ex 8.1-6

## Question
In Section 8.1.6, we introduced the example p = (a ∨ b) ∧ c, and provided expanded versions of the clauses using program variables. We then gave specific values to satisfy PC. We also gave truth values to satisfy CC. Find values for the program variables given to satisfy CC; that is, refine the abstract tests into concrete test values.

## Answer

TR Clause coverage:
- x < y = true
- x < y = false
- done = true
- done = false
- list.contain(str) = true
- list.contain(str) = false

Test value
- x = 3, y = 4
- x = 4, y = 3
- done = true
- done = false
- ['a', 'b', 'c'].contain('a')
- ['a', 'b', 'c'].contain('d')