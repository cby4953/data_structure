package com.atby.queue_;

public class Queue_Test {
    public static void main(String[] args) {
        Queue_ queue_ = new Queue_(6);
        queue_.addQueue(4);
        queue_.addQueue(3);
        queue_.addQueue(6);
        queue_.addQueue(7);
        queue_.addQueue(0);
        System.out.println(queue_.getQueue());
        System.out.println(queue_.getQueue());
        System.out.println(queue_.getQueue());
        System.out.println(queue_.getQueue());
        System.out.println(queue_.getQueue());
    }
}
