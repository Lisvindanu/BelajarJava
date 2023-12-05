import java.util.Scanner;

public class UserInputDanAritmatika {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int Panjang, lebar, luas, tinggi, volume;

        System.out.println("Menghitung Luas");
        System.out.print("Panjang : ");
        Panjang = userInput.nextInt();
        System.out.print("Lebar : ");
        lebar = userInput.nextInt();
//      ----------------------------------------
         luas = Panjang * lebar;
        System.out.println("Luas : " + luas);

//        ----------------------------------------
        System.out.println("Menghitung volume");
        System.out.print("Tinggi : ");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("volume = " + volume);
    }
}
