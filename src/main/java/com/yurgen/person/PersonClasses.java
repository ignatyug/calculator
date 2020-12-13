package com.yurgen.person;

import io.cucumber.java.mn.Харин;

import java.util.Date;

public class PersonClasses {

    public static void main(String[] args){
        Person person1 = new Person("name-1", 545);
//        person1.name = "Pety";
//        person1.personName("Vasy");
//        person1.age = 25;
//        person1.personAge(30);
//        person1.personNameAndPersonAge("Vasky", 45);

//        person1.setName("");
//        person1.setName("test-1");
//        person1.setName("test-2");
//        person1.setAge(-1);
        System.out.println("Выводится значение из main метода " + person1.getName());
        System.out.println("Выводится значение из main метода " +person1.getAge());
        person1.speak();
        person1.years();
        int year1 = person1.strongYears();
        System.out.println("Этому человеку до пенсии осталось " + year1 + " лет");


    }
}

class Person{
    private final String name;
    private final int age;
    private final Date birthDate = new Date();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

//    public void setName(String userName){
//        if (userName.isEmpty()){
//            System.out.println("Вы не ввели имени");
//        }
//        else{
//        name = userName;}
//    }
    public String getName(){
        return name;
    }
//    public void setAge(int userAge){
//        if (userAge>0){
//            System.out.println("Возраст должен положительный");
//        }
//        else {
//            age = userAge;}
//    }
    public int getAge(){
        return age;
    }

    int strongYears(){
        int years = 65-age;
        return years;
    }

    void years(){
        int year = 65-age;
        System.out.println("Этому человеку до пенсии осталось " + year + " лет");
    }

    void speak(){
        System.out.println("Меня зовут " + name + ",  " + "Мне " + age + " лет");
    }
//    void personName(String username){
//        name = username;
//    }
//    void personAge(int userage){
//        age = userage;
//    }
//    void personNameAndPersonAge(String username, int usetage){
//        name = username;
//        age = usetage;
//
//    }
}
