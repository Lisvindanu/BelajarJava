/*
 * Author : Lisvindanu
 */

package Latihan4;

public class StrukturList {
    Node head; //node pertama dalam list
    int position;

    void addTail (double data) {
        // method untuk menambahkan node baru ke akhir list
        Node newNode = new Node(data); //objek newNode yang merujuk pada Class Node dengan parameter yang diambil itu data
        if(head == null) {
            //kalau list kosong
            head = newNode; // Node baru = node pertama
        } else {
            //kalau list sudah ada nilai
            Node posNode = null; //menyimpan node sebelumnya saat looping
            Node curNode = head; //variable untuk looping, dimulai dari node pertama

            while(curNode != null) {
                posNode = curNode; //menyimpan node saat ini sebagai node sebelumnya. contoh list 1 -> 2 -> 3, misal node
                // yang ada cuman 1 -> 2, trus mau nambah node list baru ->3, nah, pos node nya itu 2, yang berubah jadi current node. setelah itu
                curNode = curNode.getNext(); //node gerak ke node berikutnya menggunakan getter si current node yang di
                // contoh itu nilainya 2, bakal gerak ke 3 dan si 3 bakal jadi pos node dan cur node selama belum ada node baru lagi
            }
            posNode.setNext(newNode); // menambah node baru setelah node terakhir dengan setter
        }
    }

    void addHead(double data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    void addMiddle(double data, int position) {
        Node curNode;
        Node newNode = new Node(data);
        if (head == null ) {
            head = newNode;
        } else {
             curNode = head;
            if(position == 1) {
             newNode.setNext(curNode);
             head = newNode;
        } else {
                int i = 1;
                while (i < position - 1 && curNode.getNext() != null ) {
                    curNode = curNode.getNext();
                    i++;
                }
                newNode.setNext(curNode.getNext());
                curNode.setNext(newNode);
            }

        }

    }

    public void displayElement() {
        Node curNode = head;
        while(curNode != null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }

}
