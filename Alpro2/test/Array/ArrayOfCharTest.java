package Array;

public class ArrayOfCharTest {
    private ArrayOfChar arrayOfChar;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        arrayOfChar = new ArrayOfChar();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testMainWhenExecutedThenStateUpdated() {
        String input = "hello\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ArrayOfChar.main(new String[]{});
        assertEquals(5, arrayOfChar.N);
        assertEquals('h', arrayOfChar.GetElemen(0));
        assertEquals('e', arrayOfChar.GetElemen(1));
        assertEquals('l', arrayOfChar.GetElemen(2));
        assertEquals('l', arrayOfChar.GetElemen(3));
        assertEquals('o', arrayOfChar.GetElemen(4));
    }

    @Test
    public void testMainWhenExecutedThenOutputCorrect() {
        String input = "hello\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ArrayOfChar.main(new String[]{});
        String expectedOutput = "Isi Array A\n" +
                "String: \n" +
                "Panjang String: 5\n" +
                "Array ke 0: h\n" +
                "Array ke 1: e\n" +
                "Array ke 2: l\n" +
                "Array ke 3: l\n" +
                "Array ke 4: o\n" +
                "Nilai terbesar = o\n" +
                "Nilai terbesar di indeks = 4\n" +
                "Apakah kata ini palindrom :false\n" +
                "Array ke 0: o\n" +
                "Array ke 1: l\n" +
                "Array ke 2: l\n" +
                "Array ke 3: e\n" +
                "Array ke 4: h\n" +
                "Array ke 0: o\n" +
                "Array ke 1: l\n" +
                "Array ke 2: l\n" +
                "Array ke 3: e\n" +
                "Array ke 4: h\n" +
                "Isi Array A\n" +
                "String: \n" +
                "Panjang String: 5\n" +
                "Array ke 0: h\n" +
                "Array ke 1: e\n" +
                "Array ke 2: l\n" +
                "Array ke 3: l\n" +
                "Array ke 4: o\n" +
                "out: Array A dan B sama? false\n";
        assertTrue(outContent.toString().contains(expectedOutput));
    }
}