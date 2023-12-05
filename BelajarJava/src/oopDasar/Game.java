package oopDasar;

public class Game {
    public static void main(String[] args) {
        //membuat objek player
        Player player = new Player();

        //mengisi atribut ipin
        player.name = "Lisvin";
        player.speed = 85;
        player.healthPoin = 0;

        player.run();

        if(player.isDead()){
            System.out.println("Game over!");
        }


    }


}
