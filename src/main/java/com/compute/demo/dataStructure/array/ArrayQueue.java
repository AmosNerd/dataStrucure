package com.compute.demo.dataStructure.array;

public class ArrayQueue {
    public static void main(String[] args) {

    }

    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;//指向头部的前一个位置。空的时候为-1；
        rear = -1;//指向队列尾部的数据；包含队列最后一个数据
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int n) {
        if (isFull()) {
            return;
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空");
        }
        front++;
        return arr[front];
    }
    public void list(){

    }

}
