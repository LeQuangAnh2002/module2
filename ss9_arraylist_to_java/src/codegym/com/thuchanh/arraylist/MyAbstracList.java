package codegym.com.thuchanh.arraylist;

import java.util.Iterator;

public class MyAbstracList<E> implements MyList{
    private int size = 0;

    protected MyAbstracList() {
    }
    protected  MyAbstracList(E[] object ){
        for (int i = 0 ; i < object.length; i++){
            add(object[i]);
        }
    }

    @Override
    public void add(Object o) {
        add(size,o);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object remove(int index) {
        if(indexOf(e) )
    }

    @Override
    public int size() {
        return size;
    }
}
