package com.atby.annular_queue;

//数组模拟循环队列
public class AnnularQueue {

    private int maxSize;

    private int[] array;

    private int front;

    private int rear;

    public AnnularQueue(int size){

        this.maxSize=size;
        array=new int[size];
        front=0;
        rear=0;
    }

    public boolean isFull(){

        boolean b = (rear+1)%maxSize==front%4;
        return b;
    }

    public boolean isEmpty(){
        boolean b = rear==front;
        return b;
    }

    public void addQueue(int i){

        if(isFull()){
            System.out.println("队列已满，无法添加");;
        }else {
            array[rear%maxSize]=i;
            rear++;
        }
    }

    public int getQueue(){

        if(isEmpty()){
            throw new RuntimeException("队列为空，无法取出数据");
        }else {
            return array[front++];
        }
    }

    public void showQueue(){

        int i=front;
        if (front==rear){
            System.out.println("队列为空");
        }else {
            while (i<rear){
                System.out.print(array[i%4]+"\t");
                i++;
            }
        }
    }

    public int headQueue(){
         if (isEmpty()){
             throw new RuntimeException("队列为空，没有头部数据");
         }else {
             return array[front%maxSize];
         }
    }


}
