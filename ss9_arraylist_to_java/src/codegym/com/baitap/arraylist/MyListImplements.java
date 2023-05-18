package codegym.com.baitap.arraylist;


public interface MyListImplements<E> extends Iterable{
    public void add(E e);
    public void display();
    public void add(int index, E element);
    public E remove(int index);
    public  int size();

    public boolean contains(E o);
    public int indexOf(E o);
//    public boolean add(E o);

    public E get(int index);
    public void clear();



}
