package com.compute.demo.dataStructure.array;

import java.util.LinkedList;

public class MyCircularQueue {
    public static void main(String[] args) {
        System.out.println(-1%3);
    }
    int size;
    int front=-1;
    int rear=-1;
    int[]container;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        container=new int[k];
        size=k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }else{
            rear=(rear+1)%size;
            container[rear]=value;

            return true;
        }
//        LinkedList


    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }else{
            front=(front+1)%size;
            return true;
        }

    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }else{
            return container[(front+1)%size];
        }
    }

    /** Get the last item from the queue. */
    public int Rear() {

        if(isEmpty()){
            return -1;
        }else{
            return container[rear];
        }
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front==rear;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (rear+1)%size==front;

    }
}