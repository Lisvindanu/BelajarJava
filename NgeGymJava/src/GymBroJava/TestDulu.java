package GymBroJava;

public class TestDulu {
    public static void main(String[] args) {

        Student ilham = new Student();
        ilham.nama = "Ilham";
        ilham.umur = 19;

        Student danu = new Student();
        danu.nama = "Danu";
        danu.umur = 29;

        System.out.println("Umur Ilham" + ilham.umur);
        System.out.println("Umur Danu" + danu.umur);

        Student a = danu, b= ilham;

        int c = a.umur;
        a.umur=b.umur;
        b.umur = c;

        System.out.println("Umur ilham " + ilham.umur);
        System.out.println("Umur Danu" + danu.umur);

    }

    static class Student{
        String nama;
        int umur;
    }
}
