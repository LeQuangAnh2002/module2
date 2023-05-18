package codegym.com.baitap.abstractbaitap.arraylist;

import java.util.Iterator;

public class MyList<E> implements MyListImplement {
    private int size = 0;
    static  final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
     element = new Object[DEFAULT_CAPACITY];

    }


    @Override
    public void add(int index, Object element) {
            ensureCapacity(DEFAULT_CAPACITY);
            for (int i = 0 ; i < element.)

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E clone() {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int indenOf(Object o) {
        return 0;
    }

    @Override
    public void ensureCapacity(int minCapacity) {
            if(minCapacity > size || minCapacity < size){
                System.out.println("quá cở");
            }else{
                System.out.println("ko có trong mảng ");
            }
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public void clear() {

    }



    @Override
    public Iterator iterator() {
        return null;
    }
}
