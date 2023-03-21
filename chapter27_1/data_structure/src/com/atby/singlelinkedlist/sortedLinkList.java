package com.atby.singlelinkedlist;


import java.util.TreeSet;

//模拟单链表(排序)
public class sortedLinkList {

    private heroNode headNode=new heroNode(null,null);

    public void add(heroNode node){
        heroNode temp=headNode;
        if (headNode.getNext()==null){
            headNode.setNext(node);
        }else {
            while (temp.getNext() !=null){
                if (temp.getNext().getId()> node.getId()){
                    node.setNext(temp.getNext());
                    temp.setNext(node);
                    return;
                }else if(temp.getNext().getId() == node.getId()){
                    System.out.println(temp.getNext().getName()+"与"+node.getName()+"排名相同,"+node.getName()+"添加失败");
                    return;
                }else {
                    temp=temp.getNext();
                }
            }
            temp.setNext(node);
        }
    }

    public void delete(int i){
        heroNode temp=headNode;
        while (temp.getNext() != null){
            if (temp.getNext().getId() == i){
                //head,1,3,7
                if (temp.getNext().getNext()==null){
                    temp.setNext(null);
                }else {
                    temp.setNext(temp.getNext().getNext());
                    temp.getNext().setNext(null);
                }
                return;
            }else {
                temp=temp.getNext();
            }
        }
    }

    public void update(int old_,int new_){

    }

    public void show(){
        heroNode temp=headNode;
        if (temp.getNext()==null){
            System.out.println("链表为空!");
        }
        while (temp.getNext() !=null){
            System.out.println(temp.getNext());
            temp=temp.getNext();
        }
    }


}
