//package com.company.normal;
//
//public class _622MyCircularQueue {
//    private int size = 0;
//    private int cap = 0;
//    private int[] circularQueue;
//    private int front;
//    private int rear;
//
//
//    public MyCircularQueue(int k) {
//        cap = k + 1;
//        circularQueue = new int[cap];
//        rear = 0;
//        front = 0;
//        size = 0;
//    }
//
//    public boolean enQueue(int value) {
//        if (isFull()) {
//            return false;
//        }
//        circularQueue[rear++] = value;
//        size++;
//        return true;
//    }
//
//    public boolean deQueue() {
//        if(isEmpty()){
//            return false;
//        }
//
//    }
//
//    public int Front() {
//
//    }
//
//    public int Rear() {
//
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    public boolean isFull() {
//        return size == cap;
//    }
//}
