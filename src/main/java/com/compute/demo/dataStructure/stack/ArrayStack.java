package com.compute.demo.dataStructure.stack;

public class ArrayStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack=new int[maxSize];
    }
    public boolean isFull(){
        return maxSize==top+1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(int value){
        if(!isFull()){
            top++;
            stack[top]=value;
        }
    }
    public int pop(){
        if(!isEmpty()){
         int val=stack[top];
         top--;
         return val;
        }else {
            throw new  RuntimeException();
        }
    }
    public void list(){
        if(!isEmpty()){
            for (int i=top;i>-1;i--){
                System.out.println(stack[i]);
            }
        }
    }

}
