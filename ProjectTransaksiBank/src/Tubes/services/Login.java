/*
 * Copyright (c) 2024. Create with strugle. Lisvindanu and Rafli Ramdhani
 */

package Tubes.services;

import Tubes.Entity.nasabah;
import Tubes.util.InputUtil;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Login {
    private ATM atm;

    public Login() {
        String userName = null;
        String userPin = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\\\LearnJava\\\\ProjectTransaksiBank\\\\src\\\\Tubes\\\\DatFile\\\\Nasabah.dat"))){
            nasabah nasabah;
            while ((nasabah = (nasabah) in.readObject()) !=null) {
                userName = nasabah.getNama();
                userPin = nasabah.getPin().toString();
            }
        } catch (EOFException e) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.atm = new ATM(userName, userPin);
    }
    public void promptForCredentials() throws IOException {
        String username = InputUtil.inputString("Username");
        String pin = InputUtil.inputString("Pin");
        atm.login(username, pin);
    }
}
