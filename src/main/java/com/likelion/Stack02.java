package com.likelion;

public class Stack02 {

    private Integer[] arr;
    private int top;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        //this.arr[this.top++] = value; -> 이렇게 쓰는것 좋은 방법
        this.arr[this.top] = value;
        this.top++;
    }

    public int pop() {
        //return this.arr[--this.top]; -> 이렇게 쓰면 공간복잡도 낮아짐
        int value = this.arr[this.top-1];
        this.top--;
        return value;
    }
}
