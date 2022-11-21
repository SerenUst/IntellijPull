package day28abstraction;

public class Cat extends Mammal{
/*
Bir method " parent class"da "abstract method" ise;
Child Class o method u "override" edip kullanmak zorundadır
Bu yuzden herhangi bir fonksiyonu "Child Class" icin mecburi yapmak isterseniz o method u abstract method yapmalısınız


 */


    @Override
    public void eat() {
        System.out.println("cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cat move");
    }
}
