-A variable is like a cup, or container to holed or store information and there are different size variables or "cups"
-If you try to fit a value into a smaller variable, you will lose information.
-you can name a class, method or variable by foloowing the rules of, Starting with a letter, "underscore" or dollar sign.
-After the first character, you can use numbers
-dont use javas reserved words
-"Declare 2 book reference variables, create 2 book objects, assign book objects to reference variables. the 2 books are now living on the "heap""
-"declare a new book refernce variable rather than creating a new one
-assign the variable "b" to "c" and this is like saying take "b" and copy it and put it in container "c"
-An array is like a tray of cups (or comngtainers) to store multiple values
-Arrays are also objects and contain elements that are variables.
-Once you declared an array, you can only store the correct data type inside.

-A class describes what an object "knows" and what an object "does"
-Every instance of a class, hasa the same methods, but the methods can have differntly based on the value of the instance variables
-A methods uses Parameters, and a Caller passes the arguments
-Every method has to have a return type, unless you make the method "void"
-methods can have multiple parameters sepeerated with a comma and seperate arguments with a comma
-when passing variable into a method, you must matchh the parmameter type
        //Encapsulation 
-when making instance variables private, you need to provide "public" getters and setters
-any place where a value can be used, a method call that returns that type can be used
-Instance variables are declared insde a class, bugt not within a method
-local variables are declared within a method and must be initialized before use

 - some classes should not be instantiated
-to prevent the class from being insantiated, mark the class "abstract" and you will no be allowed to create any instance of that type
 - you can still use that abstract type as a reference type, a big part of that would be to use it as a polymorphic argument, return type, or array
 - an abstract has no use until it is "extended"
 - you can make methods abstract too but must be "overwrittn"
 - an abstract method has no body (curly braces)
 - cant have a abstract method without an abstarct class

- when you call a method, the method lands on top of a call stack
- the method on top of the stack is always the currently running method for that stack
- if thr local variable is a reference to an object, only the variable goes on the stack
- instances variables live on the heap inside the object they belong to
- a constructor runs nefore the object can be assigned to a reference
- be sure to have a no argument constructor
- if you want a constructor that takes arguments and still want a no argument constructor, you'll have to build a no argument constructor
- if you have more that one constructor in a class, the constructor must have different argument lists
- overloaded constructors mean you have more than one constrcutor in the same class
- to compile, they must take different arguments
- all the constructors in an objects inheritances tree must run when you make a new object
- there is a super class(parent class) and subclasses (child class)
- every constructor can have a call to super class or this() but never both


