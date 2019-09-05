package com.company.lesson_36;
/* MovieFactory
1. Добавить абстрактный класс Movie с абстрактным методом String getGenre().
2. Добавить классы SoapOpera, Cartoon, Thriller и унаследовать их от Movie и реализовать метод String getGenre():
- в классе SoapOpera метод getGenre() должен вернуть строку "Genre is drama";
- в классе Cartoon метод getGenre() должен вернуть строку "Genre is comedy";
- в классе Thriller метод getGenre() должен вернуть строку "Genre is horror";
3. Создать класс MovieFactory с методом getMovie(String key)
4. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
5. Добавить в MovieFactory.getMovie получение объекта SoapOpera для ключа "soapOpera".
6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".

7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName() + movie.getGenre();.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read;
        Movie movie;
        label:
        while (true) {
            read = reader.readLine();
            switch (read) {
                case "cartoon":
                    movie = MovieFactory.getMovie(read);
                    System.out.println(movie.getClass().getSimpleName() + movie.getGenre());
                    break;
                case "thriller":
                    movie = MovieFactory.getMovie(read);
                    System.out.println(movie.getClass().getSimpleName() + movie.getGenre());
                    break;
                case "soapOpera":
                    movie = MovieFactory.getMovie(read);
                    System.out.println(movie.getClass().getSimpleName() + movie.getGenre());
                    break;
                default:
                    break label;
            }
        }

    }
}


class MovieFactory {
    static Movie getMovie(String key) {
        Movie movie = null;
        if ("cartoon".equals(key)) {
            movie = new Cartoon();
        } else if ("thriller".equals(key)) {
            movie = new Thriller();
        } else if ("soapOpera".equals(key)) {
            movie = new SoapOpera();
        }
        return movie;
    }
}

abstract class Movie {
    abstract String getGenre();
}

class SoapOpera extends Movie {
    @Override
    String getGenre() {
        return "Genre is drama";
    }
}

class Cartoon extends Movie {
    @Override
    String getGenre() {
        return "Genre is comedy";
    }
}

class Thriller extends Movie {
    @Override
    String getGenre() {
        return "Genre is horror";
    }
}
