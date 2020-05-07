package com.compute.demo.dataStructure.linkedList;

public class Josepfu {

}
class CircleSingleLinkedList{
    private Node first=new Node(-1);
    public void addNode(int num){
        if(num<1){
            System.out.println("nums的值不正确");
        }
        Node cur=null;
        for(int i=0;i<num;i++){
            Node node=new Node(i);
            if(i==0){
                first=node;
                first.setNext(first);
                cur=first;
            }
            else{
                cur.setNext(node);
                node.setNext(first) ;
                cur=node;
            }
        }
    }
    public void josep(int startNo,int countNum,int nums){
        Node helper=first;
        while (helper.getNext()!=first){
            helper=helper.getNext();
        }
        for(int i=0;i<startNo-1;i++){
            first=first.getNext();
            helper=helper.getNext();
        }
        while (helper!=first){
            for(int i=0;i<countNum-1;i++){
                first=first.getNext();
                helper=helper.getNext();
            }
            System.out.printf("%d",first.getNo());
            first=first.getNext();
            helper.setNext(helper.getNext().getNext());

        }

    }
}

class Node{
    private int no;
    private Node next;

    public Node(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

