package Sorting;

public class SelectionSortTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testMainWhenUserInputsArrayThenSortsAndPrintsArray() {
        final String testString = "5\n3\n2\n5\n1\n4\n";
        provideInput(testString);

        SelectionSort.main(new String[0]);

        Assertions.assertEquals("Input Nilai Array\nnilai sebelum di sort\n3 \n2 \n5 \n1 \n4 \n\nNilai setelah sort\n1 \n2 \n3 \n4 \n5 \n", getOutput());
    }

    @Test
    public void testMainWhenUserInputsEmptyArrayThenPrintsEmptyArray() {
        final String testString = "0\n";
        provideInput(testString);

        SelectionSort.main(new String[0]);

        Assertions.assertEquals("Input Nilai Array\nnilai sebelum di sort\n\nNilai setelah sort\n", getOutput());
    }

    @Test
    public void testMainWhenUserInputsSingleElementArrayThenPrintsArray() {
        final String testString = "1\n7\n";
        provideInput(testString);

        SelectionSort.main(new String[0]);

        Assertions.assertEquals("Input Nilai Array\nnilai sebelum di sort\n7 \n\nNilai setelah sort\n7 \n", getOutput());
    }
}