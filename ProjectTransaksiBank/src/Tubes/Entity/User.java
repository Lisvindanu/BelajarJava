package Tubes.Entity;

import Tubes.Nasabah;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class User implements Role {
    private String nama;
    private String pin;

    public User(String nama, String pin) {
        this.nama = nama;
        this.pin = pin;
    }

    @Override
    public boolean validateCredentials(String username, String pin) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\DatFile\\Nasabah.dat"))){
            Nasabah nasabah;
            while ((nasabah = (Nasabah) in.readObject()) != null) {
                if(nasabah.getNama().equals(username) && nasabah.getPin().toString().equals(pin)) {
                    return true;
                }
            }
        }catch (EOFException e) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void setNewPin(int i) {
    }
}
