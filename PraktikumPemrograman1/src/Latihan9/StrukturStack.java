/*
 * Author : Lisvindanu
 */

package Latihan9;

public class StrukturStack {

    private int[] array;
    private int capacity, TOP;
    public final int MIN = -1;
    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }
    public boolean isEmpty() {
        return (TOP == MIN);
    }
    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack Penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    public boolean isFull() {
        if(TOP >= capacity) {
            return true;
        } else  {
            return false;
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack Kosong");
            return -1;
        } else {
           int temp = array[TOP];
           TOP = TOP - 1;
           return temp;
        }
    }

    public int size() {
        return TOP + 1;
    }


    public void display() {
        System.out.println("Size : " + size());
        System.out.println("Empty : " + isEmpty());
        System.out.println("Full : " + isFull());
        if(!isEmpty()) {
            System.out.println("Top : " + array[TOP]);
        }
        System.out.println("Element From Top : ");
        int i = TOP;
        while (i > 0) {
            System.out.print(array[i] + ", ");
            i--;
        } if (i == 0) {
            System.out.println(array[i]);
        }
        }
    }

