package Matrix;

public class MatrikIntTest {

    @Test
    public void testBacaMatrikWhenValidInputThenSetMatrixState() {
        MatrikInt matrikInt = new MatrikInt();
        String input = "1\n2\n3\n4\n5\n6\n7\n8\n9\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        matrikInt.BacaMatrik();
        assertEquals(1, matrikInt.Get(0, 0));
        assertEquals(2, matrikInt.Get(0, 1));
        assertEquals(3, matrikInt.Get(0, 2));
        assertEquals(4, matrikInt.Get(1, 0));
        assertEquals(5, matrikInt.Get(1, 1));
        assertEquals(6, matrikInt.Get(1, 2));
        assertEquals(7, matrikInt.Get(2, 0));
        assertEquals(8, matrikInt.Get(2, 1));
        assertEquals(9, matrikInt.Get(2, 2));
    }

    @Test
    public void testTampilMatrikWhenValidInputThenPrintMatrixState() {
        MatrikInt matrikInt = new MatrikInt();
        matrikInt.set(0, 0, 1);
        matrikInt.set(0, 1, 2);
        matrikInt.set(0, 2, 3);
        matrikInt.set(1, 0, 4);
        matrikInt.set(1, 1, 5);
        matrikInt.set(1, 2, 6);
        matrikInt.set(2, 0, 7);
        matrikInt.set(2, 1, 8);
        matrikInt.set(2, 2, 9);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        matrikInt.TampilMatrik();
        String expectedOutput = "1 \n2 \n3 \n \n4 \n5 \n6 \n \n7 \n8 \n9 \n \n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testTampilDiagonalWhenValidInputThenPrintDiagonalState() {
        MatrikInt matrikInt = new MatrikInt();
        matrikInt.set(0, 0, 1);
        matrikInt.set(1, 1, 5);
        matrikInt.set(2, 2, 9);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        matrikInt.TampilDiagonal();
        String expectedOutput = "1 \n \n5 \n \n9 \n \n";
        assertEquals(expectedOutput, outContent.toString());
    }
}