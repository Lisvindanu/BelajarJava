package OperatorKomparasi;

public class main {
    public static void main(String[] args) {
        //operator compare... result = boolean
        int a, b;
        boolean HasilCompare;
//            equals or not?

        a = 10;
        b = 10;
        HasilCompare = (a==b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b, HasilCompare );
//        --------------------------------------------------------------------------
         a = 10;
        b = 11;
        HasilCompare = (a==b);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a,b, HasilCompare );
//        -------------------------------------------------------------------------
//        not equals
        a = 10;
        b = 10;
        HasilCompare = (a != b);
        System.out.printf("%d apakah tidak sama dengan %d ? %s \n", a, b, HasilCompare);
//        --------------------------------------------------------------------------
        a = 10;
        b = 11;
        HasilCompare = (a != b);
        System.out.printf("%d apakah tidak sama dengan %d ? %s \n", a, b, HasilCompare);
    }
}
