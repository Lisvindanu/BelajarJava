package GymBroJava;

public class references {
    public static void main(String[] args) {
        int m= 5;
        int n = 6;

        System.out.println("m= "+ m + " N= " + n);
        swap(m,n);
        System.out.println("m= "+ m + " N= " + n);
    }

    private  static  void swap(int a, int b)
    {
        int c = a;
        a = b;
        b = c;
    }


}
