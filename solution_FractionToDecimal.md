# Fraction to decimal

To start we looked at the requirement and tried to understand the function. (Step 1-4)

Then we produced our test cases (Steps 4 and 5):

First we developed a test for the base cases where the result should be zero and one.
Then we wrote functions that should have many decimal cases.
Then we wrote various different tests for repeating numbers such as:
-A longer sequence which repeats
-A number which starts off with digits that do not repeat but then moves on to repeat
-Numbers greater than one with repeating digits

Then we tested for different cases where negative numbers were involved:
-Negative numerator
-Negative denominator
-Both negative numerator and denominator
-Negative 0 in the numerator
-Negative number in the denominator with 0 as the numerator

The function did not Pass the test, where the input was 0 for the numerator and a negative number for the denominator
We received This error Message:

failure message="expected:<[]0> but was:<[-]0>" type="org.junit.ComparisonFailure"

This meant that the function was not treating cases with 0 correctly.
We knew that if -0 was the numerator and a positive number was the denominator, it would still return a postitive number

We changed the function to check if the numerator was zero after checking if the denominator is zero, because in that case the result should always be "0"

From this point on the function passed all further tests

The line coverage of these tests was 95% and the branch coverage was 93%.
This was a result of there not being a test for the case denominator = 0. We added a test where this was the case.

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

### survived: 10%
- changed conditional boundary in numerator < 0 xor denominator < 0 (both, meaning twice), because it is equivalent, as edge cases of both equaling 0 are treated previously. 