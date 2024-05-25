/*
 * @Author Lisvindanu
 * @Version 1.0
 * @Since
 */

package Polymorphism.Data;

public class WD2Character extends DedSec{


    private String Devices;

    public WD2Character(String nama, String skill, String asal, String devices) {
        super(nama, skill, asal);
        Devices = devices;
    }

    @Override
    public void showDedsecMember() {
        System.out.println("Name : " + getNama());
        System.out.println("Skill Special : " + getSkill());
        System.out.println("Asal : " + getAsal());
        System.out.println("Device : " + getDevices());
    }

    public String getDevices() {
        return Devices;
    }
}
