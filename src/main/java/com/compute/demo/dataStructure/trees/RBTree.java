package com.compute.demo.dataStructure.trees;

/**
 * 序号${}
 *
 * @author menggy
 * @date 2020/5/5 8:39
 */
public class RBTree<T> {
    private static class RBNode<T> {
        public T value;
        public RBNode<T> parent;
        public RBNode<T> left;
        public RBNode<T> right;
        public RBNode<T> isRed;

    }

}
