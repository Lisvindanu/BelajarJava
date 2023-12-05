package oopDasar;

public class MahasiswaAppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testMainWhenValidInputThenSuccess() {
        String input = "2\nJohn\n2\nMath\n3\n80\nPhysics\n4\n85\nJane\n1\nEnglish\n3\n90\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MahasiswaApp.main(new String[]{});
        String expectedOutput = "Nama Mahasiswa: John\n" +
                "Mata Kuliah ke-1: Math\n" +
                "Angka Nilai: 80\n" +
                "Mata Kuliah ke-2: Physics\n" +
                "Angka Nilai: 85\n" +
                "IPK: 3.4285714285714284\n" +
                "Nama Mahasiswa: Jane\n" +
                "Mata Kuliah ke-1: English\n" +
                "Angka Nilai: 90\n" +
                "IPK: 3.0\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMainWhenNegativeNumberOfStudentsThenError() {
        String input = "-1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MahasiswaApp.main(new String[]{});
        String expectedOutput = "Masukkan jumlah mahasiswa: ";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testMainWhenZeroNumberOfStudentsThenError() {
        String input = "0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        MahasiswaApp.main(new String[]{});
        String expectedOutput = "Masukkan jumlah mahasiswa: ";
        assertEquals(expectedOutput, outContent.toString());
    }
}