package Tubes;

import java.io.*;
import java.util.Scanner;
public class FileNasabah {

            void SaveToFile() {
                Nasabah Record = new Nasabah();
                Scanner Input = new Scanner(System.in);
                System.out.println("==========SAVE TO FILE==========");
                ObjectOutputStream out = null;

                try {
                    out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\Nasabah.dat"));
                    System.out.println("Norek : ");Record.setNorek(Input.nextInt());
                    while (Record.getNorek() != 999) {
                        System.out.println("Pin : ");Record.setPin(Input.nextInt());
                        System.out.println("Nama : ");Record.setNama(Input.next());
                        Input.nextLine();
                        System.out.println("Saldo : ");Record.setSaldo(Input.nextDouble());
                        out.writeObject(Record);
                        System.out.println("Norek : ");Record.setNorek(Input.nextInt());
                    }
                }catch (IOException e) {
                    e.printStackTrace();
                }


            }
            void BacaFileNasabah() throws FileNotFoundException, IOException {
                System.out.println("==========Reading File==========");
                ObjectInputStream in = null;
                Nasabah Record = new Nasabah();
                int total = 0;
                try{
                    in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\Nasabah.dat"));
                    Object currentRecord = in.readObject();
                    try{
                        while (true) {
                            Record = (Nasabah) currentRecord;
                            System.out.println("Norek : " + Record.getNorek());
                            System.out.println("Pin : " + Record.getPin());
                            System.out.println("Nama : " + Record.getNama());
                            System.out.println("Saldo : " + Record.getSaldo());
                            total++;
                            currentRecord = in.readObject();
                        }
                    } catch (EOFException e) {
                        System.out.println("Total Record " + total);
                    } catch (ClassNotFoundException e) {
                        System.out.println("Class not Found!");
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (ClassNotFoundException e) {
                    throw  new RuntimeException(e);
                }

                }
            void UpdateData() throws FileNotFoundException, IOException {
                System.out.println("==========Tahap 1==========");
                ObjectInputStream in = null;
                Nasabah Record = new Nasabah();
                int total = 0;
                Scanner Input = new Scanner(System.in);
                System.out.println("Norek cari: ");Integer NorekCari= Input.nextInt();
                System.out.println("Pin Baru: ");Integer PinBaru = Input.nextInt();
                try{
                    in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\Nasabah.dat"));
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\temp.dat"));
                    Object currentRecord = in.readObject();
                    try{
                        while (true) {
                            Record = (Nasabah) currentRecord;
                            if (Record.getNorek().equals(NorekCari)) {
                                Record.setPin(PinBaru);
                                out.writeObject(Record);
                                total++;
                                currentRecord = in.readObject();
                            }
                        }
                        }catch (EOFException e) {
                            System.out.println("Total Record " + total);
                            out.close();
                        }catch (ClassNotFoundException e) {
                                System.out.println("Class Not Found!");
                        }catch (IOException e) {
                                e.printStackTrace();
                     }
                    }catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("==========Tahap 2==========");
                try{
                    in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\temp.dat"));
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\Nasabah.dat"));
                    Object currentRecord = in.readObject();
                    try {
                        while (true) {
                            Record = (Nasabah) currentRecord;
                            out.writeObject(Record);
                            total++;
                            currentRecord = in.readObject();
                        }
                    } catch (EOFException e) {
                        System.out.println("Total record " + total);
                    }catch (ClassNotFoundException e) {
                        System.out.println("Class Not Found!");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }

            }

             void TambahRecord() throws FileNotFoundException {
                    Nasabah nasabah = new Nasabah();
                    Integer norek, pin;
                    String nama;
                    Double saldo;

                 System.out.println("========== Tahap 1 ==========");
                 ObjectInputStream in = null;
                 ObjectOutputStream out = null;
                 int total = 0;
                 Nasabah Record = new Nasabah();
                 try {
                     in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\Nasabah.dat"));
                     out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\temp.dat"));
                     Object currentRecord = in.readObject();
                     try {
                         while (true) {
                             Record = (Nasabah) currentRecord;
                             out.writeObject(Record);
                             total++;
                             currentRecord = in.readObject();
                         }
                     } catch (EOFException e) {
                         System.out.println("Total Record " + total);
                         Scanner Input = new Scanner(System.in);
                         System.out.println("Norek : ");
                         Record.setNorek(Input.nextInt());
                         System.out.println("Pin : ");
                         Record.setPin(Input.nextInt());
                         System.out.println("Nama : ");
                         Record.setNama(Input.next());
                         Input.nextLine();
                         System.out.println("Saldo : ");
                         Record.setSaldo(Input.nextDouble());
                         out.writeObject(Record);
                         System.out.println("Norek : ");
                         Record.setNorek(Input.nextInt());
                        }
                        out.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                 System.out.println("========== Tahap 2 ==========");
                 try {
                     in = new ObjectInputStream(new FileInputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\temp.dat"));
                     out = new ObjectOutputStream(new FileOutputStream("D:\\LearnJava\\ProjectTransaksiBank\\src\\Tubes\\Nasabah.dat"));
                     Object currentRecord = in.readObject();
                     try {
                         while (true) {
                             Record = (Nasabah) currentRecord;
                             out.writeObject(Record);
                             total++;
                             currentRecord = in.readObject();
                         }
                     } catch (EOFException e) {
                         System.out.println("Total record " + total);
                     } catch (ClassNotFoundException e) {
                         System.out.println("Class not Found!");
                     } catch (IOException e) {
                         e.printStackTrace();
                     } finally {
                         in.close(); // Menutup ObjectInputStream
                         out.close(); // Menutup ObjectOutputStream di tahap kedua
                     }
                 } catch (ClassNotFoundException e) {
                     throw new RuntimeException(e);
                 } catch (IOException e) {
                     throw new RuntimeException(e);
                 }
             }





    public static void main(String[] args) throws IOException {
        FileNasabah f = new FileNasabah();
//   f.SaveToFile();
     f.BacaFileNasabah();
//     f.UpdateData();
//        f.TambahRecord();
    }
        }



