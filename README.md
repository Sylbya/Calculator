# Calculator

I have solved an assignment (Exercise 3) from the MOOC Object-Oriented programming with Java, part II.

## Assignment Summary:

Make a simple calculator. You may create a Reader class that encapsulates the Scanner-object in order to communicate with the user. The Scanner-object can be an instance variable. Implement class Reader with the following methods:

public String readString()
public int readInteger()
To take care of the application logic of your program, a method public void start() may be used. The calculator has the commands sum, difference, product and end. Add an instance variable of the type Reader for the calculator and create the reader in the constructor. You may also implement a method private void statistics(). The method is meant to print the amount of operations done with the Calculator-object. If an invalid command is given (something other than sum, difference, product or end), the calculator should not react to the command in any way, but should instead continue by asking the next command. Statistics should not count as an invalid command as a completed calculation.
