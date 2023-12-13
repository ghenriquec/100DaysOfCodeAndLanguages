# First day

Today I started the 125 days of code challenge. I'm going to start remember basics concepts of java, structuring all journey until end and then I'll move on to more advanced topics.

## What I learned today

concepts of variables, data types, operators, control flow, arrays, loops, methods, classes, objects, inheritance, polymorphism, encapsulation, abstraction, interfaces, packages, access modifiers, exceptions, generics, collections, threads, functional programming, streams, I/O, serialization, annotations, lambda expressions, and more.

## Basics concepts and logical programming
### Variables Types
- ** Primitive types **: byte, short, int, long, float, double, boolean, char.
- ** Reference types **: String, Array, Class, Interface, Enum, etc.

### Operators
#### Arithmetic operators 
- + (addition): a + b
- - (subtraction): a - b
- * (multiplication): a * b
- / (division): a / b
- % (modulo): a % b
- ++ (increment): a++ (post-increment) or ++a (pre-increment)
- -- (decrement): a-- (post-decrement) or --a (pre-decrement)

#### Assignment operators 
- = (simple assignment)
- += (addition assignment): a += b is equivalent to a = a + b
- -= (subtraction assignment): a -= b is equivalent to a = a - b
- *= (multiplication assignment): a *= b is equivalent to a = a * b
- /= (division assignment): a /= b is equivalent to a = a / b
- %= (modulo assignment): a %= b is equivalent to a = a % b

#### Relational operators
- == (equal to): a == b
- != (not equal to): a != b
- > (greater than): a > b
- < (less than): a < b
- >= (greater than or equal to): a >= b
- <= (less than or equal to): a <= b

#### Logical operators
- && (logical and): a && b
- || (logical or): a || b
- ! (logical not): !a (not a)
- !! (logical not): !!a (not not a)

### Control flow
#### Conditional statements
- if: if (condition) { ... }
- if-else: if (condition) { ... } else { ... }
- if-else if-else: if (condition) { ... } else if (condition) { ... } else { ... }
- switch: switch (expression) { case value1: ... break; case value2: ... break; default: ... break; }

#### Loops
- while: while (condition) { ... }
- do-while: do { ... } while (condition);
- for: for (initialization; condition; update) { ... }
- for-each: for (type variable : array) { ... }

### Arrays
- Declaration: type[] arrayName;
- Initialization: type[] arrayName = new type[size];
- Declaration and initialization: type[] arrayName = { value1, value2, ... };

### Methods
- Declaration: modifier returnType methodName(parameters) { ... }
- Invocation: methodName(arguments);

### Methods modifiers
- public: The method can be accessed from anywhere.
- private: The method can only be accessed from within the same class.
- protected: The method can only be accessed from classes in the same package or subclasses.
- static: The method can be invoked without creating an instance of the class.
- final: The method cannot be overridden by subclasses.
- synchronized: The method can only be accessed by one thread at a time.
- abstract: The method does not have a body and must be implemented by subclasses.
- native: The method is implemented in another programming language.


### Fundamental concepts of orientend object programming
- **Class**: A class is a blueprint for objects. We can think of class as an sketch (prototype) of a house. It contains all the details about the floors, doors, windows etc. Based on these descriptions we build the house. House is the object.
- **Object**: An object is a real world entity that has state and behavior. For example: chair, pen, table, keyboard, bike etc. It can be physical and logical.

~~~java
public class House {
    private String color;

    // Constructor
    public House(String color) {
        this.color = color;
    }

    // Method
    public void color() {
        System.out.println("The color is " + color);
    }
}
~~~

- **Encapsulation**: Encapsulation is the mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

~~~java
public class House {
    private String color;

    // public method to access the private variable color
    public String getColor() {
        return color;
    }

    // public method to set the private variable color
    public void setColor(String color) {
        this.color = color;
    }
}
~~~

- **Abstraction**: Abstraction is a process of hiding the implementation details and showing only functionality to the user. Another way, it shows only important things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.

~~~java
public abstract class Construction {
    public abstract void build();
}

public class House extends Construction {
    @Override
    public void build() {
        System.out.println("Building a house");
    }
}
~~~

- **Inheritance**: Inheritance is a mechanism in which one class acquires the property of another class. For example, a child inherits the traits of his/her parents. With inheritance, we can reuse the fields and methods of the existing class. Hence, inheritance facilitates Reusability and is an important concept of OOPs.

~~~java
// base class
public class Construction {
    private String type;

    public void paint() {
        System.out.println("Painting the " + type);
    }
}

// derived class
public class House extends Construction {
    public void doors() {
        System.out.println("Installing doors in the house");
    }
}
~~~

- **Polymorphism**: Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object. Any Java object that can pass more than one IS-A test is considered to be polymorphic. In Java, all Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object.

~~~java
public class Construction {
    public void build() {
        System.out.println("Building a construction");
    }
}

public class House extends Construction {
    @Override
    public void build() {
        System.out.println("Building a house");
    }
}

public class Building {
    public static void main(String[] args) {
        Construction construction = new Construction();
        construction.build();

        construction = new House();
        construction.build();
    }
}
~~~

