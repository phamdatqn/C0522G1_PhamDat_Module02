package ss10_dsa_list.practice.simple_linkerlist_class.controller;

import ss10_dsa_list.practice.simple_linkerlist_class.model.MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(11,17);
        ll.add(4,9);
        ll.add(4,15);
        ll.printList();
    }

}
