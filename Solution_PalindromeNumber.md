# Testing results

---
code seems fine, nothing added, all tests passed.
Tested for:
- a palindrome
- a negative palindrome
- a non-palindrome
- a singular number
- a palindrome including an illegal character

---
## line coverage
100%

---
## mutation testing

### Active mutators:
- CONDITIONALS_BOUNDARY
- EMPTY_RETURNS
- FALSE_RETURNS
- INCREMENTS
- INVERT_NEGS
- MATH
- NEGATE_CONDITIONALS
- NULL_RETURNS
- PRIMITIVE_RETURNS
- TRUE_RETURNS
- VOID_METHOD_CALLS
### killed: 82%
### survived:
- changed conditional boundary in while (left < right), which is equivalent in output, but may cost an extra iteration in arrays of odd length. Irrelevant.
- changed conditional boundary in if (x<0), as 0 specifically was never tested because the code and claim are both obvious.