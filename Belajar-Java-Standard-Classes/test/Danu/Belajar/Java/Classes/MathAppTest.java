package Danu.Belajar.Java.Classes;

public class MathAppTest {

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
    public void testMainWhenCalledThenPrintsCorrectOutput() {
        String[] args = {};
        MathApp.main(args);
        Assertions.assertEquals("1000\n", outContent.toString());
    }
}