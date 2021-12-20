<h2 align="center">Java has the following characteristics : </h2>

- **It is easy to use and portable**: Memory management with pointers is not permitted.
- It is not dependent on the host platform.
- **It is Secure and Dynamic**: It is designed to securely run code from distant sources.
- It has language support as well as networking libraries.
- **It is Robust**: Java has its own powerful memory management system. This helps to eliminate errors by checking the code during compilation and execution.
- **Java is Multi-threaded**: it supports numerous thread executions (i.e. lightweight processes), as well as a set of synchronization primitives.

**Java** is a widely used programming language for embedded system development, backend systems, and APIs. It's referred to as an object-oriented programming language. Some of Java's core concepts include **Recursion** and **Parallelism**.

The **class** is the primary organizational unit in a Java application. The most basic Java application has only one class. **A class is a collection of methods**, among other things.

Methods are classified into two types: static methods and non-static methods. The method is declared with the keywords public static void, the function's name, parentheses enclosing the function's parameters (String[] args), an open curly brace, and a closing curly brace.

The process of restructuring code into different files, classes, methods, libraries, or functions is known as **factoring**.

A method called System.out.println can be used to print the text "Hello, World!" to the screen.  `System.out.println("Hello, World!");`.

`System.out` is the name of an object that represents our program's main printed output device. So `System.out.println` invokes the `System.out` object's `println` method.

`n` represents a newline, and `t` represents a tab.

`System.out.format("%f is an approximation of pi.", 3.14159)`

The format specifier `%f` denotes the location where the parameter 3.14159 should be substituted. The letter `f` in `%` f denotes that the value will be in the form of a floating point number. For an integer, we use `%d`.

### String Concatenation

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

### Typecasting

We must occasionally compel Java to transform one type of data to another. For instance, if we had two int variables and want to split them to get a fractional number, we could convert those values to double values. We may accomplish this by **typecasting** the values, often known as **casting**. A cast operator is preceded by the value to be cast and is written with parentheses and the name of the target type. For instance, `(double) 7` returns the value `7.0`.

**Implicit Casting** : Casting is handled automatically by Java. For example, if it's stated as `18.0 / 5`, Java will opt to cast `5` into a `floating point 5.0`, which is known as a **implicit cast**. `double x = 5` is another example. The 5 on the right is an integer, but Java knows how to convert it to a double.

**Explicit Casting** : In contrast, int `x = 5.6` will not work. Java will detect that we are attempting to convert a `floating point` to an `int` and warn us that this may result in precision loss. Java can be reassured by utilizing the **casting operator** : `int x = (int) 5.6`. When casting to an integer, the section after the decimal is **truncated** rather than rounded, therefore this equation will return the value 5, rather than 6.

Java helps to integrate arithmetic and assignment using the operators +=, -=, /=, and *=. As a result, x += 9 increases the value of x by 9.

The ++ operator adds one to a value, while the -- operator subtracts one. These operators come in handy in Java for and while loops.

**Method** : A method is a collection of statements that carry out certain activities and may or may not yield a result.

### Method Parameter

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

### Method Overloading and Signature

**Method Overloading** : is the process of making a method do different actions depending on the type of its parameters. We can write two different methods with the same name in the same class as long as the parameters are different. The **method signature** is the combination of a method's name and the types of its parameters listed in sequence. Here's an illustration:

```
class Overload {
  
  public static void logIntNumber(int x) {
    System.out.println("This is an integer " + x);
  }
  
  public static void logDoubleNumber(double x) {
    System.out.println("This is a double " + x);
  }
  
  public static void main(String[] args) {
    logIntNumber(42);
    logDoubleNumber(3.1415);
  }
  }
  
```

**Benefits of Method Overloading** : The code gets simpler and cleaner as a result of method overloading. We don't need to keep track of many techniques. Method overloading is critical in the implementation of polymorphism.

### Method return values
  
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
### Another example
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

## Conditional and logical operator

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
      i++;               // change the value of the variable i.e. increment
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
**Nested For Loop** :

```
for (int i=0; i<n; i++){
    for (int j=0; j<m; j++){
        System.out.println(i*j);
    }
}
```

### Object Oriented Programming

**Classes** are the fundamental components of **object-oriented** applications. They are used to construct data types that are specific to the user. A **module** is represented by an **object**, and its **definition** is represented by a **class**. We can use classes to make more complex objects and applications. They're also great for compartmentalizing an application's code. Different components could be separated into classes that communicate via interfaces. These ready-to-use components will be available in future applications as well. Because it is easier to make changes in classes, the use of classes makes it easier to maintain the various parts of an application.

