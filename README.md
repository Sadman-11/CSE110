# CSE110 - Object Oriented Programming (OOP) Lab Repository

This repository contains Java programming exercises and lab assignments from CSE110 course, focusing on fundamental programming concepts, primitive data types, arrays, and type casting.

## 📚 Course Overview

CSE110 is an introductory course covering fundamental programming concepts using Java. This repository demonstrates understanding of:

- Primitive data types in Java
- Basic arithmetic operations
- User input handling with Scanner
- Type casting (implicit and explicit)
- One-dimensional and multi-dimensional arrays
- Ragged (jagged) arrays
- Basic control structures
- Object-oriented programming fundamentals
- Classes and objects
- Constructors (default and parameterized)
- Methods and encapsulation
- Object references and garbage collection

## 🗂️ Repository Structure

```
CSE110/
├── primitive_types_Lab_3/
│   ├── primitive_types1.java      # Basic arithmetic operations
│   ├── input_calc.java            # Calculator with user input
│   ├── type_casting.java          # Type casting examples
│   ├── oneD_array.java            # One-dimensional array operations
│   ├── max_min.java               # Finding max and min values
│   ├── ThreeXThree_Matrix.java    # 3x3 matrix input/output
│   └── ragged_arrays_lab9.java    # Ragged array demonstration
├── Introduction_to_Classes_LAB_4/
│   ├── Lab4_p1.java               # Rectangle class with area calculation
│   ├── Lab4_p2.java               # Circle class with setter method
│   ├── Lab4_p3.java               # Object references demonstration
│   ├── Lab4_p4.java               # Student class with default constructor
│   ├── Lab4_p5.java               # Student class with parameterized constructor
│   ├── Lab4_p6.java               # Rectangle with constructor
│   ├── Lab4_p7.java               # Cube volume calculator
│   ├── Lab4_p8.java               # Garbage collection and finalize
│   ├── Lab4_p9.java               # Box volume with multiple objects
│   └── Lab4_p11.java              # BankAccount class with methods
└── package-info.java              # Package declaration
```

## 📝 Lab Exercises Description

### Lab 3: Primitive Types

#### 1. **primitive_types1.java**
- Demonstrates basic arithmetic operations
- Calculates sum, average, and product of three integers
- **Concepts**: Variables, arithmetic operators, output formatting

#### 2. **input_calc.java**
- Interactive calculator accepting two numbers from user
- Performs addition, subtraction, and division
- **Concepts**: Scanner class, user input, double data type

#### 3. **type_casting.java**
- Shows implicit and explicit type casting
- Converts int to double (implicit) and double to int (explicit)
- **Concepts**: Type conversion, data type compatibility

#### 4. **oneD_array.java**
- Accepts 5 numbers from user and calculates their sum
- **Concepts**: Arrays, loops, array indexing

#### 5. **max_min.java**
- Finds maximum and minimum values from 5 user inputs
- **Concepts**: Array traversal, conditional statements, comparison

#### 6. **ThreeXThree_Matrix.java**
- Accepts and displays a 3x3 matrix
- **Concepts**: 2D arrays, nested loops, matrix operations

#### 7. **ragged_arrays_lab9.java**
- Creates and displays a ragged (jagged) array
- Array structure: [2, 3, 4] elements per row
- **Concepts**: Ragged arrays, variable-length subarrays

### Lab 4: Introduction to Classes

#### 1. **Lab4_p1.java**
- Implements Rectangle class with length, width attributes
- Calculates area using a method
- **Concepts**: Class definition, instance variables, methods, object creation

#### 2. **Lab4_p2.java**
- Circle class with radius attribute
- Uses setter method and calculates area
- Accepts user input for radius
- **Concepts**: Setter methods, `this` keyword, Scanner integration

#### 3. **Lab4_p3.java**
- Demonstrates object reference assignment
- Shows how two references can point to the same object
- **Concepts**: Object references, reference assignment

#### 4. **Lab4_p4.java**
- Student class with id, name, and cgpa attributes
- Uses default constructor to initialize values
- **Concepts**: Default constructors, object initialization

#### 5. **Lab4_p5.java**
- Student class with parameterized constructor
- Creates multiple student objects with different values
- **Concepts**: Parameterized constructors, `this` keyword

#### 6. **Lab4_p6.java**
- Rectangle class with parameterized constructor
- Demonstrates constructor-based initialization
- **Concepts**: Constructor parameters, method invocation

#### 7. **Lab4_p7.java**
- Cube class to calculate volume
- Single constructor accepting side length
- **Concepts**: Constructor initialization, method implementation

