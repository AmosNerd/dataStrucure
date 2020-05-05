package com.compute.demo.dataStructure.trees.avlTree;

public class AvlTree<T extends Comparable<T>>{
    public static class AvlNode<T>{
        AvlNode(T element){
            this(element,null,null);
        }
        AvlNode(T element,AvlNode<T> left,AvlNode<T> right){
            this.element=element;
            this.left=left;
            this.right=right;
        }
        T element;
        AvlNode<T> left;
        AvlNode<T> right;
        int height;

    }
    private int height(AvlNode<T> t){
        return t==null?-1:t.height;
    }
    //右旋一次并返回根部
    private AvlNode<T> rotateWithLeftChild(AvlNode<T> k2){
        AvlNode<T>k1=k2.left;
        k2.left=k1.right;
        k1.right=k2;
        k2.height=Math.max(k2.left.height,k2.right.height)+1;
        k1.height=Math.max(k1.left.height,k2.height)+1;
        return k1;
    }
    private AvlNode<T>rotateWithRightChild(AvlNode<T> k1){
            return null;
    }

    public static void main(String[] args) {
       int a= 0x2d;
       int b=067575;
    }
}
