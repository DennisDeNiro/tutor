package com.company.lesson_23Exeption;

/* Исключения
Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
ArithmeticException и URISyntaxException.
*/
public class Test_08 {
    public static void main(String[] args) {
        try {
            throwingException();
        } catch (NullPointerException e) {
            System.out.println("");
        } catch (Exception e) {

        }
    }

    private static void throwingException() {
        int i = (int) (Math.random() * 4);

        if (i == 0) {

        }
        if (i == 1) {

        }
        if (i == 2) {

        }
        if (i == 3) {

        }
    }
}
