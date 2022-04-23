package com.company;

import java.util.Scanner;
import java.util.LinkedList;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        MyStack ms = new MyStack();
        MyQueue mq = new MyQueue();
        MyHeap mh = new MyHeap();

        int n = scan.nextInt();
        for(int i = 0; i<n; i++){
            ms.push(scan.nextInt());
        }
        System.out.println("Stack: \n"+"First option is to show the entire list: " + ms.getMyList()
                +"\nSecond option is to delete the first element: " + ms.pop()
                + "\nThird option shows last number: " + ms.last());
    }

}
