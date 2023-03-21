package com.atby.annular_queue;

public class AnnularQueueTest {
    public static void main(String[] args) {

        AnnularQueue annularQueue = new AnnularQueue(4);
        annularQueue.addQueue(10);
        annularQueue.addQueue(20);
        annularQueue.addQueue(30);
        System.out.println(annularQueue.getQueue());
        annularQueue.showQueue();
        annularQueue.addQueue(30);
        System.out.println();
        annularQueue.showQueue();
        annularQueue.addQueue(70);
        System.out.println("队列头部");
        System.out.println(annularQueue.headQueue());
        annularQueue.getQueue();
        annularQueue.getQueue();
        annularQueue.getQueue();
        annularQueue.showQueue();
    }
}
