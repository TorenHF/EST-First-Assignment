# Non Prime Spiral matrix

To start we looked at the requirement and tried to understand the function. (Step 1-4)

Then we produced our test cases (Steps 4 and 5):
 
For this function the biggest challenge was creating the expected inputs.
We started with small numbers such as n = 0, n = 1 and N = 2. 
THen we moved on to larger examples such as n = 3, 4, 5, 11.
This was because we needed to know if it was also good at recognising large prime numbers (because large numbers have more devisors, this can be difficult).

THe function passed all of the tests, but we also noticed there was no check to see if the inputs are positive, so we added a check that would throw an error if the input was negative.

The line coverage of these tests was 97% and the branch coverage was 90%.
The missing 3% in the line coverage was only for the case of a negative input, we added a case where this happened

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
### killed: 92%
