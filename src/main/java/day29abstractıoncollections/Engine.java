package day29abstractıoncollections;

public interface Engine extends Vehicle {


    //Child           Parent

    //Class    ----> Interface   ==> implements
    //class    ----> Class       ==> extends  ****
    //interface ---> ınterface   ==> extends  ***
    //interface ---> Class       ==> Mumkun degil.



    //interface'lerdeki tum variable'lar otomatik olarak(default) "public" dir.
    //interface'lerdeki tum variable'lar otomatik olarak(default) "final" dir.
    //interface'lerdeki tum variable'lar otomatik olarak(default) "static" dir.



    int price =2000;

    double weight =23.5;


    void run();



}
