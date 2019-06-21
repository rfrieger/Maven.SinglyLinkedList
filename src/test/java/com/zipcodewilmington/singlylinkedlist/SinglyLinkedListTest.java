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
    public void remove2() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);
        singlyLinkedList.add(6);
        singlyLinkedList.add(6);
        singlyLinkedList.add(6);
        singlyLinkedList.remove(6);

        Integer actual = singlyLinkedList.size;
        Integer expected = 4;

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void find() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(5);
        singlyLinkedList.add(4);
        singlyLinkedList.add(7);
        singlyLinkedList.add(3);

        Integer actual = 2;
        Integer expected = singlyLinkedList.find(4);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void size() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(5);
        singlyLinkedList.add(4);
        singlyLinkedList.add(7);

        Integer actual = 3;
        Integer expected = singlyLinkedList.size();
    }

    @Test
    public void contains() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(5);
        singlyLinkedList.add(4);
        singlyLinkedList.add(7);

        Boolean actual = true;
        Boolean expected = singlyLinkedList.contains(4);
    }
}