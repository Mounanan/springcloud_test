package com.mouna.request.practice;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private Class[] types = {Latte.class, Mocha.class};

    private static Random rand = new Random(2);

    public CoffeeGenerator() {}

    private int size = 0;

    public CoffeeGenerator(int sz){
        size = sz;
    }

    public Coffee next(){
        try {
            return (Coffee) types[rand.nextInt(2)].newInstance();
        } catch (Exception e){
            throw new RuntimeException();
        }
    }

    public Iterator<Coffee> iterator() {
        return null;
    }

    class CoffeeIterator implements Iterator<Coffee>{

        int count = size;

        public boolean hasNext(){
            return count > 0;
        }
        public Coffee next(){
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 2; i++){
            System.out.println(gen.next());
        }
        for (Coffee c : new CoffeeGenerator(2)){
            System.out.println(c);
        }
    }
}
