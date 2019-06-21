package com.zipcodewilmington.singlylinkedlist;

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

    public Integer size() {
        return this.size;
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
}
}
