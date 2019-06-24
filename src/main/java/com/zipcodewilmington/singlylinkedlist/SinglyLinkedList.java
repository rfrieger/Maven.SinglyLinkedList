package com.zipcodewilmington.singlylinkedlist;

import sun.awt.image.ImageWatched;

import java.security.PublicKey;
import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    Node head;
    Node tail;
    int size = 0;

    public void add(Integer info) {
        size++;
        if (head == null) {
            head = new Node(info, null, null);
            tail = head;
        } else {
            Node node = new Node(info, head, null);
            this.head.prev = node;
            this.head = node;
        }
    }

    public void remove(Integer info) {

        if (head != null) {
            size--;
            if (tail.prev != null) {
                tail.prev.next = null;
                tail = tail.prev;
            } else {
                head = null;
                tail = null;
            }
        }
    }

    public Integer find(Integer num) {

        int index = 0;
        if (num == null) {
            for (Node x = head; x != null; x = x.next) {
                if (x.getInfo() == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (num.equals(x.getInfo())) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    public Integer size() {
        return this.size;
    }


    public Boolean contains(Integer num) {

        Integer result = this.find(num);

        if (result == -1) {
            return false;
        }
        return true;
    }


    public SinglyLinkedList copy(){
        SinglyLinkedList newList = new SinglyLinkedList();
        Node node = head;
        while(node != null) {
            newList.add( node.getInfo());
            node = node.getNext();

        }

        return newList;
    }

    public SinglyLinkedList sort() {

        for (int i = 0; i < this.size; i++) {
//            while(head.next != null) {
//                if (this.head this.head.next) {
//                    Node temp;
//                    temp = this.head.next;
//                    head.next = head;
//                    head = temp;
//                }
//            }
        }
        return this.copy();
    }



    public class Node {
        private Node next;
        private Node prev;
        private Integer data;

    public Node(Integer data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public void setInfo(Integer data) {
        this.data = data;
    }

    public void setNext(Node node) {
        next = node;
    }

    public void setPrev(Node node) {
        prev = node;
    }

    public Integer getInfo() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

//
    }
}
