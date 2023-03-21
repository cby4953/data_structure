package com.atby.singlelinkedlist;

public class Test {
    public static void main(String[] args) {

        heroNode hero01 = new heroNode(1, "公孙离");
        heroNode hero02 = new heroNode(10, "妲己");
        heroNode hero05 = new heroNode(5, "李星云");
        heroNode hero03 = new heroNode(7, "狂澜");
        heroNode hero04 = new heroNode(5, "孙尚香");

//        linkList linklist = new linkList();
//        linklist.add(hero01);
//        linklist.add(hero02);
//        linklist.add(hero03);
//
//        linklist.show();

        sortedLinkList sortedLinkList = new sortedLinkList();
        sortedLinkList.add(hero01);
        sortedLinkList.add(hero02);
        sortedLinkList.add(hero05);
        sortedLinkList.add(hero03);
        sortedLinkList.add(hero04);

        sortedLinkList.show();
        sortedLinkList.delete(7);
        System.out.println("---------");
        sortedLinkList.update(10,"若离");
        sortedLinkList.show();
        sortedLinkList.update(11,"若云");
        sortedLinkList.show();

    }
}
