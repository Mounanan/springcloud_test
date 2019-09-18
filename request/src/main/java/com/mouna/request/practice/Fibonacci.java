package com.mouna.request.practice;

public class Fibonacci {

//    private int count = 0;

    public Integer next(int count){
        return fib(count);

    }
    public int fib(int num){
        if(num < 2){
            return 1;
        }
        return fib(num - 1) + fib(num - 2);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 10; i++){
            System.out.println(gen.next(i));
        }

    }
}
