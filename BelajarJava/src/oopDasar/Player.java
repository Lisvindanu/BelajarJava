package oopDasar;

public class Player {

    //definisi atribut
    String name;
    int speed;
    int healthPoin;

    // definisi method yang namanya run
    void run(){
        System.out.println(name + " is running...");
        System.out.println("Speed : " + speed);

    }

    //definisi method isDead untuk mengecek nilai healthPoin
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
}
