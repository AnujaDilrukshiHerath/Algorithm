
public class Stack {


    private int maxSize;

    private int top;

    private int stackArray[];


    public Stack(int max) {

        top = -1;

        maxSize = max;

        stackArray = new int[maxSize];

    }


    public boolean isEmpty() {

//    if (top == -1)

//      return true; // stack is empty

//    else

//      return false; // stack is not empty


        return (top == -1); // T or F

    }


    public boolean isFull() {

        return (top == maxSize - 1);

    }


    public void push(int x) {

        if (isFull()) {

            System.out.println("The stack is full");

        } else {

//      top++;

//      stackArray[top] = x;


            stackArray[++top] = x;

        }

    }


    public int pop() {

        if (isEmpty()) {

            System.out.println("Stack is empty");

            return -1;

        } else {

            return stackArray[top--];

        }

    }


    public int peek() {

        if (isEmpty()) {

            System.out.println("Stack is empty");

            return -1;

        } else {

            return stackArray[top];

        }

    }
}