**Fields** : are also known as a class's member variables.  A class's data members are called fields in Java. This is due to the fact that they include information pertinent to the class's object.

**Methods** : are a type of attribute that allows the class object to carry out operations using its the fields.

### Class Creation

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
class Ferrari { // Class name
  
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

### Access Modifiers

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

The `.` operator may be used to access public members of a class via a class object as shown below 👇


```  
Batsman Kohli = new Batsman(); // Object created
c.scoreRuns(); // Can access the runs since it's public
```

- **Protected** : is a one-of-a-kind  category. It's members' access level is something between `private` and `public`. The `protected` tag's principal application is in **inheritance**, which is the process of building classes from other classes. Within a  package, the `protected` data members can be accessed. They can only be referred to outside of the package using an **inherited** class. An example is given below 👇

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

### Get and Set methods

A **get** method obtains the value of a certain data field, whereas a **set** method sets its value.

### Constructor

**Constructor** : is used to create a class object. It is a particular method that describes the processes that are taken when a class instance is generated in the application. The name of a constructor must be the same as the name of its class.

- **Default Constructor** : We define the default values for the class's data members. As a result, the constructor produces an object with the data members set to their default values.

### Reference variable `this`

Every class has a `this` reference variable. It refers to the class object as a whole. When we have an argument with the same name as a data member, we utilize this  `this.refName` to indicate that we are attempting to access the class's `refName` variable. We utilize the `this` keyword to refer to a constructor when calling it from another constructor.

**Data Hiding** : is the notion of concealing a class's inner workings and just providing an interface through which the outside world may interact with the class without understanding what's going on inside. Data hiding is made up of two major components :

- **Encapsulation** : refers to the binding of data and the methods for manipulating that data into a single unit (class).
- **Abstraction** : In Object-Oriented Programming, abstraction refers to just presenting the user the important characteristics of an object while concealing the underlying details to decrease complexity. For example, a user can only engage with the application's limited functionalities and is uninformed of the application's implementation specifics or development process. The functioning of an application is usually all that matters to users. An admin, on the other hand, has a lot more power. The administrator may keep track of the users' activities, understand how the app was built, and add new features by deploying them to the app. Abstraction focuses on what the program can do rather than how it will be implemented.

  - **Abstract Method** : An abstract method is one that has the term `abstract` in its declaration. Only an abstract class or an interface can declare an abstract method. Because non-abstract classes cannot have abstract methods, a class must be designated as an abstract class in order to have any abstract method in its implementation. Moreover, an abstract method cannot be made private since it must be implemented in another class. An example would be something like this :  `public abstract void methodName(parameter(s));` .

  - **Abstract Class** : An abstract class is one whose declaration includes the word `abstract`. An abstract class must be inherited from in order to be used. All abstract methods specified in the parent abstract class must be implemented by the class that inherits from it. It cannot be instantiated, that is, an object of an abstract class cannot be created. All abstract methods specified in the parent abstract class must be implemented by the class that inherits from it.

