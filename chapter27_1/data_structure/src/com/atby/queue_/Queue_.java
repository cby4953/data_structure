package com.atby.queue_;

//模拟队列
public class Queue_ {

    private int max_size;

    private int front;

    private int real;

    private int[] array;

    private int length_;

    public Queue_(int max_size){
        this.max_size=max_size;
        array=new int[max_size];
        front=-1;
        real=-1;
        length_=0;
    }

    //添加元素
    public void addQueue(int i){

        if (length_==max_size){
            throw new RuntimeException("队列已满，无法添加元素");
        }else {
            array[++real]=i;
            length_++;
        }
    }

    //队列出列
    public int getQueue(){

        if(front==real){
            throw new RuntimeException("队列没有元素可以取出");
        }else {
            return array[++front];
        }
    }

    //显示所有元素(包括已出列元素)
    public void showQueue(){
        for (int i=0;i<=real;i++){
            if(i==real){
                System.out.print(array[i]+"");
            }else {
                System.out.print(array[i]+",");
            }
        }
    }

    //显示头部元素
    public int headQueue(){

        if (front==real){
            throw new RuntimeException("元素取光啦，没有头部元素啦!");
        }
        return array[front+1];

    }

    //显示尾部元素
    public int realQueue(){
        if (front==real){
            throw new RuntimeException("元素取光啦，没有尾部元素啦!");
        }
        return array[real];
    }


}
