/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan11.latihan2.LatihanMandiri.App;

import Pertemuan11.latihan2.LatihanMandiri.Data.PsVita;
import Pertemuan11.latihan2.LatihanMandiri.Data.myPsVita;

import java.util.Scanner;

public class PsVitaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       myPsVita psVita = new myPsVita();
        psVita.IsCartridgeInserted("Persona 4 golden");
        psVita.checkGameType();

        psVita.downloadGame("Attack On Titan");
        psVita.checkGameType();

        psVita.deleteGame("Persona 4 Golden", scanner);
        psVita.deleteGame("Attack On Titan", scanner);
        scanner.close();
    }
}