- **Association**: Association is a relationship where all object have their own lifecycle and there is no owner. Let’s take an example of Teacher and Student. Multiple students can associate with a single teacher and a single student can associate with multiple teachers but there is no ownership between the objects and both have their own lifecycle. These relationship can be one to one, One to many, many to one and many to many.

~~~java
public class Resident{
    private House house;

    public Resident(House house) {
        this.house = house;
    }

    public void showHouse() {
        house.show();
    }
}
~~~


- **Aggregation**: Aggregation is a special form of association where all objects have their own lifecycle but there is ownership and child objects can not belong to another parent object. Let’s take an example of Department and teacher. A single teacher can not belong to multiple departments, but if we delete the department teacher object will not destroy. We can think about it as a “has-a” relationship.

~~~java
public class House {
    private Room room;

    public House(Room room) {
        this.room = room;
    }
}

public class Room {
    private String Color;

    public Room(String color) {
        this.color = color;
    }
}
~~~

- **Composition**: Composition is a special case of aggregation. In a more specific manner, a restricted aggregation is called composition. When an object contains the other object, if the contained object cannot exist without the existence of container object, then it is called composition. Let’s take again an example of a relationship between House and rooms. House can contain multiple rooms there is no independent life of room and any room can not belongs to two different houses if we delete the house room will automatically delete. Let’s take another example relationship between Questions and options. Single questions can have multiple options and option can not belong to multiple questions. If we delete questions options will automatically delete.

~~~java
public class House {
    private Room room;

    public House(Room room) {
        this.room = room;
    }
}

public class Room {
    private String Color;

    public Room(String color) {
        this.color = color;
    }
}
~~~

- **Modifier access**: getters and setters are used to protect your data, particularly when creating classes. For each instance variable, a getter method returns its value while a setter method sets or updates its value.

~~~java
public class House {
    private String color;

    // public method to access the private variable color
    public String getColor() {
        return color;
    }

    // public method to set the private variable color
    public void setColor(String color) {
        this.color = color;
    }
}
~~~

### Interfaces
Interface is a blueprint of a class that have static constants and abstract methods. It can be used to achieve abstraction. Interface is also called a contract between object and class. It is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

~~~java
public interface House {
    public void build();
}
~~~

### Packages
Package in Java is a mechanism to encapsulate a group of classes, sub packages and interfaces. Packages are used for: Preventing naming conflicts. For example there can be two classes with name Employee in two packages, college.staff.cse.Employee and college.staff.ee.Employee. ... Making searching/locating and usage of classes, interfaces, enumerations and annotations easier.

~~~java
package com.company;
~~~

### Exceptions
An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions. When an error occurs within a method, the method creates an object and hands it off to the runtime system. The object, called an exception object, contains information about the error, including its type and the state of the program when the error occurred. Creating an exception object and handing it to the runtime system is called throwing an exception.

~~~java
public class House {
    private String color;

    // public method to access the private variable color
    public String getColor() {
        return color;
    }

    // public method to set the private variable color
    public void setColor(String color) {
        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }
        this.color = color;
    }
}
~~~

### Generics
Generics is a feature that enables you to write a class or method that can work with any data type. It is a way to make the code more flexible and reusable. Generics are commonly used in Java Collection Framework. For example, generics are used in ArrayList, HashMap, etc. to provide compile-time safety and prevent ClassCastException.

~~~java
public class House<T> {
    private T color;

    // public method to access the private variable color
    public T getColor() {
        return color;
    }

    // public method to set the private variable color
    public void setColor(T color) {
        this.color = color;
    }
}
~~~

### Collections
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects. Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

~~~java
public class House {
    private String color;

    // public method to access the private variable color
    public String getColor() {
        return color;
    }

    // public method to set the private variable color
    public void setColor(String color) {
        this.color = color;
    }
}
~~~

### Threads
A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking. However, we use multithreading than multiprocessing because threads use a shared memory area. They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.

### Functional programming
Functional programming is a programming paradigm in which we try to bind everything in pure mathematical functions style. It is a declarative type of programming style. Its main focus is on “what to solve” in contrast to an imperative style where the main focus is “how to solve”.

### Streams
Java Stream API for Bulk Data Operations on Collections. ... Java Stream API provides a functional approach to process the data in a declarative way. Java Stream API is a sequence of elements supporting sequential and parallel aggregate operations.

### I/O
Java I/O (Input and Output) is used to process the input and produce the output. Java uses the concept of a stream to make I/O operation fast. The java.io package contains all the classes required for input and output operations.

### Serialization
Serialization in Java is a mechanism of writing the state of an object into a byte-stream. It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies. The reverse operation of serialization is called deserialization where byte-stream is converted into an object.

### Annotations
Java annotations are used to provide the meta data for your Java code. Annotations do not change action of compiled program. Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, methods, classes, etc.

### Lambda expressions
Lambda expressions basically express instances of functional interfaces (An interface with single abstract method is called functional interface. An example is java.lang.Runnable). lambda expressions implement the only abstract function and therefore implement functional interfaces

~~~java
(parameters) -> expression
or
(parameters) -> { statements; }

List<String> names = Arrays.asList("Paul", "Jane", "Michaela", "Sam");
Collections.sort(names, (a, b) -> b.compareTo(a));
~~~
