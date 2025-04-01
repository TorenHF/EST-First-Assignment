# Testing results

---
code seems fine, nothing added, all tests passed.
Tested for:
- example string
- empty string
- null
- str s. t. len(set(str)) == len(str)
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