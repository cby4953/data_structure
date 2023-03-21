package com.atby.singlelinkedlist;

//模拟单链表(不排序)
public class linkList {

    heroNode headNode=new heroNode(null,null);

    public linkList() {
    }

    public void add(heroNode node){

        heroNode temp=headNode;
        while (temp.getNext() != null){
            temp=temp.getNext();
        }

        temp.setNext(node);
    }

    public void show(){

        if (headNode.getNext() == null){
            System.out.println("链表为空");
        }else {
            heroNode temp=headNode.getNext();
            while (temp != null){
                System.out.println(temp);
                temp=temp.getNext();
            }
        }
    }
}
