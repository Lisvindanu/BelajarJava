/*
 * Author : Lisvindanu
 */

package Latihan8;

public class StrukturQueue {
    Node head;
    private Node FRONT, REAR;
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }
        public boolean isEmpty() {
            return FRONT == null && REAR == null;
        }

    public int dequeue() {
        Node temp;
        int dequeueItem = Integer.MIN_VALUE;
        if(FRONT != null) {
            if (FRONT == REAR) {
                dequeueItem = FRONT.getData();
                FRONT = null;
                REAR = null;
            } else {
                temp = FRONT;
                dequeueItem = temp.getData();
                FRONT = FRONT.getNext();
                temp = null;
            }
        }
        return dequeueItem;
    }

    public void dequeue2 () {
        if (isEmpty()) {
            System.out.println("Data Masih Kosong");
        } else {
            Node tempFRONT = FRONT;
            FRONT = FRONT.getNext();
            REAR = null;
            tempFRONT = null;

        }
    }
    public void displayWithQueueElement() {
        if(FRONT == null) {
            System.out.println("Size: " + size());
            System.out.println("isEmpty: " + isEmpty());
            System.out.println("Queue kosong!!!");
            return;
        } else {
            Node curNode = FRONT;
            System.out.println("Size: " + size());
            System.out.println("isEmpty: " + isEmpty());
            System.out.println("Front : " + front());
            System.out.print("Elemen queue: ");
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
        }
    }
 public void displayWithOutQueueElement() {
        if(FRONT == null) {
            System.out.println("Queue kosong!!!");
        } else {
            Node curNode = FRONT;
            System.out.println("Size: " + size());
            System.out.println("isEmpty: " + isEmpty());
            System.out.println("Front : " + front());

        }
    }



}
