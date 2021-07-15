
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * 5SENG001W Algorithms
 * Week 8
 * Tutorial Exercises: Heaps
 */

//package heap;

import java.util.EmptyStackException;

/**
 *
 * @author klaus
 */
public class Heap {
    int[] items;

    public static final int INITIAL_CAPACITY = 1000;

    int size;

    public Heap(){
        items = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public static int parentIndex(int index){
        return (index - 1) / 2;
    }

    public static int leftChildIndex(int index){
        return 2 * index + 1;
    }

    public static int rightChildIndex(int index){
        return 2 * index + 2;
    }

    public void insert(int newItem){
        if(size == items.length){  // need to grow
            int[] temp = new int[2*size];
            System.arraycopy(items, 0, temp, 0, size);
            items = temp;
        }
        // Determine position for insertion:
        // begin at index==size, then sift up, pushing bigger elements down
        int index = size;
        while(index > 0){
            int parent = parentIndex(index);
            if(items[parent] > newItem){
                items[index] = items[parent];
                index = parent;
            }
            else
                break;
        }
        items[index] = newItem;
        size++;
    }

    public boolean empty(){
        return (size == 0);
    }

    public int getMinimum(){
        if(empty())
            throw new EmptyStackException();
        return items[0];
    }

    public int extractMinimum(){
        if(empty())
            throw new EmptyStackException();
        int result = items[0];
        // determine position to re-insert items[size-1]:
        // begin at index==0, then sift down, pulling elements up
        int index = 0, child = 1;
        size--;
        while(child < size){
            // at this point, child is the left child of index;
            // pick the right child instead if it exists and has a smaller value
            if((child+1 < size) && (items[child] > items[child+1]))
                child++;
            if(items[child] < items[size]){
                items[index] = items[child];
                index = child;
                child = leftChildIndex(index);
            }
            else
                break;
        }
        items[index] = items[size];
        return result;
    }

    public void printItems(){
        System.out.print("Array representation: [ ");
        for(int i=0; i<size; i++)
            System.out.print(items[i] + " ");
        System.out.println("]");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Heap h = new Heap();
        int[] a = {6,3,7,4,2,8,1,5,0};
        for(int i : a){
            h.insert(i);
            System.out.println("Inserted " + i + ", minimum element is now " + h.getMinimum());
//            h.printItems();
        }
        while(!h.empty()){
            int m = h.extractMinimum();
            System.out.print("Extracted value " + m);
            if(h.empty())
                System.out.println(", heap is now empty");
            else
                System.out.println(", minimum element is now " + h.getMinimum());
//            h.printItems();
        }
    }

}
