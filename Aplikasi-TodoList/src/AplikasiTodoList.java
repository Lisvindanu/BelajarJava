public class AplikasiTodoList {public  static String[] model = new String[10]; //bikin array yang namanya model dan tipe data nya String isi array nya 10
    public static java.util.Scanner scanner = new java.util.Scanner(System.in); //buat scanner untuk input data
    public static void main(String[] args) {
        viewShowTodoList(); //memanggil program viewshowtodolist
    }

    /**
     * menampilkan todo list
     *
     */

    public static void showTodoList() {
        System.out.println("TODOLIST");
        for(var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if(todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar"; // menampilkan isi array dengan teks contoh
        model[1] = "Studi kasus java dasar : aplikasi todoList";
        showTodoList();
    }

    /**
     * menambah todo ke list
     */
    public static void addTodoList(String todo) {
        // cek apakah model penuh?
        var isFull = true;
        /**
         * Di sini, Anda mendefinisikan metode addTodoList
         *  yang mengambil satu argumen, yaitu todo.
         *   Variabel isFull digunakan untuk memeriksa apakah model (array model) penuh.
         */
        for(var i = 0; i < model.length; i++) {
            if(model[i] == null) {
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        /**
         * menggunakan loop for untuk mengiterasi melalui array model dan memeriksa apakah ada elemen yang bernilai null.
         * Jika Anda menemukan elemen yang kosong (nilai null), maka Anda mengubah nilai isFull menjadi false dan keluar dari loop dengan break.
         *  Ini digunakan untuk menentukan apakah model penuh atau tidak.
         */

        // jika penuh, kita resize ukuran array 2x lipat
        if(isFull) {
            //Jika isFull bernilai true, maka kode berikut akan dijalankan untuk mengubah ukuran array jika model penuh.

            // var temp : String[] = model;
            var tempt  = model;
            // mencoba membuat salinan array model ke dalam variabel tempt. Namun, ada kesalahan penulisan dalam komentar.
            //Anda harus menggantinya menjadi var tempt daripada var temp.
            //Ini untuk membuat cadangan sementara array sebelum mengubah ukuran array asli.

            model = new String[model.length * 2];
            //mengalokasikan ulang array model dengan ukuran baru, yaitu dua kali lipat dari ukuran sebelumnya. Ini akan menggandakan kapasitas array untuk menampung lebih banyak elemen.

            for(var i = 0; i < tempt.length; i++) {
                model[i] = tempt[i];
            }
        }
        /**
         * Selanjutnya, Anda menggunakan loop untuk mengisi array yang baru diresize (model) dengan elemen-elemen dari array cadangan (tempt) yang telah disalin sebelumnya.
         * Ini memastikan data dari array sebelumnya tetap ada dalam array yang lebih besar.
         */
        // tambahkan ke posisi yang data array nya NULL

        for(var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }

    }

    public static void testAddTodoList() {
        for(int i=0; i < 25; i++) {
            addTodoList ("contoh todo ke." + i);

        }
        showTodoList();
    }

    /**
     * menghapus todo dari list
     */
    public static boolean removeTodoList(Integer number) {
        if((number-1) >= model.length) {
            return false;
        }else if(model[number - 1] == null) {
            return false;
        } else {
            for (int i=(number - 1); i< model.length; i++) {
                if(i == (model.length -1) ) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];

                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        var  result = removeTodoList(20) ;
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);
        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    public static void testInput() {
        var name = input ("nama");
        System.out.println("Hi " + name);

        var channel = input("chanel");
        System.out.println(channel);
    }


    /**
     * menampilkan view todo list
     */

    public static void viewShowTodoList() {
        while(true) {
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("pilih");

            if(input.equals("1")) {
                viewAddTodoList();
            }else if (input.equals("2")) {
                viewRemoveTodoList();
            }else if(input.equals("x")){
                break;
            }else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public static void testViewShowTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        viewShowTodoList();
    }
    /**
     * menampilkan view menambahkan todo list
     */

    public static void viewAddTodoList() {
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Todo (x Jika Batal)");

        if(todo.equals("x")) {
            //batal
        }else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");

        viewAddTodoList();

        showTodoList();
    }

    /**
     * menampilkan view menghapus todo list
     */

    public static void viewRemoveTodoList() {
        System.out.println("MENGHAPUS TODOLIST");
        var number = input("Nomor yang Dihapus (x Jika Batal)");

        if(number.equals("x")) {

        }else {
            boolean success =	removeTodoList(Integer.valueOf(number));
            if(!success) {
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }
    }

    public static void testViewRemoveTodoList() {

        addTodoList("Satu");
        addTodoList("dua");
        addTodoList("tiga");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }

}
