package CekUmur;

public class CekUmurAppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainWhenValidInputThenSuccess() {
        String input = "2\nJohn\n20\nDoe\n18\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        CekUmurApp.main(new String[]{});

        String[] lines = outContent.toString().split(System.lineSeparator());
        assertEquals("Nama : John", lines[2]);
        assertEquals("Umur : 20", lines[3]);
        assertEquals("Anjay gede", lines[4]);
        assertEquals("Nama : Doe", lines[5]);
        assertEquals("Umur : 18", lines[6]);
        assertEquals("Anjay gede", lines[7]);
    }

    @Test
    public void testMainWhenInvalidNumberOfPeopleThenError() {
        String input = "-1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        CekUmurApp.main(new String[]{});

        String[] lines = outContent.toString().split(System.lineSeparator());
        assertEquals("Jumlah Orang : ", lines[0]);
    }

    @Test
    public void testMainWhenInvalidAgeThenError() {
        String input = "1\nJohn\n-1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        CekUmurApp.main(new String[]{});

        String[] lines = outContent.toString().split(System.lineSeparator());
        assertEquals("Umur : ", lines[3]);
    }
}