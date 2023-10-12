### Finding Minimum and Maximum Values in a List

Write methods `findMin` and `findMax` that work with a list of elements of any type that implements Comparable.

**Examples of lists that should work:**
- 1, 2, 4, 0, -49
- "Ivan", "was born", "a girl", "ordered", "to carry", "a swaddling cloth"
- 12.0, -14.2, 90990.3224
- java.time.DayOfWeek.MONDAY, java.time.DayOfWeek.WEDNESDAY, java.time.DayOfWeek.TUESDAY
- a list of Yokozuna from lecture 16

Think if it's possible to do it without an initialValue (as in the lecture).

Think about how to make both methods `findMin` and `findMax` call the same code without duplicating each other.
