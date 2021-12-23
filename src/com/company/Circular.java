package com.company;

import java.awt.*;

public class Circular {
     Node head;


     public Node getHead() {
          return head;
     }

     public void addFirst(int val){

          Node newNode = new Node(val);

          if(head == null){
               head = newNode;
               newNode.next = newNode;


          }else {

               Node last = head;

               while (last.next != head){

                    last = last.next;
               }

               last.next = newNode;
               newNode.next = head;
               head = newNode;
          }

     }


     public void addLast(int E){
          Node newNode = new Node(E);

          if(head == null){
               head = newNode;
               newNode.next = newNode;

          }else {
               Node last = head;

               while(last.next != head){
                    last = last.next;

               }
               last.next = newNode;
               newNode.next = head;

          }
     }


     public void print(){

          Node  temp = head;

          do{
               System.out.println(temp.data);
               temp = temp.next;
          }while(temp != head);
     }


     public boolean search(int E){

          if(head == null)
               return false;

          Node temp = head;

          do{
               if(temp.data == E){
                    return true;
               }

               temp = temp.next;


          }while(temp != head);

          return false;
     }


     public void delete(int E) {


          if(search(E) == true){





          }




     }

}
