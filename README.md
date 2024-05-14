# Hash Table and Equation Solver

## Overview

This Java program includes an implementation of a hash table (`HashTable`) and an equation solver (`A3Q2`). The hash table is used to efficiently store key-value pairs, and the equation solver utilizes the hash table to solve mathematical equations.

## `HashTable` Class

The `HashTable` class provides basic functionality for storing key-value pairs. It includes methods for inserting and looking up values based on keys.

## `A3Q2` Class

The `A3Q2` class implements an equation solver that calculates the number of solutions for a given set of coefficients and a target sum. It utilizes the `HashTable` class to efficiently store and retrieve intermediate results during the calculation process.

## Usage

To use the `HashTable` class, simply create an instance of it and use the `insert` and `lookup` methods to store and retrieve key-value pairs, respectively.

To use the `A3Q2` class, call the `solve` method with the appropriate coefficients and target sum as parameters. This method returns the number of solutions for the given equation.

## Installation

To use the Hash Table and Equation Solver program, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Compile the Java files (`HashTable.java` and `A3Q2.java`).
4. Run the `A3Q2` class to execute the equation solver with the provided test cases.

## Test Cases

The program includes test cases in the `main` method of the `A3Q2` class. Each test case prints `true` if the return value of the `solve` method matches the expected result.

## Contribution

Contributions to the Hash Table and Equation Solver program are welcome! If you find any bugs or have suggestions for improvements, feel free to submit an issue or create a pull request.

