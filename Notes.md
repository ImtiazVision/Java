<h2 align="center">Java has the following characteristics : </h2>

- **It is easy to use and portable**: Memory management with pointers is not permitted.
- It is not dependent on the host platform.
- **It is Secure and Dynamic**: It is designed to securely run code from distant sources.
- It has language support as well as networking libraries.
- **It is Robust**: Java has its own powerful memory management system. This helps to eliminate errors by checking the code during compilation and execution.
- **Java is Multithreaded**: it supports numerous thread executions (i.e., lightweight processes), as well as a set of synchronization primitives.

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

**Method** : A method is a collection of statements that carry out certain activities and may or may not yield a result.

### Method Parameter :

**Method Parameters** : Method parameters make it possible to pass values to the method. The parameters are declared inside the parentheses after the method name.

**Return Type** : makes it possible to get the value from the method. It is declared before method name.

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

**Method Overloading** : is the process of making a method do different actions depending on the type of its parameters. We can write two different methods with the same name in the same class as long as the parameters are different. The **method signature** is the combination of a method's name and the types of its parameters listed in sequence. Here's an illustration:

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
**Benefits of Method Overloading** : The code gets simpler and cleaner as a result of method overloading. We don't need to keep track of many techniques. Method overloading is critical in the implementation of polymorphism.

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

**Conditional `If`** :
```
class IfSamples {
  public static void main(String args[]) {
    if(true) {
      System.out.println("This is a true statement.");
    }
    if(false) {
      System.out.println("This is not a true statement.");
    }
    
    if(5 > 3) {
      System.out.println("This is a true statement, too.");
    }
    
    if(3 > 5) {
      System.out.println("This is not a true statement.");
    }
  }
}
```
**While Loop** : 

```
class WhileLoop {
  public static void main(String[] args) {
    int number = 18; 
    while(number < 200) {    
      System.out.println(number);
      number += 15;
    }
  }
}
```
```
class WhileSample {
  public static void main(String[] args) {
    int i = 7;           // variable initialization
    while(i < 14) {      // a condition is being tested 
      System.out.println(i);
      i++;               // change the value of the variable i.e. incrementation
    }
  }
}
```

**For Loop** :
```
class ForLoop {
  public static void main(String[] args) {
    for(int i = 15; i < 25; i++) {
      System.out.println(i);
    } 
  }
}
```

### Object Oriented Programming : 

**Classes** are the fundamental components of **object-oriented** applications. They are used to construct data types that are specific to the user. A **module** is represented by an **object**, and its **definition** is represented by a **class**. We can use classes to make more complex objects and applications. They're also great for compartmentalizing an application's code. Different components could be separated into classes that communicate via interfaces. These ready-to-use components will be available in future applications as well. Because it is easier to make changes in classes, the use of classes makes it easier to maintain the various parts of an application.

**Fields** : are also known as a class's member variables.  A class's data members are called fields in Java. This is due to the fact that they include information pertinent to the class's object.

**Methods** : are a type of attribute that allows the class object to carry out operations using its the fields.

### Class Creation :
```
class SampleClass { // Class name
  

    // Main method
    public static void main(String args[]) {
    SampleClass obj = new SampleClass(); // sampleClass object
    
  }
}
```
```
//The Structure of a Class
class Ferari { // Class name
  
  // Class Data members
  int topGear;
  int totalDoors;
  String make;
  String manufacturer;
  
  // Class Methods
  void break(){
    
  }
  void park(){
    
  }
  void drive(){
    
  }
  
}
```

### Access Modifiers : 

**Access modifiers** : are tags that we may assign to each member to specify which portions of the program can directly access it. Using **access modifiers**, we may restrict access to certain data members and member functions.

  - **Private** : A private member is not accessible from outside the class. The goal is to conceal it from users and other     classes. It is common practice to keep the data members secret since we do not want anyone directly           modifying our data. Using the term private, we may make members private.
  - **Public** : The `public` tag specifies that any object in the same scope as the class object can directly access the members.
  ```
  class Batsman {
  private int runs; // Private variable
  
  public int scoreRuns(){
    return runs;  // The private variable is directly accessible over here!
  }
}
  ```
  The `.` operator may be used to access public members of a class via a class object.
  
  ```
  Batsman Kohli = new Batsman(); // Object created
c.scoreRuns(); // Can access the runs since it's public 
  ```
