package Danu.Belajar.Java.Classes;

public class SystemAppTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testMainWhenCalledThenPrintsCurrentTimeAndEnvironmentVariable() {
        String homeEnv = System.getenv("Home");
        SystemApp.main(new String[]{});
        String[] output = outputStreamCaptor.toString().split("\n");
        assert output.length == 3;
        assert output[2].equals(homeEnv);
    }

    @Test
    public void testMainWhenHomeEnvironmentVariableNotSetThenPrintsCurrentTimeAndEmptyString() {
        System.getenv().remove("Home");
        SystemApp.main(new String[]{});
        String[] output = outputStreamCaptor.toString().split("\n");
        assert output.length == 3;
        assert output[2].equals("");
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}