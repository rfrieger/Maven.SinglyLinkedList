package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void add() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);

        Integer actual = singlyLinkedList.size;
        Integer expected = 2;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void remove() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);
        singlyLinkedList.remove(6);

        Integer actual = singlyLinkedList.size;
        Integer expected = 1;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void size() {
    }
}