 ```
      abstract class Batsman {

        public abstract void scoreRuns();

        public void drive() {
          System.out.println(getClass().getSimpleName()+" nice driving shot");
          //getClass().getSimpleName() is an inbuilt functionality of Java
          //to get the class name from which the method is being called
        }
  
      }

      class Kohli extends Batsman {

         @Override
         public void scoreRuns() {
         System.out.println("Scored 2 runs");
        }
  
      }

      class Kane extends Batsman {

         @Override
          public void scoreRuns() {
          System.out.println("Scored 4 runs");
          }
  
      } 

      class Babar extends Batsman {

        @Override
        public void scoreRuns() {
        System.out.println("Scored 6 runs");
      }
    }

      class Main {
  
        public static void main(String args[]) {
          // Creating the objects
          Batsman kohli = new Kohli();  
          Batsman kane = new Kane();
          Batsman babar = new Babar();

          kohli.scoreRuns();    // Calling methods from Kohli
          kohli.drive();

          kane.scoreRuns();    // Calling methods from Kane
          kane.drive();

          babar.scoreRuns();  // Calling methods from Babar
          babar.drive();
        }
  
      }
 ```

- **Inheritance** :  allows us to construct a new class from an existing one. The new class is a customized version of the existing class that inherits all of the old class's non-private fields (variables) and methods. The current class is utilized as a starting point or as a foundation for the creation of the new class. Inheritance implements a  `IS A` form of relationship between objects. For example, men/women IS A human being, a computer IS A gadget, an apple iPhone `IS A` cellphone. The practical use case of **inheritance** is that we can create new classes by reusing existing ones.

There are two sorts of classes:

1. **SuperClass (Mother/ Base Class)**: This class permits non-private members of one class to be reused by another.

2. **SubClass (Child/ Derived Class)**: This class inherits from the superclass. A child class shares all of the mother class's non-private attributes. All non-private members of a child class are defined in the child class. All non-private members of a child class are defined in the mother class.

To implement inheritance, we may utilize the term `extends`. At any one moment, a class may only extend from one other class, and it cannot extend itself.

### Advantage of using Inheritance :

Inheritance allows us to eliminate redundant coding, which saves us time and effort. It also allows us to reuse that code in the future if necessary. We can extend the base class logic to reflect the derived class's business logic. This is a simple technique to upgrade or improve individual aspects of a product without compromising the main characteristics. If necessary, we may hide the data by making it private within the base class.

### Example :

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

### Multiple Inheritance :

**Multiple Inheritance** :  occurs when a class is derived from more than one base class, i.e. when a class has more than one direct parent class. A good example would be an allrounder player in cricket, such as Shakib, who is both a batsman and a bowler.

## Interface : 

**Interface** : An interface is similar to a class in that it describes the behavior that a class should have. It is a contract that a class must meet while implementing an interface. The following methods are available in an interface :

```static method(s),
      private method(s),
          private static method(s),
              public static final variable(s),
                  abstract method(s),
                       default method(s).
```

An interface cannot contain constructor(s). A class may implement an unlimited number of interfaces. An interface cannot be made private or protected, but it can 'extend' from another. While a class employs the keyword `implements` to use an interface, an interface employs the keyword `extends` to use/employ another interface.


```
// Base class Batsman
class Batsman {

  // Common trait of all batsman's so implemented in the base class
  public void score() {
    System.out.println(getClass().getSimpleName() + " is scoring runs!");
  }
  
}// End of Batsman class

interface CanScoreRuns {

  // The method is by default abstract and public
  void scoreRuns();
  
}// End of CanScoreRuns interface

class Kohli extends Batsman implements scoreRuns { // Kohli is extending from Batsman and implementing scoreRuns

  @Override               // If we don't implement the scoreRuns() we will get an error!
  public void scoreRuns() { // Overriding the method of CanScoreRuns interface
    System.out.println("Kohli canScoreRuns!");
  }
} // End of Kohli class

class Babar extends Batsman { // Babar extending Batsman
  
  // Babar can hit nice shots for 4s so implementing hitFour function just for him
  public void hitFour() {
    System.out.println("Babar is hitting 4 runs!");
  }
  
} // End of Babar class

class Main {

  public static void main(String[] args) {

    Kohli kohli = new Kohli();   // Creating the Kohli object
    Babar babar = new Babar(); // Creating the Babar object

    parrot.score();
    parrot.scoreRuns();

    System.out.println();    // Just creating a newline on console

    babar.score();
    babar.hitFour();

  } // End of main()
  
} // End of Main class

```

A class may implement several interfaces, and an interface may extend from multiple interfaces.

### Benefits of using Interfaces : 

- Multiple inheritance may be accomplished through the usage of interfaces.

- Interfaces can be used in an application to create loose coupling. This means that a modification in one class has no effect on how the other class is implemented.

- It may be used to break up complicated designs and clear dependencies between objects.

- It enable us to attain complete abstraction.

### Default Interface Method : 

**Default Method** : Methods with a body are referred to as default methods. The most common application of default methods in interfaces is to extend the functionality of a particular type without breaking down the implementing classes. Example :

```

public interface MoneyTransfer {

    void sendMoney();

    default void quickSend() {
        System.out.println("Sending money in a blitz!!!");
    }
}

```

### Static Interface Method :

**Static Interface Method** : The static methods in interfaces are comparable to default methods, with the exception that we can't override them. If we want to give an implementation in our interface but don't want the implementing class to override it, we can declare the method static.

## Polymorphism : 

**Polymorphism** : is a mixture of two Greek words: Poly (many) and Morph (forms). For example, from the base class of Shape, we may derive subclasses such as Rectangle, Pentagon, Circle, and so on. This is accomplished by extending the base class to create new sub-classes.

## Dynamic Polymorphism : 

**Dynamic Polymorphism** : is the technique that allows methods in the base and derived classes to have the same name, return type, and parameters. Runtime polymorphism is another name for it.

## Static Polymorphism :

**Static polymorphism**, often known as compile time polymorphism, is a type of polymorphism that occurs during the compilation process of a program. In static polymorphism, method overloading is utilized.

## Method Overriding :

**Method Overriding** : The process of redefining a parent class's method in a subclass is known as method overriding. It is referred to as runtime polymorphism. It allows a child class to implement its own customized method that is already offered by the parent class. In other words, it allows a child class to give a more detailed implementation of a method that already exists in its parent class.  It occurs during the execution of the program. One of the cool things about this process is that without altering the parent class methods, the derived classes can provide their own specialized implementations for inherited methods. At least one method with the same name must exist in both the parent and child classes. Moreover, the same kind and amount of parameters must be included in both the child and parent classes. Because the data binding is done at runtime, performance is mediocre. For example, when we click the submit button for an assignment, it is submitted, but we have no idea how the underlying stuff works once we hit the button.

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

**Method overloading** : When two or more methods in the same class have the same name but distinct parameters, this is known as overloading. It is often referred to as compile-time polymorphism. Example : 

```
class Batsman{
  public void scoreRuns(){
    System.out.println("Nice cover drive to score 2 runs");
  }

    //overloading method
    // we have different parameters even though the method name is the same 
    public void scoreRuns(int runs){
     for(int i=0; i<runs; i++)
      System.out.println("Keep on scoring those runs!!!");
    }
}

```

### Relationship between classes : 

**Aggregation** : In aggregation, the `has-A` model is utilized. This establishes a parent-child connection between the two classes, with one owning the object of the other. The lifespan of the acquired object is independent of the owner's lifespan in aggregation. By referring to the child object, the parent simply has a reference to the child, which removes the child's reliance on parent object.

**Composition** : The technique of generating additional class objects in our class is known as **composition**. In this case, the owner is the class that produces the other class's object and is responsible for the object's lifetime. Unlike aggregation, the lifespan of an owned thing is determined by the owner's lifespan in **composition**.

## Recursion :

**Recursion** : When a method recurses, it calls itself again and again until it hits a defined stopping condition. The procedure described above is known as a **recursive** method. Because recursion is always used on a method, it becomes a process. For each recursive call, recursion uses the stack to record variable changes.

### Advantages of using Recursion : 

- For jobs that may be specified in terms of related subtasks, a recursive technique is most helpful.

- When compared to iterative code, recursive code takes less time to write. We just need to declare the base case and recursive case for a recursive method, therefore the code is simpler and shorter than iterative code.

- When loops are compiled or interpreted, they are usually turned to recursive methods.

### Disadvantages of using Recursion : 

- Recursive code is slower than iterative code. It must not only execute the program but also access the stack memory.

### Types of Recursive Method : 

Each recursive technique is made up of 2 components:

1. The **base case** is when the call to the method ends and no more recursive calls are made.
2. The **recursive case** occurs when a method calls itself again and over until it reaches the base case.

### Factorial : 

**Factorial** : A factorial is the product of an integer and all the positive integers that come after it. It is represented by the symbol: `!` . For example, Factorial of 5 (i.e. `5!`) is : `5 x 4 x 3 x 2 x 1 = 120` .  

**Indirect recursion** (or mutual recursion) : happens when one method calls another, causing the original method to be called again.

**Direct recursion** : When a method calls itself within its own body, this is known as direct recursion.

### Iteration : 

**Iteration** : Iterative code is a piece of code that loops. In other words, the same code is duplicated repeatedly. It is a looped section of the code. To put it another way, the same code is repeated again. It refers to a situation in which loops are used to repeat some statements until a condition is met. It is a sequence of instructions that are called on repeatedly and is applied to variables.

### Fibonacci Sequence : 

**Fibonacci Sequence** : The Fibonacci Sequence is a well-known mathematical formula in which each number in the sequence equals the sum of the two numbers before it.

Formula : `Fn = Fn-2 + Fn-1`

### Permutation : 

**Permutation** : The various ways in which a group of things can be organized are known as permutations. It is a combination of all or some of the items in a set. The words 'cat' and 'act,' for example, are two different permutations (or arrangements) of a similar three-letter word.

### Binary Search Tree (BST) : 

A **Binary Search Tree (BST)** is a hierarchical data structure made up of vertices that are connected by edges. The left node's value is lower than the parent node's value, and the right node's value is higher than the parent node's value.

### Depth First Search (DFS) : 

**Depth First Search** : A method for traversing and searching all nodes in a graph is called **Depth First Search** . We can use the technique to see if two nodes, node x and node y, have a path connecting them.

### Topological Sort : 

**Topological Sort** : A topological sort is a linear ordering of vertices in a directed acyclic graph such that for every directed edge uv, vertex u comes before v in the ordering.In a directed acyclic graph, topological sort produces a linear ordering of vertices.

### Program : 

**Program** : A program is a sequence of instructions that are executed by a computer. It is a sequence of statements that are executed by a computers operating system to accomplish a specific task.

### Process : 

**Process** :  A process is a running program. A process is a runtime execution environment made up of instructions, user data, and system data segments, as well as a variety of additional resources including CPU, memory, address space, disk, and network I/O. A program and a process are frequently used interchangeably, however the objective is usually to refer to a process.

### Thread : 

**Thread** : A thread is a lightweight process that can be used to execute a program. A thread is a process's smallest unit of execution. A thread merely executes instructions in a sequential order. A process may include numerous threads that are active at the same time.

### Concurrency : 

**Concurrency** : Concurrency is the ability of multiple threads to execute simultaneously. It is a way to improve the performance of a computer system by allowing multiple threads to execute simultaneously. A concurrent program is one that can be divided into constituent parts, each of which can be performed out of order or in partial order without impacting the ultimate result. A concurrent system is one that may run numerous unique programs or more than one independent unit of the same program in overlapping time periods.

### Parallelism : 

**Parallelism** : A parallelism is the ability of multiple programs to execute simultaneously. A parallel system is one that must be able to run numerous programs at the same time. It is a way to improve the performance of a computer system by allowing multiple programs to execute simultaneously. A parallel program is one that can be divided into constituent parts, each of which can be performed out of order or in partial order without impacting the ultimate result. A parallel system is one that may run numerous unique programs or more than one independent unit of the same program in overlapping time periods.

### Concurrency vs Parallelism :

A **concurrent** system does **not** have to be **parallel**, but a parallel system is. A system can also be both concurrent and parallel, such as a multitasking operating system running on a multicore processor.

Concurrency is the ability to handle many tasks at the same time. Parallelism is the practice of performing many tasks at the same time.

**Concurrency and Parallelism (Coffee Machine Analogy)** : Single-processor concurrency is analogous to alternately serving customers from the two lines but with a single coffee machine, whereas parallelism is analogous to servicing each customer queue with its own coffee machine. 

**Preemptive Multitasking** : The operating system preempts a program to allow another waiting job to execute on the CPU in **preemptive multitasking**. Programs or threads have no control over how long or when they can use the CPU. The scheduler in the operating system determines which thread or application gets to utilize the CPU next and for how long.

**Cooperative Multitasking** : Cooperative Multitasking entails well-behaved applications willingly relinquishing control to the scheduler so that another program can execute. A program or thread may relinquish control after a set length of time, or if it becomes inactive or logically stuck.

**Synchronous Execution** : Synchronous execution is the practice of executing a program or thread synchronously. Synchronous execution is when a program or thread is executed in a single thread. In other words, line-by-line execution of code is referred to as synchronous execution. When a function is called, the program execution stops until the function call is finished. Before moving on to the next line of code, synchronous execution stops at each method call.

**Asynchronous Execution** : Asynchronous execution is the practice of executing a program or thread asynchronously. Asynchronous execution is when a program or thread is executed in multiple threads. In other words, the program execution is not stopped at each method call. Instead, the program execution continues to the next line of code. Asynchronous programming is a type of parallel programming in which a unit of work operates independently from the main application thread and reports its completion, failure, or progress to the calling thread. An asynchronous program does not wait for a job to finish before moving on to the next one. So in short, asynchronous (or async) execution refers to execution that does not wait for subroutines to be called.

**Latency** : is defined as the amount of time it takes to execute an operation or generate a result. Latency is also known as reaction time.

**Throughput** : is defined as the amount of time it takes to execute an operation or generate a result. Throughput is also known as response time. It is a measure of the quantity of work performed in a given length of time. Throughput in the context of concurrency may be thought of as the time it takes to run a program or calculation.

**Critical Section** : Any area of code that may be performed concurrently by more than one thread of the program and exposes any shared data or resources utilized by the application for access is considered a critical section.

**Race Condition** : A race condition is a fault in a program's timing/ordering of operations that interrupts the program's logic and leads to erroneous outcomes. When threads go over critical sections without thread synchronization, race conditions occur.

**Deadlocks** : occur when two or more threads are unable to continue because the resource required by the first thread is held by the second, and the resource required by the second is held by the first.

**Live-Lock** : When two threads repeatedly react to the activities of the other thread without making any actual progress, this is known as a **live-lock**. Think of two people trying to cross each other in a corridor as an analogy. Kiran moves to his right to allow Andrew to pass, while Andrew goes to his left to allow Kiran to pass. Now they're both blocking each other.

**Mutex** : The mutex is a synchronization primitive that is used to protect shared resources from being accessed by multiple threads at the same time. Mutex indicates reciprocal exclusion, as the name suggests. A mutex is a form of lock that is used to protect shared data like a linked list, an array, or any primitive type. A mutex restricts access to a resource or vital portion to a single thread. We can consider a mutex to be a single runway at a faraway airport. At any given moment, only one jet may land or take off from the runway. The runway cannot be used by another plane at the same time as the first.

**Semaphore** : is a method of restricting access to a set of resources. Consider semaphore as a system with a finite amount of permits to distribute. A pool of database connections that may be distributed to requesting threads is a good example. Let's say there are 10 connections available but 50 threads demanding them. A semaphore can only hand out 10 permits or connections at any given moment in this case. We can consider semaphore to be a vehicle rental company like Hertz. Customers can hire a set number of automobiles from each shop. It may hire many automobiles to multiple clients at once, but if all of the cars are rented out, any new customers must wait until one of the rented cars is returned.  For signaling between threads, semaphore can be `release()`-d or `acquire()`-d. However, while utilizing semaphores, it is critical to ensure that the permits received equal the permits returned.

**Monitor vs Semaphore** : A monitor and a semaphore are interchangeable, and one can potentially be built from the other or reduced to the other. While monitors take care of atomically obtaining the required locks, with semaphores, the developer is responsible for correctly acquiring and releasing locks, which can be error-prone.

**Moore's Law** : Gordon Moore's Law states that the number of transistors on a microchip doubles every two years, while the cost of computers is half. According to Moore's Law, the speed and capabilities of computers will rise every two years, and we will spend less for them. Moore's Law also stipulates that this expansion is exponential. 

With respect to clock speeds, Moore's law's promise of exponential growth came to an end more than a decade ago. Processor clock rates have slowed far quicker than the number of transistors that may be packed on a microchip has increased. Right after the year 2003, the linear exponential rise ceased and the trend line of exponential growth has flattened down.

We need different ways to obtain performance increases because CPUs aren't growing quicker as quickly as they used to. Multicore CPUs are one method to do this. Multicore processors, which were first introduced in the early 2000s, feature many CPUs on the same computer. Programs must be developed as multi-threaded applications to take use of this processing capacity.

**Amdahl's Law** : The greatest speedup that may be gained while parallelizing the execution of a program is defined by Amdahl's law. The law indicates the maximum potential speedup a program may obtain by utilizing more computer resources. Amdahl's law states that the speedup of a program is the ratio of the number of processors to the number of threads.  

**Synchronized** : A method or block of code is said to be synchronized when it is guaranteed that it will not be executed by more than one thread at a time. The synchronized keyword is the simplest basic construct for thread synchronization. It may be used to limit access to specific areas of a website one thread at a time.

**Executors** : Executors are a set of classes that provide a framework for creating and managing threads. The Executors class is the abstract base class for all Executor implementations. 

**Implementations by Executors** :  Consumer-producer patterns are used to create it. Threads consume the tasks we create for processing.

  - **Sequential Approach** : A thread is created for each task. The method just receives an order and attempts to carry it out. Other requests are blocked until the method has finished processing the current request.


**Thread Pool** : A thread pool is a collection of homogeneous worker threads that are allocated to do tasks. After completing a job, a worker thread is returned to the pool. Thread pools are often linked to a queue from which jobs are dequeued for execution by worker threads.


Below is an example of calling a function: 

```public static void announceDeveloperTeaTime() {
   System.out.printin("Waiting for developer tea time...");
    System.out.print In("Type in a random word and press Enter to start developer tea tim
   Scanner input = new Scanner(System.in);
   input.next();
   System.out.print In("It's developer tea time!");
public static void main(String [] args) {
   announceDeveloperTeaTime ();```

