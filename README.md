#  Java Console Calculator — v2.0 :)

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=coffeescript)
![Platform](https://img.shields.io/badge/Platform-Console-blue)

![Status](https://img.shields.io/badge/Build-Stable-success)
![Contributions](https://img.shields.io/badge/Contributions-Welcome-brightgreen)

A fully functional, menu-driven **Scientific Calculator** built in **Java**, designed for console execution.  
This calculator performs **arithmetic**, **trigonometric**, **logarithmic**, **factorial**, and **range operations**, now upgraded with **advanced mathematical features** in Version 2.0.

---

##  Features

###  Core Arithmetic
- Addition, Subtraction, Multiplication, Division, Modulus

###  Powers & Roots
- Squares and Cubes  
- Square Roots and Cube Roots  
- Exponentiation (`a^b`, `b^a`)  
- Exponential (`e^x`)

###  Trigonometric Functions
- sin, cos, tan (in degrees)  
- Inverse Trigonometric (asin, acos, atan → in degrees)  
- Hyperbolic Trigonometric (sinh, cosh, tanh)

###  Logarithmic Functions
- Natural Log (`ln`)  
- Common Log (`log₁₀`)  
- Logarithm with Custom Base

###  Factorials & Range
- Factorial of a number  
- Range Sum and Average between two numbers

###  Utility & Misc
- Absolute Values (`|a|`, `|b|`)  
- Percentage Calculation (`a% of b`)  
- GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

---

##  Usage

###  Compile and Run
```bash
javac src/*.java
java src.CalculatorApp
```

Follow the on-screen menu to perform desired operations interactively.

---

##  Example
```
Enter first number: 5
Enter second number: 3

Choose operation:
1: Addition (+)
2: Subtraction (-)
...
21: GCD and LCM

1
Sum = 8

Do you want to continue? (y/n): n
Thank you for using the calculator. Bye!
```

---

##  Notes
- Factorials are limited to values fitting within `long`.  
- Logarithms are valid only for positive inputs.  
- Division/modulus by zero is safely handled.  
- Inverse trigonometric functions are valid only for `a ∈ [-1, 1]`.  
- Log base must be positive and ≠ 1.  
- Output precision rounded to 4 decimal places.

---

##  New in v2.0
 Added 8 new functions to make your calculator more powerful and professional.

| Category | New Feature | Description |
|-----------|-------------|-------------|
| **Math** | Absolute Value | Returns |a| and |b| |
| **Root** | Cube Root | Finds ∛a and ∛b |
| **Exponential** | eˣ | Calculates e raised to x |
| **Trig** | Inverse Trig | asin, acos, atan (in degrees) |
| **Trig** | Hyperbolic Trig | sinh, cosh, tanh |
| **Logs** | Custom Base Log | log₍base₎(a) |
| **Percent** | Percentage | Finds a% of b |
| **Number Theory** | GCD & LCM | Calculates both using Euclid’s algorithm |

---

##  Planned v3.0 Features (Coming Soon 🚧)
-  Statistical Functions (mean, median, mode, standard deviation)  
-  Number System Conversions (Binary ↔ Decimal ↔ Hex ↔ Octal)  
-  Unit Conversions (Temperature, Length, Mass, Time)  
-  Prime Checker + LCM for multiple inputs  
-  History and Memory Functions (M+, M–, MR, MC)  
-  Expression Parser to evaluate `(2+3)*sin(30)`  
-  (Future) JavaFX GUI Edition

---

## Author

**Saswat**  
First-Year Student @ IARE  
📂 GitHub: [Saswat-Iare25](https://github.com/Saswat-Iare25)  
💬 “Learning by Building — One Program at a Time.”

---

## ⭐ Show Support
If you like this project, give it a ⭐ on GitHub — it helps others discover it and keeps the motivation going!
