# Testing results

---
code seems fine, nothing added (well, I added an explanation to the start of the file, but that was mostly for my own convenience), all tests passed.
Tested for:
- identical strings
- 2 mixed operation cases
- 1 remove case
- 1 replace case
- 1 from empty string to string case
- 1 from string to empty string case

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