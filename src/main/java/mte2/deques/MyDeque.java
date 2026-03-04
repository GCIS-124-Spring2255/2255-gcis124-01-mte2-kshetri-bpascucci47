// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Iterator;

public class MyDeque<E> implements Deque<E> {
    
    private final LinkedList<E> list;
    private int size;
    public MyDeque() {    list = new LinkedList<>();    }

    // ... for enqueueFront ...
    public void enqueueFront(E element){
        list.add(0, element);
        size++;
    }
    
    // ... for enqueueBack ...
    public void enqueueBack(E element){
        list.add(size, element);
        size++;
    }
    
    // ... for dequeueFront ...
    public E dequeueFront(){
        E value = list.getFirst();
        list.set(0, null);
        size--;
        return value;
    }
    
    // ... for dequeueBack ... 
    public E dequeueBack(){
        E value = list.getLast();
        list.set(size-1, value);
        size--;
        return value;
    }
    // ... for size ...
    public int size(){
        return size;
    }
    // ... for iterator ...
    public Iterator<E> iterator(){
        return new Iterator<E>() {
            int current = 0;
            public boolean hasNext(){
                return current<size;
            }
            public E next() throws NoSuchElementException{
                current++;
                return null;
            }
        };
    }


    public static void main(String[] args) { 

        // ...
    }
}