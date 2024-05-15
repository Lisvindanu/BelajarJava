/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Pertemuan11.latihan2.LatihanMandiri.Data;

import java.util.Scanner;

public interface PsVita {
    public boolean IsCartridgeInserted(String game);
    public void downloadGame(String game);


    void deleteGame(String game, Scanner scanner);
}
