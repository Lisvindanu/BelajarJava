/*
 * Copyright (c) 2024. Create with strugle. Lisvindanu and Rafli Ramdhani
 */

package Tubes.Entity;

public class Admin implements Role {
    private String username;
    private String pin;

    public Admin() {
        this.username = "Admin";
        this.pin = "110011";
    }

    @Override
    public boolean validateCredentials(String username, String pin) {
        return this.username.equals(username) && this.pin.equals(pin);
    }
}
