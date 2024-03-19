/*
 * Author : Lisvindanu
 */

package Latihan7;

public class ListMataKuliah {
    Node head;
    int position;
    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void displayElement() {
        if(head == null) {
            System.out.println("List Kosong");
        } else {
            Node curNode = head;
            while (curNode != null) {
                System.out.println( "Mata Kuliah : " + curNode.getData() );
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }

   public void addTail(Matakuliah data) {
        Node newNode = new Node(data);
        if(head == null) {
           head = newNode;
        } else {
            Node posNode = null;
            Node curNode = head;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void addMiddle(Matakuliah data, int position) {

        Node newNode = new Node(data);
        Node curNode;
        if(head == null) {
            head = newNode;
        } else {
            curNode = head;
            if(position == 1) {
                newNode.setNext(curNode);
                head = newNode;
            } else {
                int i = 1;
                while (i < position - 1 && curNode.getNext() != null) {
                    curNode = curNode.getNext();
                    i++;
                }
                newNode.setNext(curNode.getNext());
                curNode.setNext(newNode);
            }
        }
    }
}
