package Lec24;

public class Student {
    int age = 18;
    String name = "Raj";

    @Override
    public String toString(){
        return this.name+" and "+this.age;
    }
}
