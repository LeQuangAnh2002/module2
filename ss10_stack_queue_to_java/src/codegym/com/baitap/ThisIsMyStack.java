package codegym.com.baitap;

public class ThisIsMyStack {
    private int arr[];
    private int index = 0;
    private int size;

    public ThisIsMyStack() {

    }

    public ThisIsMyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int elements){
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index++] = elements;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
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
}
