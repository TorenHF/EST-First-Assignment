# Testing results

---
Added the errors it was supposed to throw.
Tested for:
- 2 basic valid encodings
- empty string
- illegal characters (non-numeric)
- negative numbers as input
- insufficient array length

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
### killed: 100%