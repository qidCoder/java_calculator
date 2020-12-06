# java_calculator

## Calculator Part I
A client of yours requires a basic calculator for their application. They need a way to run a series of operations and save the result. They only need adding and subtracting functionality right now. They need the method performOperation and getResults to be the methods that run all the operations and return the end result respectively.

● setOperandOne(10.5)

● setOperation("+")

● setOperandTwo(5.2)

● performOperation()

● getResults()

where the result would be 15.7.

Objectives:
● Practice classes and objects.

● Implement a calculator in java.

Tasks:
● Create the Calculator bean that will allow for the user to set operands and operations, then perform them and get the results.

● Have logic for adding and subtracting.

---

## Calculator Part II
The client has requested a change in spec: they need the calculator to process multiple values, as well as have some more complex abilities. They need the possibility for you to add several numbers in a row: this requires a change in our interface as we can't be sure how many total operands the client will be using. Now they expect this to work:

● performOperation(10.5)

● performOperation("+")

● performOperation(5.2)

● performOperation("*")

● performOperation(10)

● performOperation("=")

● getResults()

where the result would be 62.5. They want to be able to do this for an arbitrary number of numbers, as well as add in the capability to multiply and divide. You can assume that all inputs will be valid. Notice that the calculator must correctly perform the order of operations.

Objectives:
● Practice classes and objects.

● Implement a calculator in java.

Tasks:
● Create the Calculator bean that will allow for the user to set operands and operations, then perform them and get the results.

● Have logic for adding, subtracting, dividing, and multiplication.

Notes:
● You may want to use helper boolean properties to indicate if an operation or operand has been set or used yet.
