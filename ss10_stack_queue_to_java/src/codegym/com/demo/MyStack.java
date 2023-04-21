package codegym.com.demo;

public class MyStack {
   private int[] array;
   private int size;
   private int index=0;

    public MyStack() {

    }

    public MyStack(int size) {
        this.size = size;
        array = new int[size];

    }
    public void push(int element){
            if (isFull()){
                throw  new StackOverflowError("Stack is full");
            }else {
                array[index++] = element;
            }
    }

    public int pop() throws Exception{

        if(isEmpty()){
            throw new Exception("Stack is null");
        }
        return array[--index];

    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        if(index < 1 ){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(index == size){
            return true;
        }
        return false;
    }
    public int get(int index){
        return array[index];
    }
}
