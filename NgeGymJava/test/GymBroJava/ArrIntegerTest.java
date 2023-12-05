package GymBroJava;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArrIntegerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainWhenUserInputs45391822ThenOutputContainsExpectedStrings() {
        String input = "45\n18\n39\n22\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ArrInteger.main(new String[]{});
        Assertions.assertTrue(outContent.toString().contains("Ketemu di indeks ke - :0"));
        Assertions.assertTrue(outContent.toString().contains("Ketemu di indeks ke - :1"));
        Assertions.assertTrue(outContent.toString().contains("Ketemu di indeks ke - :2"));
        Assertions.assertTrue(outContent.toString().contains("Ketemu di indeks ke - :3"));
    }

    @Test
    public void testMainWhenUserInputs1234ThenOutputContainsExpectedStrings() {
        String input = "1\n2\n3\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ArrInteger.main(new String[]{});
        Assertions.assertTrue(outContent.toString().contains("Ga nemu bos"));
    }
}