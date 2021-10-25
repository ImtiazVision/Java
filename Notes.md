**Java** has the following characteristics :

- It is easy to use and portable: Memory management with pointers is not permitted.
- It is not dependent on the host platform.
- It is Secure and Dynamic: It is designed to securely run code from distant sources.
- It has language support as well as networking libraries.
- It is Robust: Java has its own powerful memory management system. This helps to eliminate errors by checking the code during compilation and execution.
- Java is Multithreaded: it supports numerous thread executions (i.e., lightweight processes), as well as a set of synchronization primitives.

**Java** is a widely used programming language for embedded system development, backend systems, and APIs. It's referred to as an object-oriented programming language. Some of Java's core concepts include **Recursion** and **Parallelism**.

The **class** is the primary organizational unit in a Java application. The most basic Java application has only one class. **A class is a collection of methods**, among other things.

Methods are classified into two types: static methods and non-static methods. The method is declared with the keywords public static void, the function's name, parentheses enclosing the function's parameters (String[] args), an open curly brace, and a closing curly brace.

The process of restructuring code into different files, classes, methods, libraries, or functions is known as **factoring**.

A method called System.out.println can be used to print the text "Hello, World!" to the screen.  `System.out.println("Hello, World!");`.

`System.out` is the name of an object that represents our program's main printed output device. So `System.out.println` invokes the `System.out` object's `println` method.

`n` represents a newline, and `t` represents a tab.

`System.out.format("%f is an approximation of pi.", 3.14159)`

The format specifier `%f` denotes the location where the parameter 3.14159 should be substituted. The letter `f` in `%` f denotes that the value will be in the form of a floating point number. For an integer, we use `%d`.

### String Concatenation : 

When we use the '+' operator to concatenate two variables in Java, as long as one of them is a string, both of them are turned into strings during string concatenation.

`System.out.println(42 + 22 + " is my favorite charm.");`

Each new word should begin with a lowercase letter and end with an uppercase letter. Because the capital letters resemble the humps on a camel's back, this practice is frequently referred to as "camel case" e.g. `sampleVariable`.


Java provides static typing, which means that we must define the data type before declaring a variable.

`int sampleVariable = 7;`

Integer division divides two integers and returns an integer. Floating-point division is the process of converting two floating-point numbers (numbers with a decimal point) into a floating-point number.

```class FloatingAndIntegerDivision {
  public static void main(String args[]) {
    System.out.println(90 / 5);
    System.out.println(10.0 / 5.0);
  }
} ```
