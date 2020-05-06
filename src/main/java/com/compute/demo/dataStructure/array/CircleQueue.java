package com.compute.demo.dataStructure.array;

import java.util.Random;

public class CircleQueue {
    public static void main(String[] args) {
        CircleQueue circleQueue = new CircleQueue(50);
        while (!circleQueue.isFull()) {
            circleQueue.addQueue(new Random().nextInt(55));
        }
        System.out.println("end");

    }

    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public CircleQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = 0;//指向队列第一个元素
        rear = 0;//指向队列最后一个元素后的一个位置
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int n) {
        if (isFull()) {
            return;
        }

        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空");
        }

        int result = arr[front];
        front = (front + 1) % maxSize;
        return result;
    }

    public void list() {
        for (int i = front; i < front + size(); i++) {
            System.out.println(i % maxSize + " " + arr[i % maxSize]);
        }
    }

    public int size() {
        return (rear + maxSize - front) % maxSize;
    }
}
