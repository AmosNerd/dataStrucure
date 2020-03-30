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
    private AvlNode<T> rotateWithLeftChild(AvlNode<T> k2){
        
    }
}
