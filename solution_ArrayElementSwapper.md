# Array Element Swapper
To start we looked at the requirement and tried to understand the function. (Step 1-4)

Then we produced our test cases (Steps 4 and 5):

First we developed a test for the base case of an empty list.
Then we wanted to check for inputs where it should not change the list, such as for lists with only positive and only negative elements and also a list that is already in the correct order.
Then we wanted to look at a case where all numbers needed changing.
And finally we tested for edge cases which involved 0 and -0. 

The function passed all of these tests. 

The line coverage of these tests was 100% and the branch coverage was 91%.
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
### killed: 90%

### survived:
- conditional boundary change in void swapElements because that particular branch isn't addressed in the tests. However, it is not in any way relevant.
