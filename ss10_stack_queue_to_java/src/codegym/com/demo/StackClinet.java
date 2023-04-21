package codegym.com.demo;

public class StackClinet {
    public static void main(String[] args) throws Exception{
        MyStack myStack = new MyStack(5);
        myStack.push(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1); //pop 1
        System.out.println("1. Size of stack after push operations: " + myStack.size());
       System.out.println("Danh sách mảng :");
       for (int i = 0 ; i < myStack.size(); i++){
           System.out.print(myStack.get(i)+"\n");
       }
        System.out.printf("2. Pop elements from stack : ");
            System.out.printf(" %d" , myStack.pop());


        }



    }


