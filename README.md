# Java Scientific Calculator

A console-based scientific calculator written in Java.
It supports basic arithmetic and advanced operations like trigonometry, logarithms, factorial, powers, and range averages.

## Features
- Addition, Subtraction, Multiplication, Division, Modulus
- Squares, Cubes, Square Roots
- Exponentiation
- Trigonometric functions (sin, cos, tan in degrees)
- Logarithms (ln and log10)
- Factorials
- Range Sum and Average

## Usage
Compile and run:
```bash
javac src/*.java
java src.CalculatorApp
```
Follow the menu options in the console.

## Example
```
Enter first number: 5
Enter second number: 3
Choose operation (1 for +, 2 for -, ...):
1
Sum = 8
```

## Notes
- Factorials are limited to values that fit within `long`.
- Logarithms are only valid for positive inputs.
- Division/modulus by zero is prevented.
