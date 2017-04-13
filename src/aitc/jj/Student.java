package aitc.jj;

/**
 * Created by Studenta on 06.04.2017.
 */
public class Student {

    private String name;
    private String surname;
    private int age;

    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge(int scale){

        return scale*this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void printStudent(){
        System.out.println("name: " + name + ", surname: " + surname + ", age: " + age);

    }
}
