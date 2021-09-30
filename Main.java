package com.torryharris.mainpack;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	    // Doubly linked list
        //Duplicates are allowed
        // Each mode holds the data and and also link(address) which points to next node in the list
        // iterators: list iterator can be used
        // add in beg, between and nodes can be added or removed

        List<String> l1 = new LinkedList<String>();
        l1.add("apple");
        l1.add("orange");
        l1.add("grapes");

        System.out.println("is empty?"+l1.isEmpty());
        System.out.println("contains graphes?"+l1.contains("graphes"));

        ListIterator<String> it = l1.listIterator();
        System.out.println("in forward direction:");
        while (it.hasNext())
        {
            System.out.println(it.hasNext()+"  ");

        }
        System.out.println("printing in backword direction");
        while (it.previous())
        {
            System.out.println(it.previous() + "  ");
        }
        System.out.println();

    }
}
