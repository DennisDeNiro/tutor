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
        processExeption(new Test_01());
    }

    private static void processExeption(Test_01 obj){
        try{
            obj.method1();
            obj.method();
            obj.method2();
        }catch (NullPointerException e){
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
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

//print stacktrace

