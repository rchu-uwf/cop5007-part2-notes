## General Format

    Similar to Midterm 1
        True/False.
        Multiple choice.
        "What does this code do".
        Two-Three coding questions, with instructions given as a JUnit test, or as a UML diagram.

    Overview video:
        https://uwf.instructure.com/courses/18357/pages/midterm-2-review?module_item_id=900059

## File I/O

    Why do we use files?
        Data-persistence.
    Byte-streams.
        Use Scanner for input byte streams.
        Use PrintWriter for output byte streams.
        Add Scanner or PrintWriter wrapper to get/put info.
    flushing stream.

## Output formatting

    String.format() and printf().
        Precision vs width.
            Default precision for double.
        Padding (default right-justified).

## Interfaces

    Difference(s) between an abstract class and an interface.

    An abstract method is a method that is not implemented in the base class, 
    thus all derived classes must override the function. 
    An abstract method is denoted by the keyword abstract in front of the method signature. 
    A method signature defines the method's name and parameters. 
    Ex: abstract double computeArea(); declares an abstract method named computeArea().

    An abstract class is a class that cannot be instantiated as an object, 
    but is the superclass for a subclass and specifies how the subclass must be implemented. 
    An abstract class is denoted by the keyword abstract in front of the class definition. 
    Any class with one or more abstract methods must be abstract.

    A concrete class is a class that is not abstract, and hence can be instantiated.


    UML for implements.
    Know the how to illustrate both abstract class and interface using UML.
    
    Example of using an abstract class:
    public class Bird extends Animal
    
    Example of using an interface:
    public class Zipper implements Snaggable, DaysOfTheWeek

## Nested Classes

    What is the purpose of a nested class?
        Inner and outer classes can access each-others private members and methods.
        Reduce namespace pollution.
        "Kind of a hacky way to implement dual inheritance." - Prof Bitner
        
    How do we write a nested class.
        How to instantiate an inner class from an outer class.

## Generics

    ArrayList
        How is it different from an array?
        Auto-resize vs right-sized.
        Tracks how full it is.
        get and remove operations and what the resulting list is.
    Creating a generic class.

     public <DataType extends Comparable<DataType>> DataType min (ArrayList<DataType> foo)

    extends keyword even for interfaces.
    Instantiating a generic class.

    @everyone The syllabus has changed a little since last semester. 
    Generics will not be covered until next week so please ignore any mention of that subject in the review notes. 
    The course is undergoing a national-level review process right now 
    (it's been going for a a few weeks and should be over within the next week), 
    so I don't think I'm supposed to swap out the video. 
    You can safely skip from 7:50 until 11:10 since that portion is aimed at Generics


## Miscellany

    Random access vs linear access.
    UML to code, code to UML.
    JUnit.
    
## Links to Java documentation and zybooks

    https://docs.oracle.com/en/java/
    https://learn.zybooks.com/zybook/UWFCOP5007Spring2020

## Exceptions

Checked exceptions include Exception and several of its subclasses, discussed elsewhere in the context 
of file input/output. 
A common error is forgetting either to specify a throws clause or forgetting to enclose code 
that may throw exceptions with try-catch constructs, which results in a compiler error such as: 
"unreported exception java.lang.Exception; must be caught or declared to be thrown".

Unchecked exceptions are comprised of the Error and RuntimeException classes and their subclasses. 

Examples of built-in unchecked exceptions include: 
* NullPointerException
* ArithmeticException 
* IndexOutOfBoundsException
* IOError 

Unchecked exceptions are automatically thrown whenever a programmer attempts to use a null reference, 
divides an integer by zero, attempts to access a non-existing element within an array, or 
when a hardware failure causes an I/O operation to fail, respectively. 

## UML notes

### What is UML

The Universal Modeling Language (UML) is a language for software design that uses different types of diagrams 
to visualize the structure and behavior of programs. 

A structural diagram visualizes static elements of software, such as the variables and methods used in the program. 

A behavioral diagram visualizes dynamic behavior of software, such as the flow of an algorithm.

A UML class diagram is a structural diagram that can be used to visually model the classes of a computer program, 
including member variables and methods.

### UML for inheritance
UML uses an arrow with a solid line and an unfilled arrow head to indicate that one class inherits from another. 
The arrow points toward the superclass.

UML uses italics to denote abstract classes. In particular, UML uses italics for the abstract class' name, and 
for each abstract method in the class. 
As a reminder, a superclass does not have to be abstract. Also, any class with an abstract method must be abstract.


### Interfaces
UML Diagrams denote interfaces using the keyword interface, inside double angle brackets <<interface>>, 
above the class name. 

Classes that implement the interface have a dashed line with an unfilled arrow pointing at the interface. 

## UML for Nested Classes
In UML, you can use a circle with a plus inside the circle to indicate that a class is inside another class.


