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
    public static void main(String[] args) {

    }

    private static void processExeption() throws Exception{
        int a  = (int) (Math.random()*3);
        if (a==0){
            new NullPointerException();
        }if(a==1){
            new IndexOutOfBoundsException();
        }if(a==2){
            new NumberFormatException();
        }
    }
    private static void printStack(){
        try{

        }catch (Exception e){

        }
    }
}
