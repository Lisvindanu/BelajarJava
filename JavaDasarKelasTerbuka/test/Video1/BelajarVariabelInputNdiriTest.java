package Video1;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BelajarVariabelInputNdiriTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainWhenUserInputsTwoIntegersThenPrintsSum() {
        String input = "5\n7\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        BelajarVariabelInputNdiri.main(new String[]{});

        String[] lines = outContent.toString().split(System.lineSeparator());
        Assertions.assertEquals("Nilai variabel a : 5", lines[0]);
        Assertions.assertEquals("Nilai variabel b : 7", lines[1]);
        Assertions.assertEquals("Nilai variabel c : 12", lines[2]);
    }

    @Test
    public void testMainWhenUserInputsNonIntegerThenPrintsErrorMessage() {
        String input = "5\nseven\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Assertions.assertThrows(NumberFormatException.class, () -> BelajarVariabelInputNdiri.main(new String[]{}));
    }
}