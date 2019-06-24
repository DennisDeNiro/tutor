package com.company.lesson_25;
/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
NullPointerException
IndexOutOfBoundsException
NumberFormatException
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/
public class Test_01 {
    public static void main(String[] args) throws Exception {

    }

//    private static String  processExeption(){
//        try{
//
//        }catch (Exception e){
//
//        }
//    }
    private void method(){
        throw new NullPointerException();
    }
    private void method1(){
        throw new IndexOutOfBoundsException();
    }
    private void method2(){
        throw new NumberFormatException();
    }
}
