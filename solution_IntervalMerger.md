# Interval merger

To start we looked at the requirement and tried to understand the function. (Step 1-4)

Then we produced our test cases (Steps 4 and 5):

First we developed a test for the base cases where the input was an empty list, a list with a single element and a list that does not overlap. Then we wrote simple cases where the intervals consume each other, just touch each other, or where many different intervals are joined together. Then we wrote various different tests for repeating numbers such as: -A longer sequence which repeats -A number which starts off with digits that do not repeat but then moves on to repeat -Numbers greater than one with repeating digits

Then we tested for different cases where negative numbers were involved:

Negative and positive integers with the same absolute values but not overlapping
Negative intervals that do overlap
Finally we tested a case where the elements of each interval was not given in order

This function did not pass the above test and gave this error message:

"arrays first differed at element [0][0]; expected:<2> but was:<5>" type="arrays first differed at element [0][0]; expected"

This meant that the function was not treating cases where the interval was in reverse order properly.

We then changed the function to first sort all of the elements before merging From this point on the function passed all further tests

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
### killed: 82%

### survived:
- changed condition boundary in interval[0] > interval[1], as it is equivalent to the usual output. 
- changed condition boundary in len(intervals) <= 1, as it is equivalent to the usual output.