package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
        In Normal Linked List the Last Node Points to Null
        But in Circular Linked List the last Node points Back to the First Node Which is the Head
         */


        Circular circular  = new Circular();

        circular.addFirst(13);
        circular.addFirst(99);
        circular.addFirst(16);
        circular.addFirst(12);

        circular.delete(99);
        circular.delete(16);
        circular.delete(12);




        System.out.println(circular.search(1023));

        circular.print();

    }
}
