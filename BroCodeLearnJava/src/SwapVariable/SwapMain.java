package SwapVariable;

public class SwapMain {
    public static void main(String[] args) {
        String x = "Water";
        String y = "Cool Aid";
        String temp;



        System.out.println("x : " + x);
        System.out.println("y : " + y);

        temp = x;
        x=y;
        y = temp;



        System.out.println("x : " + x);
        System.out.println("y : " + y);

    }

}
