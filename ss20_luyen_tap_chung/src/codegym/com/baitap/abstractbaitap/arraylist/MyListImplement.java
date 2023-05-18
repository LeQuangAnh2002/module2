package codegym.com.baitap.abstractbaitap.arraylist;




public interface MyListImplement<E> extends Iterable {
    public void add(int index , E element);
    public E remove(int index);
    public int size();
    public E clone();
    public boolean contains(E e);
    public int indenOf(E e);
    public void ensureCapacity(int minCapacity);
    public E get(int i);
    public void clear();


}
