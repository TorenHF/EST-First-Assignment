# Consecutive Element Sum
To start we looked at the requirement and tried to understand the function. (Step 1-4)

Then we produced our test cases (Steps 4 and 5):

First we developed a test for the base case of an empty list and a list with a single element.
Then we wanted to test for different cases where it would only output one element of the list. These inccluded:
- All elements are negative
- All elements are negative apart from zero
- It needs to return one single element randomly in the list
- It should return the first element of the list
- It should return the last element of the list
Finally we wanted to write a test where it would return the sum of the whole list.

The function passed all of these tests. 

The line coverage of these tests was 100% and the branch coverage was 83%.
Because these numbers were both very high, and because we felt we evaluated all edge cases, we did not feel the need to write additional tests to cover the remaining few branches.

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