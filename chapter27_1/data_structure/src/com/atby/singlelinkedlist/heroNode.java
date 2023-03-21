package com.atby.singlelinkedlist;


public class heroNode {

    private Integer id;

    private String name;

    private heroNode next=null;

    @Override
    public String toString() {
        return "heroNode{" +
                "id=" + id +
                ", name='" + name + '\'';
    }

    public heroNode(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public heroNode getNext() {
        return next;
    }

    public void setNext(heroNode next) {
        this.next = next;
    }
}
