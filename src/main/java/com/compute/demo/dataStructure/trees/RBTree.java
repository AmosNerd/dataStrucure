package com.compute.demo.dataStructure.trees;

public class RBTree<T extends Comparable<T>> {
    private RBNode<T> root;

    private static class RBNode<T> {
        public RBNode<T> parent;
        public T value;
        public RBNode<T> left;
        public RBNode<T> right;
        public Boolean isRed;

        public RBNode(RBNode<T> parent, T value, RBNode<T> left, RBNode<T> right, Boolean isRed) {
            this.parent = parent;
            this.value = value;
            this.left = left;
            this.right = right;
            this.isRed = isRed;
        }
    }

    /**
     * 对子树进行左旋
     *
     * @param root 需要左旋的子树的根节点
     */
    private void leftRotate(RBNode<T> root) {
        RBNode<T> rightChild = root.right;
        //这里及时孙节点是null也要指向它，否则right仍会指向rightChild
        root.right = rightChild.left;
        if (rightChild.left != null) {
            rightChild.left.parent = root;
        }
        //把右子树的parent指向子树根的parent
        rightChild.parent = root.parent;
        //代替原子树根
        if (root.parent != null) {
            if (root.parent.left == root)
                root.parent.left = rightChild;
            else
                root.parent.right = rightChild;
        } else {
            this.root = rightChild;
        }
        //把原子树根放到新根的左面
        rightChild.left = root;
        root.parent = rightChild;
    }

    private void rightRotate(RBNode<T> root) {
        RBNode<T> leftChild = root.left;
        root.left = leftChild.right;
        if (leftChild.right != null) {
            leftChild.right.parent = root;
        }
        leftChild.parent = root.parent;
        if (root.parent != null) {
            if (root.parent.left == root) {
                root.parent.left = leftChild;
            } else root.parent.right = leftChild;
        } else
            this.root = leftChild;
        leftChild.right = root;
        root.parent = leftChild;
    }

    public void insert(T value) {
        RBNode<T> node = new RBNode<T>(null, value, null, null, true);
        insert(node);

    }

    private void insert(RBNode<T> node) {
        RBNode<T> currentNode = this.root;
        if (this.root == null) {
            this.root = node;
            return;
        }
        while (true) {
            int cmp = node.value.compareTo(currentNode.value);
            if (cmp < 0) {
                if (currentNode.left != null) {
                    currentNode = currentNode.left;
                } else {
                    currentNode.left = node;
                    break;
                }
            } else {
                if (currentNode.right != null) {
                    currentNode = currentNode.right;
                } else {
                    currentNode.right = node;
                    break;
                }
            }

        }
    }

    private void insertFixUp(RBNode<T> node) {
        RBNode<T> parent, gParent;
        //父节点是红色
        while ((parent = node.parent) != null && parent.isRed) {
            gParent = parent.parent;
            //这里不需要判断是否存在祖父节点，因为根节点是黑的
//            if(gParent!=null)
            //当父节点是祖父节点右节点
            if (parent == gParent.left) {
                //如果叔节点是红色的
                /**
                 * 在父节点和叔节点都是红色的时候，把他俩都涂黑，并且把祖父节点涂黑；
                 * 因为此时祖父节点和它的父节点都变成红色，这时以祖父节点为当前节点，往上变色
                 */
                RBNode<T>uncle=gParent.right;
                if((uncle!=null)&&uncle.isRed){
                    uncle.isRed=false;
                    parent.isRed=false;
                    gParent.isRed=true;
                    node=gParent;
                    continue;
                }
                //叔叔节点是黑色，而且当前节点是右孩子
                if(parent.right==node) {
                    RBNode<T> tmp;
                }

            }


        }


    }
}
