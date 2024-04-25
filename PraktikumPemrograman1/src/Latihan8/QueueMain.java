/*
 * Author : Lisvindanu
 */

package Latihan8;

public class QueueMain {
    public static void main(String[] args) {
//        StrukturQueue strukturQueue = new StrukturQueue();
//        System.out.println("TUGAS 4");
//        System.out.println("### sebelum enque 3x ###");
//        System.out.println("size : " +  + strukturQueue.size());
//        System.out.println("isEmpty : " +  strukturQueue.isEmpty());
//        System.out.println();
//        strukturQueue.enqueue(3);
//        strukturQueue.enqueue(3);
//        strukturQueue.enqueue(3);
//        System.out.println("### enqueue 3x ###");
//        strukturQueue.displayWithOutQueueElement();
//        System.out.println();

        StrukturQueue strukturQueue1 = new StrukturQueue();
        System.out.println("Tugas 5");
        System.out.println("### Sebelum enqueue 4x ###");
        strukturQueue1.displayWithQueueElement();

        System.out.println();
        System.out.println("### enqueue 4x ###");
        strukturQueue1.enqueue(2);
        strukturQueue1.enqueue(7);
        strukturQueue1.enqueue(6);
        strukturQueue1.enqueue(1);
        strukturQueue1.displayWithQueueElement();

    }
}
