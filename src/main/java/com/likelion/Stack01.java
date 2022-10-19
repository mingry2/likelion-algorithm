package com.likelion;

public class Stack01 {

    private int[] arr = new int[10000];
    private int pointer = 0; // -1 은 비어있는 상태

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.arr[this.pointer] = value;
        this.pointer ++;
    }

    public int[] getArr(){
        return arr;
    }
}
