package com.company.HW.Home_work_06_OBJECT_CLASS_METHODS;

public class Home_work_01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();                //2)создать два обьекта и (инициализировать из поля?)
        dog1.name = "Rokki";
        dog1.age = 2.2f;
        dog1.tailLenght = 32;
        Dog dog2 = new Dog();
        dog2.name = "Ketti";
        dog2.age = 7.5f;
        dog2.tailLenght = 15;
        System.out.println("\033[35m Первая собака");
        System.out.println(" Name: " + dog1.name + '\n' + " age: " + dog1.age + '\n' + " Strong: " + dog1.tailLenght);
        System.out.println("Вторая собака");
        System.out.println(" Name: " + dog2.name + '\n' + " age: " + dog2.age + '\n' + " Strong: " + dog2.tailLenght);
//        System.out.format("Name is %s, age = %f, strong = %d\n", dog2.getName(), dog2.getAge(), dog2.getTailLenght()); // как добавить \n
    }
}

class Dog {
    String name;        //1) создать клас Dog с параметрами
    float age;
    int tailLenght;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public float getAge() {
//        return age;
//    }
//
//    public void setAge(float age) {
//        this.age = age;
//    }
//
//    public int getTailLenght() {
//        return tailLenght;
//    }
//
//    public void setTailLenght(int tailLenght) {
//        this.tailLenght = tailLenght;
//    }
}

