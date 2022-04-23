package com.company;

import java.util.LinkedList;

public class MyStack {
    LinkedList<Integer> MyList = new LinkedList<>();

    int last =0;
    public void push(int data){
        MyList.add(data);
        last++;
    }

    public LinkedList<Integer> getMyList() {
        return MyList;
    }
    public LinkedList<Integer> pop(){
        MyList.pop();
        return MyList;

    }
    public int last(){
        return MyList.getLast();
    }

    }

