package codegym.com.baitap.arraylist;

import java.util.Iterator;

public class MyList<E> implements MyListImplements<E> {
    private int size = 0;
    static final  int DEFAULT_CAPACITY = 10;

    private  Object  elements[];

    public MyList() {

        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    private E[] data = (E[]) new Object[DEFAULT_CAPACITY];

    @Override
    public void add(E e) {
        if(size == elements.length){
            ensureCapacity();
        }
        elements[size++] = e;
    }

    @Override
    public void display() {
        for (int i = 0; i < size() ; i++){

        }
    }

    @Override
    public void add(int index, E element) {
        ensureCapacity();
        for (int i = size -1 ; i >= index; i--){
           elements[i+1] = elements[i];
            elements[index] = element;
           size++;
        }
    }
    private void ensureCapacity(){
        if(size >= data.length){
            E[] newData = (E[]) (new Object[size*2 +1]);
            System.arraycopy(data,0,newData,0,size);
            data = newData;
        }
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E e = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
//        data[size - 1] = null;
        size--;
        return e;
    }

    public void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }

    }
    @Override
    public int size() {
        return this.size;
    }


    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


    @Override
    public boolean contains(E o) {

        for (int i = 0; i < size ; i++){
            if(o.equals(data[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E o) {
        for (int i =0 ; i < elements.length ; i++){
            if(o.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }

//    @Override
//    public boolean add(E o) {
//        return false;
//    }


    @Override
    public E get(int index) {
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index:" + index +", size "+ index);
        }
        return (E) elements[index];
    }

    @Override
    public void clear() {
        data = (E[])new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
