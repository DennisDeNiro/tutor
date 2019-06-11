package com.company.lesson_23Exeption;

// Throwable
// - Exception (checked)
//  - RuntimeException (unchecked)
//  - ... (checked)
// - Error (OutOfMemoryError, StackOverflowError) (unchecked)

// try catch throws throw finally

public class Test_02 {
    public static void main(String[] args) {
        System.out.println("Before try");

        try {
            System.out.println("Inside try 1");
            int a = 50 / 0;
            System.out.println("Inside try 2");
//            int[] arr = new int[1];
//            System.out.println(arr[2]);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exc");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds exc");
        } catch (Exception e){
            System.out.println("Another exc");
        } finally {
            System.out.println("Finally");
        }

        System.out.println("After try");
    }
}
