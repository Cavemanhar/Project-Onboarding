# Project-Onboarding

1) Write a function that returns true if a string consists of ascending or ascending AND consecutive numbers.

Examples
ascending("232425") --> true
// Consecutive numbers 23, 24, 25

ascending("2324256") --> false
// No matter how this string is divided, the numbers are not consecutive.

ascending("444445") --> true
// Consecutive numbers 444 and 445.
Notes
A number can consist of any number of digits, so long as the numbers are adjacent to each other, and the string has at least two of them.

2) Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.

Examples
squarePatch(3) --> [
[3, 3, 3],
[3, 3, 3],
[3, 3, 3]
]

squarePatch(5) --> [
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5]
]

squarePatch(1) --> [
[1]
]

squarePatch(0) --> []
Notes
n >= 0.
If n = 0, return an empty array.