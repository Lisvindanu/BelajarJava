/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan11.latihan2.LatihanMandiri.Data;

import java.util.Scanner;

public class myPsVita implements PsVita{

    private String game;
    private boolean isCartridge;

    public myPsVita() {
        this.game = "";
        this.isCartridge = false;
    }


    @Override
    public boolean IsCartridgeInserted(String game) {
        this.game = game;
        this.isCartridge = true;
        return isCartridge;
    }

    @Override
    public void downloadGame(String game) {
        this.game = game;
        this.isCartridge = false;
        System.out.println("Game " + game + " telah berhasil di unduh");
    }

    @Override
    public void deleteGame(String game, Scanner scanner) {
        System.out.println("Apakah anda yakin menghapus game? " + game + " y/n");
        String confirm = scanner.nextLine();
        if(confirm.equalsIgnoreCase("y")) {
            if (this.game.equals(game) && !this.isCartridge) {
                this.game = "";
                System.out.println("game " +game + "berhasil dihapus");
            }else {
                System.out.println("Tidak dapat menghapus game saat cartridge dimasukkan.");
            }
                }else {
                System.out.println("Membatalkan operasi penghapusan game " + game);
                     }
    }

    public void checkGameType() {
        if(this.isCartridge) {
            System.out.println("game " + game + " merupakan game cartridge.");
        } else{
            System.out.println("game " + game + " merupakan game digital") ;
        }
    }

}

