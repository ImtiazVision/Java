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

```
class FloatingAndIntegerDivision {
  public static void main(String args[]) {
    System.out.println(90 / 5);
    System.out.println(10.0 / 5.0);
  }
}
```

**Modulus Operator** : We may use the modulus operator % to get the remainder that would be left over after integer division:
```
class Modulus {
  public static void main(String args[]) {
    // output is 3 leftover 
    System.out.println(18 % 5);
  }
}
```

### Typecasting : 

We must occasionally compel Java to transform one type of data to another. For instance, if we had two int variables and want to split them to get a fractional number, we could convert those values to double values. We may accomplish this by **typecasting** the values, often known as **casting**. A cast operator is preceded by the value to be cast and is written with parentheses and the name of the target type. For instance, `(double) 7` returns the value `7.0`.

**Implicit Casting** : Casting is handled automatically by Java. For example, if it's stated as `18.0 / 5`, Java will opt to cast `5` into a `floating point 5.0`, which is known as a **implicit cast**. `double x = 5` is another example. The 5 on the right is an integer, but Java knows how to convert it to a double.

**Explicit Casting** : In contrast, int `x = 5.6` will not work. Java will detect that we are attempting to convert a `floating point` to an `int` and warn us that this may result in precision loss. Java can be reassured by utilizing the **casting operator** : `int x = (int) 5.6`. When casting to an integer, the section after the decimal is **truncated** rather than rounded, therefore this equation will return the value 5, rather than 6.

Java helps to integrate arithmetic and assignment using the operators +=, -=, /=, and *=. As a result, x += 9 increases the value of x by 9. 

The ++ operator adds one to a value, while the -- operator subtracts one. These operators come in handy in Java for and while loops.

### Method Parameter :

```
class MethodParameters {

  public static void logRandomNumber(int x) {
    System.out.println("This is a random number " + x + ".");
  }
  
  public static void main(String[] args) {
    logRandomNumber(100);
 
  }   
}
```
**Code Walkthrough** : Parameters are the method's local variables. The code int x introduces a new int variable, x, in the definition of logMyNumber(int x). When the method is invoked, the value 100 is transferred into the variable x, and the logMyNumber function is executed.

### Method Overloading and Signature :

**Method Overloading** : We can write two different methods with the same name in the same class as long as the parameters are different. The **method signature** is the combination of a method's name and the types of its parameters listed in sequence. Here's an illustration:

```
class Overload {
  
  public static void logIntNumber(int x) {
    System.out.println("This is an integer " + x);
  }
  
  public static void logDoubleNumber(double x) {
    System.out.println("Thsi is a double " + x);
  }
  
  public static void main(String[] args) {
    logIntNumber(42);
    logDoubleNumber(3.1415);
  }
  }
  
```
  ### Method return values :
  
The type of value returned by a method must be specified in the method declaration. The type of the return value is indicated by the final word before the method name in the method declaration. As we can see, square returns a double, whereas isEven produces a boolean. Even if the method has no return value, the return type must be stated.
  
```
class Sample {
  public static double square(double a) {
    return a * a;
  }
  
  public static boolean isEven(int a) {
    return a % 3 == 0;
  }
  
  public static void main(String[] args) {
    System.out.println(isEven(7));
    System.out.println(square(6));
  }
}
```

**The main method** : The `public static void` keyword is used to declare the method `main`. The `void` character indicates that `main` does not `return` a value.

**String** : When string data is typed in quotes in code, it is referred to as a string literal, and treated  as literal string data rather than code.

**Class** : A class is a group of methods that we can use. It is a container for a custom data type that can be used to create objects of that type. A string class defines a String data type that can be used to create string objects and provides some useful methods for Strings.

**Static method** : The method `valueOf` takes only one parameter, which can be a double, int, or boolean. It then creates a string representation of that parameter and returns it.

```
class valueOf {
  public static void main(String args[]) {
    String myFavoriteNumber;
    int x = 67;
    
    myFavoriteNumber = String.valueOf(x);
    
    System.out.println("My favorite number is " + myFavoriteNumber + ".");
    
  }

}
```

**String Object** : A class not only contains the code for methods, but it also allows you to create an object of that class. An object is a memory structure that stores values, among other things. The value of each character in the string, as well as the length of the string, are stored in a String object.

```
class SampleStringsAsObjects {
  public static void main(String[] args) {
    String a;
    a = "appleisyummy";
    System.out.println(a.length());
    System.out.println(a.toUpperCase());
    System.out.println("The character at index 5 is: " + a.charAt(5));
    
  }

}
```

**Chat data type** : Strings can be used with the `charAt` method. `charAt` does not return a String, but rather something called a `char`. It is a primitive data type because variables of this data type are built-in and have no methods to act on them. It (`char`) represents a single text character.

```
class CharSample {
  public static void main(String[] args) {
    char character = 'B';
    String magicWord = "KMEIW";
    
    char anotherChar = magicWord.charAt(0);

    System.out.println(character);
    System.out.println(anotherChar);
    // When we concatenate them, it outputs the added unicode integer 
    System.out.println(character + anotherChar);
  }
}
```

Variables do not hold actual objects, but rather references to objects. A reference is loosely defined as the address of the data that stores the object in memory. 

Making objects of the String class immutable protects against accidental string changes. We can safely pass a string reference to a method without fear of the String being changed. The original string is not changed; rather, a new string is created based on the method call.

**Arrays** : Arrays cannot be resized once they have been created, and we must declare the type of variables that the array will store ahead of time.

```
class Array {
  public static void main(String[] args) {
    
    // sample integer array
    int[] myIntNums = {112, 151, 203, 255, 340};
   
    System.out.println(myIntNums[2]);
    
    // arrays have an instance variable that stores
    //  the length of the array:
    System.out.println(myIntNums.length);
    
    // Arrays can be of any type a variable can be:
    String[] sampleStrings = {"Akshay", "Raj", "John"}; 
    System.out.println("The Wizard of " + sampleStrings[0]);
    
    // arrays can be modified
    sampleStrings[2] = "Wonderland";
  }
}
```

```
class SampleArray {
  public static void main(String[] args) {
    int[] intNumbers;
    myNumbers = new int[5];
    
    myNumbers[0] = 11;
    myNumbers[1] = 12;
    myNumbers[2] = 13;
    myNumbers[3] = 14;
    myNumbers[4] = 15;
    
    System.out.println("The array intNumbers has length of " + intNumbers.length);
  
  }

}
```
**The`main` method accepts a single parameter of type String array, `args`**

The Arrays class in the java.util package has methods for sorting, binary searching, and printing a textual representation of an array.

```
import java.util.Arrays;

class ArraysExample {
  public static void main(String[] args) {
    int[] myNumbers = {31, 12, 19, 37, 16};
    Arrays.sort(myNumbers);
    System.out.println(Arrays.toString(myNumbers));
    
  }
}
```
## Conditional and logical operator : 

A boolean variable can have one of two values: true or false. Boolean values are very useful for instructing a software to perform repeated actions or to perform actions only under certain conditions.

```
class Boolean {
  public static void main(String[] args) {
    boolean a = true;
    System.out.println(a);
    System.out.println(false);
  }
}
```
We must avoid making the following mistake: assigning a value to a variable when we wanted to test its value. The operator `=` meant to assign a value to a variable, whereas `==` meant to test that variable's value.

**Logical Operators** : The `and` operator is denoted by `&&`. If both operands are true, it returns true. The `or` operator `||` functions in the same way that it does in other languages. The not operator`!` comes before a boolean `true` or `false` value that we want to negate.
