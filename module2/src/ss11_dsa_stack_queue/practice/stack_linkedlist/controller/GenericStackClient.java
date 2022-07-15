package ss11_dsa_stack_queue.practice.stack_linkedlist.controller;

import ss11_dsa_stack_queue.practice.stack_linkedlist.model.MyGenericStack;

public class GenericStackClient extends MyGenericStack {

    public static void main(String[] args) {
        System.out.println("1. Stack of Strings");
        stackOfIStrings();

        System.out.println("\n2. Stack of integers");
        stackOfIntegers();
    }
}
