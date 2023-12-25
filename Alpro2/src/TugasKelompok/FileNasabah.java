    package TugasKelompok;

    import java.io.*;
    import java.util.Scanner;

    public class FileNasabah {


        void SaveToFile(){
            int Norek;
            String Nama;
            Double Saldo;

            Nasabah Record = new Nasabah();
            Scanner input = new Scanner(System.in);
            System.out.println("==========SAVE TO FILE==========");
            ObjectOutputStream out = null;
            try {
            out=new ObjectOutputStream(new FileOutputStream("Nasabah.dat"));
                System.out.println("Norek : ");Norek=input.nextInt();
                while (Norek!=999) {
                    System.out.println("Nama : ");Nama=input.next();
                    input.nextLine();
                    System.out.println("Saldo : ");Saldo=input.nextDouble();
                    Record = new Nasabah(Norek, Nama, Saldo);
                    out.writeObject(Record);
                    System.out.println("Norek : ");Norek=input.nextInt();
                }
                out.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }



        void BacaFileNasabah() throws FileNotFoundException, IOException{
            System.out.println("==========READing FILE==========");
            ObjectInputStream in = null;
            Nasabah Record = new Nasabah();
            int total=0;
            try {
                in = new ObjectInputStream(new FileInputStream("Nasabah.dat"));
                Object curRecord = in.readObject();
                try {
                    while (true) {
                        Record = (Nasabah) curRecord;
                        System.out.println("Norek : " + Record.getNorek());
                        System.out.println("Nama : " + Record.getNama());
                        System.out.println("Saldo : " + Record.getSaldo());
                        total++;
                        curRecord = in.readObject();
                    }
                } catch (EOFException e) {
                    System.out.println("Total record " + total);
                } catch (ClassNotFoundException e) {
                    System.out.println("Class not found");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }

        void UpdatePin() throws FileNotFoundException, IOException{
            System.out.println("==========Tahap 1==========");
            ObjectInputStream in = null;
            Nasabah Record = new Nasabah();
            int total=0;
            Scanner input = new Scanner(System.in);
            System.out.println("Norek cari: "); int NorekCari=input.nextInt();
            System.out.println("Norek cari: "); int NamaBaru=input.nextInt();
            try {
                in = new ObjectInputStream(new FileInputStream("Nasabah.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("temp.dat"));
                Object curRecord = in.readObject();
                try {
                    while (true) {
                        Record = (Nasabah) curRecord;
    //                    System.out.println("Norek : " + Record.getNorek());
    //                    System.out.println("Nama : " + Record.getNama());
    //                    System.out.println("Saldo : " + Record.getSaldo());
                        if(Record.getNorek()==NorekCari)
                            Record.setNama(String.valueOf(NamaBaru));
                        out.writeObject(Record);
                        total++;
                        curRecord = in.readObject();
                    }

                } catch (EOFException e) {
                    System.out.println("Total record " + total);
                    out.close();
                } catch (ClassNotFoundException e) {
                    System.out.println("Class not found");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            System.out.println("==========Tahap 2==========");
            try {
                in = new ObjectInputStream(new FileInputStream("temp.dat"));
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Nasabah.dat"));
                Object curRecord = in.readObject();
                try {
                    while (true) {
                        Record = (Nasabah) curRecord;
                        out.writeObject(Record);
                        total++;
                        curRecord = in.readObject();
                    }
                } catch (EOFException e) {
                    System.out.println("Total record " + total);
                } catch (ClassNotFoundException e) {
                    System.out.println("Class not found");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }

        public static void main(String[] args) throws FileNotFoundException,IOException {
            FileNasabah fileNasabah = new FileNasabah();
//            fileNasabah.SaveToFile();
//            fileNasabah.BacaFileNasabah();
//            fileNasabah.UpdatePin();
            fileNasabah.BacaFileNasabah();
        }
    }
