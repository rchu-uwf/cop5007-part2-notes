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
        Add Scanner or PrintWriter wrapper to get/put info.
    flushing stream.

## Output formatting

    String.format() and printf().
        Precision vs width.
            Default precision for double.
        Padding (default right-justified).

## Interfaces

    Difference(s) between an abstract class and an interface.
    UML for implements.

## Nested Classes

    What is the purpose of a nested class?
        Inner and outer classes can access each-others private members and methods.
        Reduce namespace pollution.
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

## Miscellany

    Random access vs linear access.
    UML to code, code to UML.
    JUnit.