#### 8. **Lab4_p8.java**
- Demonstrates garbage collection mechanism
- Uses finalize() method to track object destruction
- **Concepts**: Garbage collection, finalize method, System.gc()

#### 9. **Lab4_p9.java**
- Box class for volume calculation
- Creates and manages multiple Box objects
- **Concepts**: Multiple object creation, constructor usage

#### 10. **Lab4_p11.java**
- Complete BankAccount class implementation
- Includes deposit, withdraw, and display methods
- Handles insufficient balance scenarios
- **Concepts**: Encapsulation, method implementation, conditional logic

## 🚀 Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher
- **Java Compiler**: javac
- **Text Editor or IDE**: Any Java-compatible IDE (Eclipse, IntelliJ IDEA, VS Code, etc.)

## 💻 How to Compile and Run

### Compiling a Program

Navigate to the project directory and compile any Java file:

```bash
# Compile a single Lab 3 file with proper package structure
javac -d . primitive_types_Lab_3/primitive_types1.java

# Or compile all Lab 3 files in the directory
javac -d . primitive_types_Lab_3/*.java

# Compile all Lab 4 files with proper package structure
javac -d . Introduction_to_Classes_LAB_4/*.java
```

### Running a Program

After compilation, run the program using the java command with the fully qualified class name:

#### Lab 3 Programs:
```bash
# Run primitive_types1
java primitive_types.primitive_types1

# Run input_calc (requires user input)
java primitive_types.input_calc

# Run max_min (requires user input)
java primitive_types.max_min

# Run oneD_array (requires user input)
java primitive_types.oneD_array

# Run ThreeXThree_Matrix (requires user input)
java primitive_types.ThreeXThree_Matrix

# Run ragged_arrays_lab9
java primitive_types.ragged_arrays_lab9

# Run type_casting
java primitive_types.type_casting
```

#### Lab 4 Programs:
```bash
# Run Rectangle area program
java LAB.Lab4_p1

# Run Circle area program (requires user input)
java LAB.Lab4_p2

# Run Box reference demonstration
java LAB.Lab4_p3

# Run Student with default constructor
java LAB.Lab4_p4

# Run Student with parameterized constructor
java LAB.Lab4_p5

# Run Rectangle with constructor
java LAB.Lab4_p6

# Run Cube volume calculator
java LAB.Lab4_p7

# Run garbage collection demo
java LAB.Lab4_p8

# Run Box volume with multiple objects
java LAB.Lab4_p9

# Run BankAccount class demo
java LAB.Lab4_p11
```

### Example Usage

#### Lab 3 Example:
```bash
# Example: Running input_calc
$ java primitive_types.input_calc
Enter first number: 10
Enter second number: 5
Sum = 15.0
Difference = 5.0
Quotient = 2.0
```

#### Lab 4 Example:
```bash
# Example: Running BankAccount program
$ java LAB.Lab4_p11
Account Number: 1
Acount Holder: Shafkat
Account Balance: 50000.0

Depositing 18000
Account Number: 1
Acount Holder: Shafkat
Account Balance: 68000.0

Withdrawing 10000
Account Number: 1
Acount Holder: Shafkat
Account Balance: 58000.0

Insufficient Balance
Account Number: 1
Acount Holder: Shafkat
Account Balance: 58000.0
```

## 📖 Learning Outcomes

By completing these exercises, students will:

**Lab 3 - Primitive Types:**
- ✅ Understand Java primitive data types (int, double)
- ✅ Perform basic arithmetic operations
- ✅ Handle user input using Scanner class
- ✅ Implement type casting between different data types
- ✅ Work with one-dimensional and two-dimensional arrays
- ✅ Understand and create ragged arrays
- ✅ Use loops and conditional statements effectively
- ✅ Practice proper code organization with packages

**Lab 4 - Object-Oriented Programming:**
- ✅ Define and create classes with attributes and methods
- ✅ Understand object instantiation and usage
- ✅ Implement default and parameterized constructors
- ✅ Use the `this` keyword for referencing instance variables
- ✅ Understand object references and memory management
- ✅ Implement encapsulation with private data and public methods
- ✅ Work with multiple objects of the same class
- ✅ Understand garbage collection and finalize method
- ✅ Create practical classes like BankAccount with business logic

## 🤝 Contributing

This is a personal academic repository. If you're a student taking CSE110, feel free to use this as a reference, but please write your own code to ensure proper learning.

## 📄 License

This repository is for educational purposes. Please check with your institution's academic integrity policies before using this code.

## 👤 Author

**Sadman-11**

- GitHub: [@Sadman-11](https://github.com/Sadman-11)

---

*Note: This repository is part of coursework for CSE110. All exercises are designed to teach fundamental programming concepts in Java.*
