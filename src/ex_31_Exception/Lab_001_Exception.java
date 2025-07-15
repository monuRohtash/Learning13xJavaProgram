package ex_31_Exception;

public class Lab_001_Exception {
    public static void main(String[] args) {



    }
}
//✅ What is an Exception?
//An exception is an unexpected error that occurs during the execution of a program.
//It disrupts the normal flow of instructions.

//🔍 Types of Exceptions in Java:
//        1. Checked Exceptions
//Handled at compile time.
//
//Example: IOException, SQLException
//
//You must handle them with try-catch or throws.
//
//        2. Unchecked Exceptions
//     Occur at runtime.
//
//        Example: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException
//
//Optional to handle.

//🔧 Important Keywords:
//Keyword	Description
//try    	Wraps risky code (may throw an exception)
//catch  	Catches and handles the exception
//finally	Always runs (used to close resources)
//throw	    Manually throws an exception
//throws	Declares that a method may throw an exception