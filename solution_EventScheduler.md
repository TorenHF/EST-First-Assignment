# Array Element Swapper

To start we looked at the requirement and tried to understand the function. (Step 1-4)

Then we produced our test cases (Steps 4 and 5):

First we developed a test for the base case of an empty list.
Then we wanted to check for simple inputs, such as that with only one element, or when there was a simple overlap or no overlap.
Then we wanted to look at cases where there was a large overlap, or where one ended at the same time as the other started.
We also wanted to look at cases where the events were not put in time order.
And finally we looked at cases where negative numbers and the number zero was involved.

The function passed all of these tests.

The line and branch coverage of these tests was 100%, which we were very pleased with.

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

### survived:
- conditional boundary change boolean hasConflict. The change of this conditional boundary may be disregarded, as it's original state is being tested for specifically. When smaller, it is equivalent to the tests in question.
