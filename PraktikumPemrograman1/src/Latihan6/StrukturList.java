/*
 * Author : Lisvindanu
 */

/*
 * Author : Lisvindanu
 */

package Latihan6;

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



    public boolean isEmpty() {
        return head == null;
    }
    public void dispose(Node node){

    }
    public void removeMid(int target) {
        Node preNode = new Node(0), tempNode;
        int i;
        boolean ketemu;

        if(isEmpty()) {
            System.out.println("Element list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = head;
            while (tempNode.getNext() != null && !ketemu) {
                if(tempNode.getData() == target) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }
            if(ketemu == true) {
                if(i == 1) {
                    head = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                    dispose(tempNode);
                }
            }
        }
    }
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node temp = head;
            head = head.getNext();
            dispose(temp);
        }
    }

    public void removeTail() {
        Node preNode = null, lastNode;
        if(head != null) {
           if(head.getNext() == null) {
               head = null;
               System.out.println("list kosong");
           } else {
               lastNode = head;
               while(lastNode.getNext() != null) {
                   preNode = lastNode;
                   lastNode = lastNode.getNext();
               }preNode.setNext(null);
               dispose(lastNode);

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

    public boolean find(int x) {
        Node curNode = head;
        boolean ketemu = false;
        while (curNode != null && !ketemu) {
            if (curNode.getData() == x) {
                ketemu = true;
            } else {
                curNode = curNode.getNext();
            }

        }
        return ketemu;
    }

    public int size() {
        Node curNode = head;
        int jumlah = 0;

        while(curNode != null) {
            jumlah = jumlah + 1;
            curNode = curNode.getNext();
        }
        return jumlah;
    }

//    public void removeAll(){
//        Node curNode;
//        if(head != null) {
//            curNode = head;
//            while (curNode != null) {
//                Node posNode = curNode.getNext();
//                dispose(curNode);
//                curNode = posNode;
//            }
//            head = null;
//            System.out.println("List Kosong");
//        }
//    }

    public void removeSemua() {
        while(head != null) {
            removeTail();
        }
    }

}
