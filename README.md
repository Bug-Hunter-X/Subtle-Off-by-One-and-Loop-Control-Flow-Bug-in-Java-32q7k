# Subtle Off-by-One and Loop Control Flow Bug in Java

This repository demonstrates a common, yet subtle, off-by-one error in Java, coupled with unexpected behavior in continue and break statements within loops. The code may appear correct at first glance, but it exhibits unexpected results due to the increment operator's placement within the loop condition and how continue/break interact with that placement.

## Bug Description
The `BuggyLoop.java` file contains the buggy code. The loop is intended to print even numbers and some odd numbers, but due to the increment and conditional logic, it produces incorrect output.

## Solution
The `FixedLoop.java` file provides a corrected version, ensuring the loop iterates correctly and the continue and break statements function as expected. The solution clarifies the intended loop behavior and demonstrates best practices for loop control and variable incrementing.

## How to Run
1. Clone this repository.
2. Compile and run both Java files using a Java compiler (like javac):
   ```bash
   javac BuggyLoop.java
   java BuggyLoop
   javac FixedLoop.java
   java FixedLoop
   ```

Compare the output from both files to understand the error and its correction.