package day28abstraction;

public class Civic implements Engine, Ac , Hood {
    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi tecnology");
    }

    @Override
    public void digital() {
        System.out.println("Uses digital Ac ");
    }

    @Override
    public void climate() {
        System.out.println("Uses climate tecnology");
    }

    @Override
    public void steel() {
        System.out.println("Hood is made by steel");
    }

    //Bir class ı bir interface in child i yapmak için "implements" kullanırız.

}
