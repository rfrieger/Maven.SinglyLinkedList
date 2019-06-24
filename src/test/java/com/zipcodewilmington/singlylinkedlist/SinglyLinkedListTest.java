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

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void contains() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(5);
        singlyLinkedList.add(4);
        singlyLinkedList.add(7);

        Boolean actual = true;
        Boolean expected = singlyLinkedList.contains(4);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void copy() {
         SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(5);
        singlyLinkedList.add(4);
        singlyLinkedList.add(7);

        Boolean actual = singlyLinkedList.copy().contains(5);
        Boolean expected = singlyLinkedList.contains(5);
        Assert.assertEquals(expected,actual);

        Boolean actual1 = singlyLinkedList.copy().contains(4);
        Boolean expected1 = singlyLinkedList.contains(4);
        Assert.assertEquals(expected,actual);

        Boolean actual2 = singlyLinkedList.copy().contains(7);
        Boolean expected2 = singlyLinkedList.contains(7);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sort() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(5);
        singlyLinkedList.add(4);
        singlyLinkedList.add(7);



        Integer actual = singlyLinkedList.copy().find(5);
        Integer expected = 1;
        Assert.assertEquals(expected,actual);

        Integer actual1 = singlyLinkedList.copy().find(4);
        Integer expected1 = 0;
        Assert.assertEquals(expected,actual);

        Integer actual2 = singlyLinkedList.copy().find(7);
        Integer expected2 = 2;
        Assert.assertEquals(expected,actual);
    }
}