- **Protected** : is a one-of-a-kind  category. It's members' access level is something between `private` and `public`. The `protected` tag's principal application is in **inheritance**, which is the process of building classes from other classes. Within a  package, the `protected` data members can be accessed. They can only be referred to outside of the package using an **inherited** class.

```
package cricket;

public class Batsman {
  private int runs;
  public int scoreRuns(){
    return runs;  
  }
  protected void upperCut(){
    System.out.println("Nice shot!")
  }
}
```
### Get and Set methods :

A **get** method obtains the value of a certain data field, whereas a **set** method sets its value.

### Constructor : 

**Constructor** : is used to create a class object. It is a particular method that describes the processes that are taken when a class instance is generated in the application. The name of a constructor must be the same as the name of its class.

- **Default Constructor** : We define the default values for the class's data members. As a result, the constructor produces an object with the data members set to their default values.

### Reference variable `this` :

Every class has a `this` reference variable. It refers to the class object as a whole. When we have an argument with the same name as a data member, we utilize this  `this.refName` to indicate that we are attempting to access the class's `refName` variable. We utilize the `this` keyword to refer to a constructor when calling it from another constructor.

**Data Hiding** : is the notion of concealing a class's inner workings and just providing an interface through which the outside world may interact with the class without understanding what's going on inside. Data hiding is made up of two major components : 
  - **Encapsulation** : refers to the binding of data and the methods for manipulating that data into a single unit (class).
  - Abstraction

**Inheritance** :  allows us to construct a new class from an existing one. The new class is a customized version of the existing class that inherits all of the old class's non-private fields (variables) and methods. The current class is utilized as a starting point or as a foundation for the creation of the new class. Inheritance implements a  `IS A` form of relationship between objects. For example, men/women IS A human being, a computer IS A gadget, an apple iPhone IS A cellphone. The practical use case of **inheritance** is that we can create new classes by reusing existing ones.

There are two sorts of classes: 

1. SuperClass (Mother/ Base Class): This class permits non-private members of one class to be reused by another.


2. SubClass (Child/ Derived Class): This class inherits from the superclass. A child class shares all of the mother class's non-private attributes. All non-private members of a child class are defined in the child class. All non-private members of a child class are defined in the mother class. 

To implement inheritance, we may utilize the term extends. At any one moment, a class may only extend from one other class, and it cannot extend itself.

### Advantage of using Inheritance : 

Inheritance allows us to eliminate redundant coding, which saves us time and effort. It also allows us to reuse that code in the future if necessary. We can extend the base class logic to reflect the derived class's business logic. This is a simple technique to upgrade or improve individual aspects of a product without compromising the main characteristics. If necessary, we may hide the data by making it private within the base class.

### Example 

```
// Base Class
class Batsman {

  // Private Data Members
  private String runs;
  private String sixes;

  public Batsman() { // Default Constructors
    runs = "125";
    sixes = "5";
  }

  // Getter Function
  public String scoreRuns() {
    return runs;
  }

  // Getter Function
  public String checkSixes() {
    return sixes;
  }
  
}
```

## Polymorphism :

**Polymorphism** : is a mixture of two Greek words: Poly (many) and Morph (forms). For example, from the base class of Shape, we may derive subclasses such as Rectangle, Pentagon, Circle, and so on. This is accomplished by extending the base class to create new sub-classes. 


## Method Overriding : 

**Method Overriding** : The process of redefining a parent class's method in a subclass is known as method overriding. It allows a child class to implement its own customized method that is already offered by the parent class. In other words, it allows a child class to give a more detailed implementation of a method that already exists in its parent class.  It occurs during the execution of the program. One of the cool things about this process is that without altering the parent class methods, the derived classes can provide their own specialized implementations for inherited methods. Because the data binding is done at runtime, performance is mediocre.

```
class Batsman{
  public void scoreRuns(){ 
    System.out.println("Nice cover drive to score 2 runs");
  }
}

class Kohli extends Batsman{ 
  public void onDrive(){ 
    System.out.println("Awesome on drive for 4 runs by Kohli");
  }
  
  public void scoreRuns(){ // method overriding via same method and parameter name
    System.out.println("Nice pull shot for a maximum of 6 runs");
  }
}
```

## Method Overloading : 

**Method overloading** : When two or more methods in the same class have the same name but distinct parameters, this is known as overloading.
