package com.yurgen.getersAndSeters;

public class GetersAndSeters {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Tolyn");
        human1.setAge(44);
        human1.info();
        Human human2 = new Human();
        human1.setName("Yurgen");
        human1.setAge(25);
        human1.info();
    }

}

class Human{
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void info (){
        System.out.println("Меня зовут "+name+" мне  "+age + " лет");

    }
}
