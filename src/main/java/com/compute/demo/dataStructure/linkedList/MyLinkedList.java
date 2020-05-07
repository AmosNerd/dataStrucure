package com.compute.demo.dataStructure.linkedList;

import java.util.Stack;

public class MyLinkedList<T extends OrderByNo> {
    public static void main(String[] args) {
        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        MyLinkedList<TestClass> myLinkedList2 = new MyLinkedList<>();

        for (int i = 0; i < 5; i++) {
            myLinkedList.add(new TestClass(i));
        }
        for (int i = 0; i < 50; i++) {
            myLinkedList2.add(new TestClass(i + 20));
        }

//        myLinkedList.list();
//        myLinkedList.reverseNew().list();
        myLinkedList.reversePrint();
    }



    /**
     * 合并两个有序链表，使用递归。首先比较两个链表的头元素，如果一个链表的头元素小于另一个，则将这个头元素放在第一个位置，
     * 同时，在递归中。将这个链表的下一个头元素和另一个链表进行对比，并将结构放在第一个头元素的next中，直至两个链表的头元素都是null
     *
     * @param node1 第一个链表的头元素
     * @param node2 第二个链表的头元素
     * @return 返回较小的头元素
     */
    public MyLinkedNode<T> mergeList(MyLinkedNode<T> node1, MyLinkedNode<T> node2) {
        if (node2 == null)
            return node1;
        else if (node1 == null)
            return node2;
        else if (node1.element.getNo() < node2.element.getNo()) {
            node1.next = mergeList(node1.next, node2);
            return node1;
        } else {
            node2.next = mergeList(node1, node2.next);
            return node2;
        }

    }

    public MyLinkedNode<T> removeTop() {
        MyLinkedNode<T> result = null;
        if (head.next != null) {
            result = head.next;
            head.next = result.next;
        }
        return result;

    }

    public MyLinkedNode<T> getFirstElement() {
        return head.next;
    }

    private MyLinkedNode<T> head = new MyLinkedNode<>(null);

    private static class MyLinkedNode<T> {

        public MyLinkedNode<T> next;
        T element;

        public MyLinkedNode(T element) {
            this.element = element;
        }

    }

    public MyLinkedList() {

    }

    public void add(T element) {
        MyLinkedNode<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        //链表的最后
        temp.next = new MyLinkedNode<>(element);
    }

    public void orderAdd(T element) {
        MyLinkedNode<T> newNode = new MyLinkedNode<T>(element);
        MyLinkedNode<T> temp = head;
        while (temp.next != null) {
            if (temp.element.getNo().equals(element.getNo())) {
                throw new RuntimeException("Already exists");
            }
            if (temp.element.getNo() > element.getNo()) {
                break;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void update(T element) {
        if (head.next == null)
            System.out.println("Empty");
        MyLinkedNode<T> temp = head;
        Boolean flag = false;
        while (temp != null) {
            if (element.getNo().equals(temp.element.getNo())) {
                temp.element = element;
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (!flag) {
            System.out.println("Not found");
        }

    }

    public void list() {
        //判断是否为空
        if (head.next == null) {
            System.out.println("Empty");
        }
        MyLinkedNode<T> myLinkedNode = head.next;
        while (myLinkedNode != null) {
            System.out.println(myLinkedNode.element);
            myLinkedNode = myLinkedNode.next;
        }
    }

    public void remove(T element) {
        //判断是否为空
        if (head.next == null)
            System.out.println("Empty");
        MyLinkedNode<T> temp = head;
        Boolean flag = false;
        while (temp != null) {
            if (temp.next.element.getNo().equals(element.getNo())) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }

    public Integer count() {
        MyLinkedNode<T> temp = head.next;
        Integer count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;

    }

    //倒數第k个节点
    public T getReverseIndex(Integer index) {
        if (head.next == null)
            return null;
        Integer count = count();
        Integer targetIndex = count - index;
        if (targetIndex < 0) {
            return null;
        }
        MyLinkedNode<T> temp = head.next;
        for (int i = 0; i < targetIndex; i++) {
            temp = temp.next;
        }
        return temp.element;


    }

    public void reversePrint() {
        MyLinkedNode<T> node = head.next;
        Stack<T> stack = new Stack<>();
        while (node != null) {
            stack.add(node.element);
            node = node.next;
        }
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }

    public MyLinkedList<T> reverse() {
        MyLinkedList<T> result = new MyLinkedList<>();
        MyLinkedNode<T> temp = head.next;
        while (temp != null) {

            MyLinkedNode<T> newNode = new MyLinkedNode<>(temp.element);
            newNode.next = result.head.next;
            result.head.next = newNode;
            temp = temp.next;
        }
        return result;
    }

    public MyLinkedList<T> reverseNew() {

        MyLinkedNode<T> temp = head;

        MyLinkedNode<T> reverseHead = new MyLinkedNode<>(null);

        while (head.next != null) {

            MyLinkedNode<T> next = head.next.next;
            head.next.next = reverseHead.next;
            reverseHead.next = head.next;
            head.next = next;
        }
        head = reverseHead;
        return this;
    }


}

class TestClass implements OrderByNo {
    Integer no;

    @Override
    public Integer getNo() {
        return no;
    }

    public TestClass(Integer no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "no=" + no +
                '}';
    }
}

interface OrderByNo {
    Integer getNo();
}
